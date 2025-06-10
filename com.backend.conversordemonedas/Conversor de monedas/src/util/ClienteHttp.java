package util;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ClienteHttp {

    public String ApiConexion (String urlApi){

        try {
            HttpClient  client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlApi)).build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            return  json;

        }catch (IOException | InterruptedException e){
            e.printStackTrace();
        }
        return null;
    }
}