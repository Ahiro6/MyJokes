/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sofishtication.Models;

/**
 *
 * @author adriaan.mostert
 */
public class JokeModel {
    private String joke;
    private String id;
    private String userId;
    private String profileId;

    public JokeModel(String joke, String id, String userId, String profileId) {
        this.joke = joke;
        this.id = id;
        this.userId = userId;
        this.profileId = profileId;
    }

    public String getJoke() {
        return joke;
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getProfileId() {
        return profileId;
    }
    
    
}
