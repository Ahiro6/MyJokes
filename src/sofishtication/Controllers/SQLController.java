/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sofishtication.Controllers;

import java.sql.*;
import java.util.ArrayList;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import sofishtication.Models.JokeModel;
import sofishtication.Models.ProfileModel;
import sofishtication.Models.UserModel;

/**
 *
 * @author user-pc
 */
public class SQLController {

    String url;
    String user;
    String password;

    String tableName;

    private Boolean connection;

    Connection db;

    public SQLController() {
        this.url = "jdbc:postgresql://isilo.db.elephantsql.com:5432/bboogjez";
        this.user = "bboogjez";
        this.password = "vFcKBDxEQey3X0vgGpr77SA3OHvZLgyr";
        this.connection = false;
    }

    public boolean connect() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            this.db = DriverManager.getConnection(url, user, password);
            this.connection = true;
            System.out.println("Connected");
            return connection;

        } catch (java.sql.SQLException e) {
            System.out.println("Failed");
            Logger.getLogger(SQLController.class.getName()).log(Level.SEVERE, null, e);
        }

        return connection;
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

            results.add("" + input);

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }

        return results;
    }

    public JokeModel getJokeQuery(UUID id) {
        JokeModel joke = null;
        try {
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM " + "Jokes " + 
                    "WHERE " 
                    + "Id="+id.toString() 
                    + ";");
            
            while (rs.next()) {
                System.out.println(rs.getStatement().toString());
            }
            
            rs.close();
            st.close();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }

        return joke;
    }

    public JokeModel postJokeQuery(JokeModel joke) {
        try {
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("INSERT INTO " + "Jokes"
                    + " VALUES (" + joke.getId().toString() + ", "
                    + joke.getUserId().toString() + ", "
                    + joke.getProfileId().toString() + ", "
                    + joke.getJoke()
                    + ");");

            rs.close();
            st.close();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }

        return joke;
    }
    
        public ProfileModel getProfileQuery(UUID id) {
        ProfileModel profile = null;
        try {
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM " + "Profiles " + 
                    "WHERE " 
                    + "Id="+id.toString() 
                    + ";");
            
            while (rs.next()) {
                System.out.println(rs.getStatement().toString());
            }
            
            rs.close();
            st.close();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }

        return profile;
    }

    public ProfileModel postProfileQuery(ProfileModel profile, ArrayList<UUID> id) {

        try {
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("INSERT INTO " + "Profiles" 
                    + "VALUES (" + profile.getId().toString() + ", "
                    + profile.getUserId().toString() + ", "
                    + profile.getName() + ", "
                    + id.toArray()
                    +");");

            rs.close();
            st.close();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }

        return profile;
    }

    public UserModel getUserQuery(UserModel user) {
        try {
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM " + "Users " + 
                    "WHERE " 
                    + "Username="+user.getUsername() + " AND " 
                    + "Password="+user.getPassword() 
                    + ";");
            
            while (rs.next()) {
                System.out.println(rs.getString(0));
                //user = new UserModel(url, password, url, username, username, username)
            }
            rs.close();
            st.close();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }

        return user;
    }

    public UserModel postUserQuery(UserModel user) {
        try {
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("INSERT INTO " + "Users"
                    + " VALUES (" + user.getId().toString() + ", "
                    + user.getLastName() + ", "
                    + user.getFirstName() + ", "
                    + user.getUsername() + ", "
                    + user.getPassword() + ", "
                    + user.getEmail() 
                    + ");");

            rs.close();
            st.close();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }

        return user;
    }

    public boolean disconnect() {
        try {
            db.close();
            connection = false;
        } catch (SQLException ex) {
            Logger.getLogger(SQLController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        return true;
    }

    public boolean createJokesTable() {
        try {
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("CREATE TABLE " + "Jokes" + " ("
                    + " Id varchar,"
                    + " UserId varchar,"
                    + " ProfileId varchar,"
                    + " Joke varchar"
                    + " );");

            return true;
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(SQLController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean createProfileTable() {
        try {
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("CREATE TABLE " + "Profiles" + " ("
                    + " Id varchar,"
                    + " UserId varchar,"
                    + " Name varchar,"
                    + " JokeIds varchar array"
                    + " );");

            return true;
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(SQLController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean createUserTable() {
        try {
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("CREATE TABLE " + "Users" + " ("
                    + " Id varchar,"
                    + " LastName varchar,"
                    + " FirstName varchar,"
                    + " Username varchar,"
                    + " Password varchar,"
                    + " Email varchar"
                    + " );");

            return true;
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(SQLController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.user = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getConnection() {
        return connection;
    }

}
