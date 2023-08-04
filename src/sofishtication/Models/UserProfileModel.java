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
public class UserProfileModel {

    UserModel user;
    String imgUrl = "https://w7.pngwing.com/pngs/981/645/png-transparent-default-profile-united-states-computer-icons-desktop-free-high-quality-person-icon-miscellaneous-silhouette-symbol-thumbnail.png";

    UUID profileId;
    UUID userId;

    public UserProfileModel(UUID userId, String imgUrl, UUID profileId) {
        this.userId = userId;
        this.imgUrl = imgUrl;
        this.profileId = profileId;
    }

    public UserProfileModel(UserModel user) {
        this.user = user;
        this.userId = user.getId();
        this.profileId = createId();
    }

    private UUID createId() {
        UUID uuid = UUID.randomUUID();

        return uuid;
    }

    public UserModel getUser() {
        return user;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public UUID getProfileId() {
        return profileId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    
    

}
