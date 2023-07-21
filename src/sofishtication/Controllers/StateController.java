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
    
    static UserModel userModel;
    static SQLController sqlCon = new SQLController();;

    public static void initiate() {
        if(sqlCon.connect()) {
            System.out.println("Success");
        }
    }

    public static void setUserModel(UserModel userModel) {
        StateController.userModel = userModel;
    }

    public UserModel getUserModel() {
        return userModel;
    }
    
    public static UserModel login(UserModel user) {
        if(sqlCon.getConnection()) {
            user = sqlCon.getUserQuery(user);
        }
        
        return user;
    }
    
    public static UserModel signup(UserModel user) {
        if(sqlCon.getConnection()) {
            user = sqlCon.postUserQuery(user);
        }
        
        return user;
    }
    
    public static void killState() {
        sqlCon.disconnect();
        setUserModel(null);
    }
    
    
}
