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
    String des = "No description";
    String imgUrl = "https://w7.pngwing.com/pngs/981/645/png-transparent-default-profile-united-states-computer-icons-desktop-free-high-quality-person-icon-miscellaneous-silhouette-symbol-thumbnail.png";

    UUID profileId;
    UUID userId;

    public UserProfileModel(UUID userId, String imgUrl, String des, UUID profileId) {
        this.userId = userId;
        this.imgUrl = imgUrl;
        this.des = des;
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

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    
    

}
