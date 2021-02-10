package sample.screens;

import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import sample.Main;
import sample.classes.SearchFieldsMethods;



public class Suggestions {

    private Scene mainScene;
    private JSONArray voorbeeld;
    private ListView<String> voorbeeld1;
    private String sSoort;

    //Constructor method
    public Suggestions(Stage mainStage, String sSoort, String sValue, String ssValue, String sssValue, String ssssValue){




        //Fill in a box with options for rating
        SearchFieldsMethods test = new SearchFieldsMethods();



                switch (sSoort){
                    case "rating" : {
                        //Call the method to execute Json String
                        voorbeeld = test.calculateRating(sValue);
                        jsonArrayTransfer(voorbeeld);

                        break;
                    }


                    case "year" : {
                         voorbeeld = test.calculateYear(sValue);
                        jsonArrayTransfer(voorbeeld);

                        break;
                    }

                    case "genre": {
                        voorbeeld = test.calculateIdGenre(sValue);
                        jsonArrayTransfer(voorbeeld);

                        break;
                    }

                    case "genreAndrating": {
                        voorbeeld = test.calculateGenreAndRating(sValue, ssValue);;
                        jsonArrayTransfer(voorbeeld);

                        break;
                    }

                    case "genreAndyear": {
                        voorbeeld = test.calculateGenreAndYear(sValue, ssValue);
                        jsonArrayTransfer(voorbeeld);

                        break;
                    }

                    case "genreAndactor": {
                        voorbeeld = test.calculateGenreAndActor(sValue, ssValue);
                        jsonArrayTransfer(voorbeeld);

                        break;
                    }



                    case "yearAndrating": {
                        voorbeeld = test.calculateYearAndRating(sValue, ssValue);
                        jsonArrayTransfer(voorbeeld);

                        break;
                    }

                    case "actorAndrating": {
                        voorbeeld = test.calculateActorAndRating(sValue, ssValue);
                        jsonArrayTransfer(voorbeeld);

                        break;
                    }

                    case "actorYearRating": {
                        voorbeeld = test.calculateActorYearRating(sValue, ssValue, sssValue);;
                        jsonArrayTransfer(voorbeeld);

                        break;
                    }

                    case "genreYearRating": {
                        voorbeeld = test.calculateGenreYearRating(sValue, ssValue, sssValue);
                        jsonArrayTransfer(voorbeeld);

                        break;
                    }

                    case "genreActorRating": {
                        voorbeeld = test.calculateGenreActorRating(sValue, ssValue, sssValue);
                        jsonArrayTransfer(voorbeeld);

                        break;
                    }

                    case "genreYearActor": {
                        voorbeeld = test.calculateGenreYearActor(sValue, ssValue, sssValue);
                        jsonArrayTransfer(voorbeeld);
                        break;
                    }

                    case "AllTheTerms": {
                        voorbeeld = test.calculateGenreYearActorRating(sValue, ssValue, sssValue, ssssValue);
                        jsonArrayTransfer(voorbeeld);

                        break;
                    }

                    case "actor" : {
                        voorbeeld = test.calculateActor(sValue);
                        jsonArrayTransfer(voorbeeld);

                        break;
                    }

                    case "actorAndyear": {
                        voorbeeld = test.calculateYearAndActor(sValue, ssValue);
                        jsonArrayTransfer(voorbeeld);

                        break;
                    }



        }



        //voorbeeld1 = new ListView<String>(names);
        //This is a section with the layouts of the scene::
        //MainLayout
        BorderPane root = new BorderPane();




        FlowPane titleBox = new FlowPane();
        FlowPane containerList = new FlowPane();
        FlowPane buttonsSection = new FlowPane();




        //This is a section with the elements of the scene::
        //Elements
        Label lbTitle = new Label("Suggestions");
        Button btnCategories = new Button("Categorie");
        Button btnSearch = new Button("Search");



        //This section is for the fill of the layout::
        //Fill flowPane
        titleBox.getChildren().add(lbTitle);
        containerList.getChildren().add(voorbeeld1);
        buttonsSection.getChildren().addAll(btnCategories, btnSearch);

        //Fill BorderPane
        root.setCenter(containerList);

        root.setTop(titleBox);
        root.setBottom(buttonsSection);




        //This is a section with the styling of the elements/layouts, every element/layout is noted above::
        //Styling root layout
        root.getStylesheets().add(Main.baseStylesheetPath);
        root.setId("ListBackground");
        //Styling ListView node
        voorbeeld1.setMinSize(400,40);
        //Styling titleBox node
        titleBox.setAlignment(Pos.CENTER);
        titleBox.setPadding(new Insets(10,0,20,0));
        //Styling containerList node
        containerList.setAlignment(Pos.CENTER);
        containerList.setPadding(new Insets(0,0,20,0));
        //Styling buttonSection node
        buttonsSection.setAlignment(Pos.CENTER);
        buttonsSection.setHgap(30);
        buttonsSection.setPadding(new Insets(0,0,150,0));
        //Styling lbTitle
        lbTitle.setFont(Font.font("monospace", FontWeight.EXTRA_BOLD,60));
        lbTitle.setTextFill(Color.RED);
        //Styling Buttons
        btnCategories.setMinSize(150,50);
        btnSearch.setMinSize(150,50);



        //This is a section is for setting up the styling::
        //Setting Shaddow Label Serie
        DropShadow dShadow = new DropShadow();
        dShadow.setRadius(5.0);
        dShadow.setOffsetX(3.0);
        dShadow.setOffsetY(3.0);
        dShadow.setColor(Color.BLACK);
        lbTitle.setEffect(dShadow);




        //This is a section for the triggerEvents
        //Button Events
        btnCategories.setOnAction(e->{
            mainStage.setScene(Main.getPagesList().get(0));
        });
        btnSearch.setOnAction(e->{
            voorbeeld1.getItems().clear();
            mainStage.setScene(Main.getPagesList().get(1));
        });



        //Assign the mainScene
        mainScene = new Scene(root, 800,800);
    }

    public Scene getMainScene(){
        return mainScene;
    }



    public void jsonArrayTransfer(JSONArray voorbeeld){

        ObservableList<String> names = FXCollections.observableArrayList();

        for (Object o : voorbeeld){
                JSONObject title = (JSONObject) o;
                String var = title.get("original_title").toString();
                names.add(var);
            }

        voorbeeld1 = new ListView<String>(names);


    }



}
