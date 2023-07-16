/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sofishtication.Models;

/**
 *
 * @author adriaan.mostert
 */
import java.util.UUID;


public class UserModel {
    private String email;
    private String password;
    private String username;
    private String id;
    private String firstName;
    private String lastName;

    public UserModel(String email, String password, String confirm, String username, String firstName, String lastName) {
        if(password.equals(confirm)) {
            
        }
        
        this.email = email;
        this.password = password;
        this.username = username;
        this.id = createId();
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    private String createId() {
        UUID uuid = UUID.randomUUID();
        String ret = uuid.toString();
        
        return ret;
    }
    
    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    

    @Override
    public String toString() {
        return "UserModel{" + "email=" + email + ", password=" + password + ", username=" + username + ", id=" + id + '}';
    }
    
    
}
