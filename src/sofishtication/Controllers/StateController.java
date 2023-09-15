/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sofishtication.Controllers;

import java.util.ArrayList;
import java.util.UUID;
import sofishtication.Models.UserModel;
import sofishtication.Models.UserProfileModel;

/**
 *
 * @author user-pc
 */
public class StateController {

    static private UserModel userModel;
    static private boolean loggedIn;
    
    static private UserProfileModel profile;
    
    static private SQLController sqlCon = new SQLController();


    public static void initiate() {
        if (sqlCon.connect()) {
            System.out.println("Connection established...");
        }
    }

    public static void setUserModel(UserModel userModel) {
        StateController.userModel = userModel;
    }

    public static UserModel getUserModel() {
        return userModel;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static UserProfileModel getUserProfile() {
        return profile;
    }

    public static UserModel login(UserModel user) {
        if (sqlCon.getConnection()) {
            user = sqlCon.getUserQuery(user);
            
            UserProfileModel profile = sqlCon.getUserProfileQuery(user.getId());
            
            user.setUserProfile(profile);
            profile.setUser(user);
            
            loggedIn = true;
            setUserModel(user);
        }

        return user;
    }

    public static UserModel signup(UserModel user) {
        if (sqlCon.getConnection()) {
            user = sqlCon.postUserQuery(user);
            
            UserProfileModel profile = new UserProfileModel(user);
            profile = sqlCon.postUserProfileQuery(profile);
            
            user.setUserProfile(profile);
            profile.setUser(user);
            
            loggedIn = true;
            setUserModel(user);
        }

        return user;
    }

    public static void killState() {
        sqlCon.disconnect();
        setUserModel(null);
    }

}
