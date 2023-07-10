/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sofishtication.Models;

import java.net.URI;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest;


/**
 *
 * @author user-pc
 */
public class ApiRequester {

    String url;
    String host;
    String key;
    String name;
    String creator;

    public ApiRequester() {
    }

    public ApiRequester(String name, String creator, String url, String host, String key) {
        this.url = url;
        this.host = host;
        this.key = key;
        this.creator = creator;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getNumReq(int amount) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url + "?limit="+amount))
                .header("X-RapidAPI-Host", host)
                .header("X-RapidAPI-Key", key)
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = null;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(response.body());
        
        return getJoke(response.body());
    }
    
    public String getJoke(String joke) {
        int colonIndex = joke.indexOf(':');
        int bracketIndex = joke.indexOf('}');
        
        return joke.substring(colonIndex+1, bracketIndex);
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUrl() {
        return url;
    }

    public String getHost() {
        return host;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getCreator() {
        return creator;
    }
    
    
}
