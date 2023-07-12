/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sofishtication.Models;

/**
 *
 * @author adriaan.mostert
 */
public class UserModel {
    private String email;
    private String password;
    private String username;
    private String id;

    public UserModel(String email, String password, String username, String id) {
        this.email = email;
        this.password = password;
        this.username = username;
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getId() {
        return id;
    }
}
