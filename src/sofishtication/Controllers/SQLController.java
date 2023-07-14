/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sofishtication.Controllers;

import java.sql.*;

/**
 *
 * @author adriaan.mostert
 */
public class SQLController {

    public SQLController() {
        
    }
    public void connect() {
         try {
            Class.forName("org.postgresql.Driver");
        }
        catch (java.lang.ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        String url = "postgres://bboogjez:vFcKBDxEQey3X0vgGpr77SA3OHvZLgyr@isilo.db.elephantsql.com/bboogjez";
        String username = "bboogjez";
        String password = "vFcKBDxEQey3X0vgGpr77SA3OHvZLgyr";

        try {
            Connection db = DriverManager.getConnection(url, username, password);
            Statement st = db.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tester");
            while (rs.next()) {
                System.out.print("Column 1 returned ");
                System.out.println(rs.getString(2));
                System.out.print("Column 2 returned ");
                System.out.println(rs.getString(3));
            }
            rs.close();
            st.close();
            }
        catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
