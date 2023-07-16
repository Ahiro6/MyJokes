/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sofishtication.Controllers;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sofishtication.Models.UserModel;

/**
 *
 * @author user-pc
 */
public class SQLController {

    String url;
    String username;
    String password;

    String tableName;

    Connection db;

    public SQLController(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public SQLController(String url, String username, String password, String tableName) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.tableName = tableName;
    }

    public SQLController() {
        this.url = "jdbc:postgresql://isilo.db.elephantsql.com:5432/bboogjez";
        this.username = "bboogjez";
        this.password = "vFcKBDxEQey3X0vgGpr77SA3OHvZLgyr";
    }
    
    

    public boolean connect() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            this.db = DriverManager.getConnection(url, username, password);
            return true;

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    public ArrayList<String> getQuery() {
        ArrayList<String> results = new ArrayList<>();
        try {
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM " + tableName);
            while (rs.next()) {
                System.out.println(rs.getInt(1));
                results.add(rs.getString(1));
            }
            rs.close();
            st.close();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }

        return results;
    }

    public ArrayList<String> postQuery(int input) {
        ArrayList<String> results = new ArrayList<>();
        try {
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("INSERT INTO " + tableName + " (num)\n"
                    + "VALUES (" + input + ");");

            rs.close();
            st.close();
            
            results.add(""+input);

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }

        return results;
    }
    
        public ArrayList<String> postUserQuery(UserModel user) {
        ArrayList<String> results = new ArrayList<>();
        try {
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("INSERT INTO " + "Users" + " (num)\n"
                    + "VALUES (" + user.getId() + "," + 
                    user.getFirstName() + "," +
                    user.getLastName() + "," +
                    user.getUsername() + "," + 
                    user.getPassword() + "," + 
                    user.getEmail() + ");");

            rs.close();
            st.close();
            
            results.add(""+user.toString());

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }

        return results;
    }
    
    public void disconnect() {
        try {
            db.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean createUserTable() {
        try {
           Statement st = db.createStatement();
           ResultSet rs = st.executeQuery("CREATE TABLE " + "Users" + " ("
                   + " Id varchar(255),"
                   + " LastName varchar(255),"
                   + " FirstName varchar255),"
                   + " Username varchar(255),"
                   + " Password varchar(255),"
                   + " Email varchar(255)"
                   + ");");
           
           return true;
        }
        catch (java.sql.SQLException ex) {
            Logger.getLogger(SQLController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    
}
