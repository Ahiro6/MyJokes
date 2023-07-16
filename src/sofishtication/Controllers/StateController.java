/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sofishtication.Controllers;

import sofishtication.Models.UserModel;

/**
 *
 * @author user-pc
 */
public class StateController {
    
    UserModel userModel;

    public StateController() {
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public UserModel getUserModel() {
        return userModel;
    }
    
    
}
