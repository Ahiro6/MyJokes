/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sofishtication.Models;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author adriaan.mostert
 */
public class ProfileModel {

    private UUID id;
    private UUID userId;
    private String name;
    private ArrayList<JokeModel> jokes;

    public ProfileModel(UUID id, UUID userId, String name, ArrayList<JokeModel> jokes) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.jokes = jokes;
    }

    public ProfileModel(UUID userId, String name, ArrayList<JokeModel> jokes) {
        this.id = createId();
        this.userId = userId;
        this.name = name;
        this.jokes = jokes;
    }
    
    private UUID createId() {
        UUID uuid = UUID.randomUUID();

        return uuid;
    }

    public UUID getId() {
        return id;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public ArrayList<JokeModel> getJokes() {
        return jokes;
    }

}
