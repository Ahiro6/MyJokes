/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofishtication.Controllers;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.Scanner;
import sofishtication.Models.ApiRequester;

/**
 *
 * @author user-pc
 */
public class ApiLoader {
    
    String fileName;
    static String path = ".\\src\\sofishtication\\Files\\";
    
    public ApiLoader(String fileName) {
        this.fileName = fileName;
    }

//    public void writeApi(User user, String message) {
//        try {
//            File txtFile = new File("messages.txt");
//            FileWriter writer = new FileWriter(txtFile.getName());
//            writer.write(user.getName() + ": " + message);
//            writer.close();
//            
//            System.out.println(user.getName() + ": " + message);
//        }
//        catch(IOException e) {
//            System.out.println("Error");
//            e.printStackTrace();
//        }
//            
//    }
    
    public ArrayList<ApiRequester> readApi() {
        ArrayList<ApiRequester> apis = new ArrayList<>();
        
        try {
            File txtFile = new File(path+fileName);
            Scanner reader = new Scanner(txtFile);
            reader.nextLine();
            while(reader.hasNextLine()) {
                Scanner scApi = new Scanner(reader.nextLine()).useDelimiter("~");
                
                apis.add(new ApiRequester(scApi.next(), scApi.next(), scApi.next(), scApi.next(), scApi.next()));
            }
            
            reader.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        
        return apis;
    }
    
    static public ArrayList<ApiRequester> readApi(String name) {
        ArrayList<ApiRequester> apis = new ArrayList<>();
        
        try {
            File txtFile = new File(path + name);
            Scanner reader = new Scanner(txtFile);
            reader.nextLine();
            while(reader.hasNextLine()) {
                Scanner scApi = new Scanner(reader.nextLine()).useDelimiter("~");
                
                apis.add(new ApiRequester(scApi.next(), scApi.next(), scApi.next(), scApi.next(), scApi.next()));
            }
            
            reader.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        
        return apis;
    }
}
