/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sofishtication.Models;

import java.util.ArrayList;

/**
 *
 * @author adriaan.mostert
 */
public class ProfileModel {
    
    private String id;
    private String userId;
    private String name;
    private ArrayList<JokeModel> jokes;

    public ProfileModel(String id, String userId, String name, ArrayList<JokeModel> jokes) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.jokes = jokes;
    }

    public ProfileModel(String id, String userId, String name) {
        this.id = id;
        this.userId = userId;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public ArrayList<JokeModel> getJokes() {
        return jokes;
    }
    
    
    
    
}
