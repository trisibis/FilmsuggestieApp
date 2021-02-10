package sample.screens;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import sample.Main;


public class ChooseMenu {

    private Scene mainScene;

    //Constructor methode
    public ChooseMenu(Stage mainStage){

        //This is a section with the layouts of the scene::
        //Mainlayout
        BorderPane mainPane = new BorderPane();
        //ChildNodes
        GridPane moviePane = new GridPane();
        HBox borderMovie = new HBox();



        //This is a section with the elements of the scene::
        //Image elements
        Image urlMovie = new Image("/sample/images/Mfoto.jpg/");
        ImageView iMovie = new ImageView(urlMovie);
        iMovie.setPickOnBounds(true);
        iMovie.setCursor(Cursor.HAND);



        //This section is for the fill of the layout::
        //Filling Layout headPane
        mainPane.setCenter(moviePane);
        //Filling in het GridPanes with the HBoxes
        moviePane.add(borderMovie,0,0);
        //Filling the HBox with the imageViews
        borderMovie.getChildren().add(iMovie);




        //This is a section with the styling/positioning of the elements/layouts, every element/layout is noted above::
        //Create the borderStyling
        String style_outter = "-fx-border-color: black;"
                + "-fx-border-width: 10;";
        borderMovie.setStyle(style_outter);
        //Positioning of the GridPanes
        moviePane.setAlignment(Pos.CENTER);
        //Setting the BackgroundImageUrl for moviePane
        Image bSearch = new Image("/sample/images/backgroundMovie.jpg");
        //Instance of the BackgroundImage Class for background moviePane
        BackgroundImage backgroundSearchImage = new BackgroundImage(bSearch,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                BackgroundSize.DEFAULT);
        //Filling the background in the moviePane
        Background backgroundMovie = new Background(backgroundSearchImage);
        mainPane.setBackground(backgroundMovie);



        //Styling ImageView
        iMovie.setFitHeight(300);
        iMovie.setFitWidth(300);






        //SetOnAction to SearchPage when clicked on image
        iMovie.setOnMouseClicked(event -> {
            mainStage.setScene(Main.getPagesList().get(1));
        });





        mainScene = new Scene(mainPane,800,800);
    }

    //return method
    public Scene getChooseMenu(){
        return mainScene;
    }
}
