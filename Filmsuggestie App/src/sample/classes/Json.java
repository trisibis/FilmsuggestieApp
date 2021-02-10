package sample.classes;

import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import sample.Main;
import sample.screens.Suggestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class Json {
    
    private String baseJsonUrl = "https://api.themoviedb.org/3/discover/movie?api_key=e5292871b995bcafe88a3ebf71e825ea";



    public Json() {

    }


    public JSONArray calculateJSON(String filmUrl) {
        try {
            URL urlC = new URL(filmUrl);
            BufferedReader jsonString = new BufferedReader(new InputStreamReader(urlC.openStream()));

            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonString);

            JSONArray results = (JSONArray) jsonObject.get("results");

            return results;

        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    //Connect name actor to ID
    public JSONArray calculateJSONActorNameToId(String url){
        try {
            URL urlActorName = new URL(url);
            BufferedReader jsonString = new BufferedReader(new InputStreamReader(urlActorName.openStream()));

            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonString);

            JSONArray results = (JSONArray) jsonObject.get("results");

            JSONObject id = (JSONObject) results.get(0);

            String stringId = id.get("id").toString();

            //Call the method who's connecting name to ID
            JSONArray var =calculateIdToMovieTitlesActor(stringId);

            return var;


        }
        catch (ParseException | IOException e) {
            e.printStackTrace();
        }

        return null;
    }



    public JSONArray calculateIdToMovieTitlesActor(String id){
        try {
            String varU = baseJsonUrl + "&with_people=" + id;
            URL urlActor = new URL(varU);
            BufferedReader jsonString = new BufferedReader(new InputStreamReader(urlActor.openStream()));

            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonString);

            JSONArray results = (JSONArray) jsonObject.get("results");

            return results;


        }
        catch (ParseException | IOException e) {
            e.printStackTrace();
        }

        return null;
    }


    //This is a method for calculate ID for actor and return partial string
    private String testID;
    public String calculateJSONActorNameToIdString(String id){
        try {
            URL urlActorName = new URL("https://api.themoviedb.org/3/search/person?api_key=e5292871b995bcafe88a3ebf71e825ea&query=" + id);
            BufferedReader jsonString = new BufferedReader(new InputStreamReader(urlActorName.openStream()));

            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonString);

            JSONArray results = (JSONArray) jsonObject.get("results");

            JSONObject idObject = (JSONObject) results.get(0);

            String stringId = idObject.get("id").toString();

            //Call the method who's connecting name to ID
            testID  = stringId;


        }
        catch (ParseException | IOException e) {
            e.printStackTrace();
        }
        return testID;
    }



}
