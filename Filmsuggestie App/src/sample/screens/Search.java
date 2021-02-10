package sample.screens;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.json.simple.JSONArray;
import sample.Main;
import sample.classes.*;

public class Search {

    private Scene mainScene;
    private SearchFieldsMethods test;

    public Search(Stage mainStage){
        //test = new SearchFieldsMethods();
        //This is a section with the layouts of the scene::
        //Main Layout
        BorderPane root = new BorderPane();
        FlowPane titleLayout = new FlowPane();
        GridPane gridPane = new GridPane();
        FlowPane bottomLayout = new FlowPane();


        //This is a section with the elements of the scene::
        //Elements to fill the layout
        Label title = new Label("Search Fields");
        Label lbGenre = new Label("Genre");
        Label lbActor = new Label("Actor/Actress");
        Label lbYear = new Label("Year");
        Label lbRating = new Label("Rating");
        TextField genre = new TextField();

        // This are the options for the combobox genres
        ObservableList<String> options =
                FXCollections.observableArrayList(
                        "",
                        "Action",
                        "Comedy",
                        "Drama",
                        "Horror",
                        "Science Fiction"
                );
        ComboBox comboBox = new ComboBox(options);
        comboBox.getSelectionModel().selectFirst();

        TextField actor = new TextField();
        TextField year = new TextField();
        TextField rating = new TextField();
        Button search = new Button("Search");


        //This section is for the fill of the layout::
        //Elements add to layout
        root.setTop(titleLayout);
        root.setCenter(gridPane);
        titleLayout.getChildren().add(title);
        root.setBottom(bottomLayout);
        bottomLayout.getChildren().add(search);
        //Elements to grid
        gridPane.add(lbGenre,0,0);
        gridPane.add(comboBox,0,1);
        gridPane.add(lbActor,1,0);
        gridPane.add(actor,1,1);
        gridPane.add(lbYear,0,2);
        gridPane.add(year,0,3);
        gridPane.add(lbRating,1,2);
        gridPane.add(rating,1,3);

        //Styling Grid Elements
        gridPane.setVgap(10);
        gridPane.setHgap(50);
        gridPane.setAlignment(Pos.TOP_CENTER);
        gridPane.setPadding(new Insets(80,0,0,0));
        bottomLayout.setAlignment(Pos.TOP_CENTER);
        bottomLayout.setPadding(new Insets(0,0,250,0));

        //Positioning & Styling labels in grid
        gridPane.setHalignment(lbGenre, HPos.CENTER);
        gridPane.setHalignment(lbActor, HPos.CENTER);
        gridPane.setHalignment(lbYear, HPos.CENTER);
        gridPane.setHalignment(lbRating, HPos.CENTER);

        lbGenre.setFont(Font.font("monospace",FontWeight.BOLD,20));
        lbActor.setFont(Font.font("monospace",FontWeight.BOLD,20));
        lbYear.setFont(Font.font("monospace",FontWeight.BOLD,20));
        lbRating.setFont(Font.font("monospace",FontWeight.BOLD,20));
        search.setFont(Font.font("monospace",FontWeight.BOLD,20));

        lbGenre.setTextFill(Color.RED);
        lbActor.setTextFill(Color.RED);
        lbYear.setTextFill(Color.RED);
        lbRating.setTextFill(Color.RED);

        //Style with background image.
        Image bSearch = new Image("/sample/images/backgroundSearch.jpg");
        // create a background image for movie area
        BackgroundImage backgroundSearchImage = new BackgroundImage(bSearch,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT);
        // create Background
        Background backgroundMovie = new Background(backgroundSearchImage);
        root.setBackground(backgroundMovie);

        //Styling Title
        title.setFont(Font.font("monospace", FontWeight.BOLD,50));
        titleLayout.setAlignment(Pos.CENTER);
        titleLayout.setPadding(new Insets(50,50,50,50));

        //Styling the text with shadow
        DropShadow dShadow = new DropShadow();
        dShadow.setRadius(5.0);
        dShadow.setOffsetX(3.0);
        dShadow.setOffsetY(3.0);
        dShadow.setColor(Color.BLACK);
        title.setEffect(dShadow);

        lbGenre.setEffect(dShadow);
        lbActor.setEffect(dShadow);
        lbYear.setEffect(dShadow);
        lbRating.setEffect(dShadow);
        search.setEffect(dShadow);


        //Styling Button
        search.setPrefSize(200,50);

//            //Set on action button
//            search.setOnAction(e -> {
//                mainStage.setScene(Main.getPagesList().get(4));
//            });



        //Collect the data which is filled in.
        search.setOnAction(e-> {
                    String genreData = comboBox.getValue().toString();
                    String actorData = actor.getText();
                    String yearData = year.getText();
                    String ratingData = rating.getText();

                    //nothing is insert
                    if (genreData.equals("") && actorData.equals("") && yearData.equals("") && ratingData.equals("")) {
                        //This is a message box if no textfield is filled in.
                        // create a tile pane
                        TilePane r = new TilePane();

                        // create a alert
                        Alert a = new Alert(Alert.AlertType.INFORMATION);
                        a.setContentText("Nothing has been filled in! Please try again");
                        //Messagebox appears
                        a.show();

                        // Return if true so next code won't be executed
                        return;
                    }

                    //return One Search Term
                    //returns rating
                    if (genreData.equals("") && actorData.equals("") && yearData.equals("")) {

                        //Stage main = new Stage();
                        Suggestions vb1 = new Suggestions(mainStage, "rating", ratingData, "", "", "");

                        mainStage.setScene(vb1.getMainScene());



                    }
                    //returns actor
                    else if (genreData.equals("") && yearData.equals("") && ratingData.equals("")) {

                        Suggestions vb2 = new Suggestions(mainStage, "actor", actorData, "", "", "");


                        mainStage.setScene(vb2.getMainScene());
                    }
                    //returns genre
                    else if (yearData.equals("") && actorData.equals("") && ratingData.equals("")) {

                        Suggestions vb3 = new Suggestions(mainStage, "genre", genreData, "", "", "");


                        mainStage.setScene(vb3.getMainScene());
                    }
                    //returns year
                    else if (genreData.equals("") && actorData.equals("") && ratingData.equals("")) {


                        Suggestions vb4 = new Suggestions(mainStage, "year", yearData, "", "", "");


                        mainStage.setScene(vb4.getMainScene());
                    }


                    //return 2 Search Terms
                    else if (yearData.equals("") && actorData.equals("")) {
                        //Go to the next Page & rating/ genre
                        Suggestions vb4 = new Suggestions(mainStage, "genreAndrating", genreData, ratingData, "", "");


                        mainStage.setScene(vb4.getMainScene());

                    } else if (ratingData.equals("") && actorData.equals("")) {
                        //Go to the next Page genre & yeardata
                        Suggestions vb4 = new Suggestions(mainStage, "genreAndyear", genreData, yearData, "", "");


                        mainStage.setScene(vb4.getMainScene());

                    } else if (yearData.equals("") && ratingData.equals("")) {
                        //Go to the next Page genre and actor
                        Suggestions vb4 = new Suggestions(mainStage, "genreAndactor", genreData, actorData, "", "");


                        mainStage.setScene(vb4.getMainScene());

                    } else if (genreData.equals("") && ratingData.equals("")) {
                        //Go to the next Page actor and year
                        Suggestions vb4 = new Suggestions(mainStage, "actorAndyear", actorData, yearData, "", "");


                        mainStage.setScene(vb4.getMainScene());


                    } else if (genreData.equals("") && actorData.equals("")) {
                        //Go to the next Page year and rating
                        Suggestions vb4 = new Suggestions(mainStage, "yearAndrating", yearData, ratingData, "", "");

                        mainStage.setScene(vb4.getMainScene());

                    } else if (genreData.equals("") && yearData.equals("")) {
                        //Go to the next Page actor and rating
                        Suggestions vb4 = new Suggestions(mainStage, "actorAndrating", actorData, ratingData, "", "");

                        mainStage.setScene(vb4.getMainScene());

                    }


                    //returns 3 Search Terms
                    else if (genreData.equals("")) {
                        //Actor, Year & Rating
                        Suggestions vb4 = new Suggestions(mainStage, "actorYearRating", actorData, yearData, ratingData, "");

                        //Go to the page "Suggestions"
                        mainStage.setScene(vb4.getMainScene());

                    } else if (actorData.equals("")) {
                        //Genre, Year & Rating
                        Suggestions vb4 = new Suggestions(mainStage, "genreYearRating", genreData, yearData, ratingData, "");

                        //Go to the page "Suggestions"
                        mainStage.setScene(vb4.getMainScene());

                    } else if (yearData.equals("")) {
                        //Genre, Actor & Rating
                        Suggestions vb4 = new Suggestions(mainStage, "genreActorRating", genreData, actorData, ratingData, "");

                        //Go to the page "Suggestions"
                        mainStage.setScene(vb4.getMainScene());

                    } else if (ratingData.equals("")) {
                        //Genre, Year & Actor
                        Suggestions vb4 = new Suggestions(mainStage, "genreYearActor", genreData, yearData, actorData, "");


                        //Go to the page "Suggestions"
                        mainStage.setScene(vb4.getMainScene());
                    }


                    //All the search terms has been used!
                    else {
                        //All the search terms insert
                        Suggestions vb4 = new Suggestions(mainStage, "AllTheTerms", genreData, yearData, actorData, ratingData);

                        //Go to the page "Suggestions"
                        mainStage.setScene(vb4.getMainScene());
                    }

                    rating.setText("");
                    year.setText("");
                    comboBox.getSelectionModel().selectFirst();
                    actor.setText("");


                });

        mainScene = new Scene(root,800,800);
    }

    public Scene getMainScene(){
        return mainScene;
    }
}
