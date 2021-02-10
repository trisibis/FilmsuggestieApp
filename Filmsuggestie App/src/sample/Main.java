package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.json.simple.JSONArray;
import sample.classes.Json;
import sample.screens.ChooseMenu;
import sample.screens.Search;
import sample.screens.Suggestions;


import java.util.ArrayList;

public class Main extends Application {

    public static String baseStylesheetPath = "/sample/styles/style.css/";
    private static ArrayList<Scene> pagesList = new ArrayList<>();
    private JSONArray arr = new JSONArray();
    @Override
    public void start(Stage primaryStage) throws Exception{

        pagesList.add(new ChooseMenu(primaryStage).getChooseMenu());
        pagesList.add(new Search(primaryStage).getMainScene());


        primaryStage.setTitle("Movie Suggestion Application");
        primaryStage.setScene(pagesList.get(0));
        primaryStage.show();
    }

    public static ArrayList<Scene> getPagesList(){
        return pagesList;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
