/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sofishtication.Models;

import java.util.UUID;

/**
 *
 * @author adriaan.mostert
 */
public class JokeModel {

    private String joke;
    private UUID id;
    private UUID userId;
    private UUID profileId;

    public JokeModel(String joke, UUID id, UUID userId, UUID profileId) {
        this.joke = joke;
        this.id = id;
        this.userId = userId;
        this.profileId = profileId;
    }

    public JokeModel(String joke, UUID userId, UUID profileId) {
        this.joke = joke;
        this.userId = userId;
        this.profileId = profileId;
        this.id = createId();
    }
    
    private UUID createId() {
        UUID uuid = UUID.randomUUID();

        return uuid;
    }

    public String getJoke() {
        return joke;
    }

    public UUID getId() {
        return id;
    }

    public UUID getUserId() {
        return userId;
    }

    public UUID getProfileId() {
        return profileId;
    }

}
