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
import sofishtication.Models.UserModel;
import sofishtication.Models.UserProfileModel;

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

    public UserModel getUserQuery(UserModel user) {
        try {
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM " + "Users "
                    + "WHERE "
                    + "Username=" + user.getUsername() + " AND "
                    + "Password=" + user.getPassword()
                    + ";");

            while (rs.next()) {
                System.out.println(rs.getString(0));
                //user = new UserModel(url, password, url, username, username, username)
            }
            rs.close();
            st.close();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            user = null;
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
            user = null;
        }

        return user;
    }

    public UserProfileModel getUserProfileQuery(UUID userId) {
        UserProfileModel profile = null;
        try {
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM " + "UserProfiles "
                    + "WHERE "
                    + "UserId=" + userId.toString()
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

    public UserProfileModel postUserProfileQuery(UserProfileModel profile) {

        try {
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("INSERT INTO " + "UserProfiles"
                    + "VALUES (" + profile.getProfileId().toString() + ", "
                    + profile.getImgUrl() + ", "
                    + profile.getUserId().toString()
                    + ");");

            rs.close();
            st.close();

        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            profile = null;
        }

        return profile;
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

    public boolean createUserProfileTable() {
        try {
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("CREATE TABLE " + "UserProfiles" + " ("
                    + " ProfileId varchar,"
                    + " ImgUrl varchar,"
                    + " UserId varchar,"
                    + " );");

            return true;
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(SQLController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean dropTable(String name) {
        Statement st;
        try {
            st = db.createStatement();
            ResultSet rs = st.executeQuery("DROP TABLE " + name + ";");
        } catch (SQLException ex) {
            Logger.getLogger(SQLController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        return true;
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
