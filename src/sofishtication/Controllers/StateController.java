/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sofishtication.Controllers;

import java.util.ArrayList;
import java.util.UUID;
import sofishtication.Models.JokeModel;
import sofishtication.Models.ProfileModel;
import sofishtication.Models.UserModel;

/**
 *
 * @author user-pc
 */
public class StateController {

    static UserModel userModel;
    static SQLController sqlCon = new SQLController();

    ;

    public static void initiate() {
        if (sqlCon.connect()) {

        }
    }

    public static void setUserModel(UserModel userModel) {
        StateController.userModel = userModel;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public static UserModel login(UserModel user) {
        if (sqlCon.getConnection()) {
            user = sqlCon.getUserQuery(user);
        }

        return user;
    }

    public static UserModel signup(UserModel user) {
        if (sqlCon.getConnection()) {
            user = sqlCon.postUserQuery(user);
        }

        return user;
    }

    public static ProfileModel getProfile(UUID id) {
        ProfileModel profile = null;
        if (sqlCon.getConnection()) {
            profile = sqlCon.getProfileQuery(id);
            for(int i = 0; i<profile.getJokeIds().size(); i++) {
                UUID jokeId = profile.getJokeIds().get(i);
                profile.addJoke(sqlCon.getJokeQuery(jokeId));
            }
        }

        return profile;
    }

    public static ProfileModel postProfile(ProfileModel profile) {
        ArrayList<UUID> ids = new ArrayList<>();
        ArrayList<JokeModel> jokes = new ArrayList<>();
        
        if (sqlCon.getConnection()) {
            for(int i = 0; i<profile.getJokes().size(); i++) {
                JokeModel joke = profile.getJokes().get(i);
                joke = sqlCon.postJokeQuery(joke);
                ids.add(joke.getId());
                jokes.add(joke);
            }
            profile = sqlCon.postProfileQuery(profile, ids);
            profile.setJokes(jokes);
        }

        return profile;
    }

    public static void killState() {
        sqlCon.disconnect();
        setUserModel(null);
    }

}
