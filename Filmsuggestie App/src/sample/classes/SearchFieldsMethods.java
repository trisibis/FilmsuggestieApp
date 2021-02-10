package sample.classes;

import org.json.simple.JSONArray;

public class SearchFieldsMethods {

    public SearchFieldsMethods(){

    }

    /////////////////////////////////Single search terms

    //Calculate Genre
    public JSONArray calculateIdGenre(String genre){

        //Base Json String
        String baseJsonUrl = "https://api.themoviedb.org/3/discover/movie?api_key=e5292871b995bcafe88a3ebf71e825ea&with_genres=";

        if(genre == "Action"){
            String testUrl = (baseJsonUrl + "28");
            Json test = new Json();
            JSONArray var = test.calculateJSON(testUrl);
            return var;
        }
        else if(genre == "Comedy"){
            String testUrl = (baseJsonUrl + "35");
            Json test = new Json();
            JSONArray var = test.calculateJSON(testUrl);
            return var;
        }
        else if(genre == "Drama"){
            String testUrl = (baseJsonUrl + "18");
            Json test = new Json();
            JSONArray var = test.calculateJSON(testUrl);
            return var;
        }
        else if(genre == "Science Fiction"){
            String testUrl = (baseJsonUrl + "878");
            Json test = new Json();
            JSONArray var= test.calculateJSON(testUrl);
            return var;
        }
        else{
            String testUrl = (baseJsonUrl + "27");
            Json test = new Json();
            JSONArray var= test.calculateJSON(testUrl);
            return var;

        }

    }


    //Calculate rating
    public JSONArray calculateRating(String rating){
        //Base Json String
        String baseJsonUrl = "https://api.themoviedb.org/3/discover/movie?api_key=e5292871b995bcafe88a3ebf71e825ea&vote_average.gte=";

        String json = baseJsonUrl + rating;
        Json test = new Json();
        JSONArray var = test.calculateJSON(json);


        return var;
    }

    //Calculate Actor
    public JSONArray calculateActor(String actor){
        //Base Json String
        String baseJsonUrl = "https://api.themoviedb.org/3/search/person?api_key=e5292871b995bcafe88a3ebf71e825ea&query=";

        String json = baseJsonUrl + actor;
        Json test = new Json();
        JSONArray var = test.calculateJSONActorNameToId(json);

        return var;

    }

    //Calculate Year
    public JSONArray calculateYear(String year){
        //Base Json String
        String baseJsonUrl = "https://api.themoviedb.org/3/discover/movie?api_key=e5292871b995bcafe88a3ebf71e825ea&primary_release_year=";

        String json = baseJsonUrl + year;
        Json test = new Json();
        JSONArray var =test.calculateJSON(json);

        return var;

    }

    //////////////////////////////////////2 search terms

    //Calculate Genre and Rating
    public JSONArray calculateGenreAndRating(String genre, String rating){

        //Base Json String
        String baseJsonUrl = "https://api.themoviedb.org/3/discover/movie?api_key=e5292871b995bcafe88a3ebf71e825ea";

        if(genre == "Action"){
            String testUrl = ("28");
            String partGenre = "&with_genres=" + testUrl;
            String partRating = "&vote_average.gte=" + rating;
            String json = baseJsonUrl + partGenre + partRating;
            Json test = new Json();
            JSONArray var= test.calculateJSON(json);
            return var;

        }
        else if(genre == "Comedy"){
            String testUrl = ("35");
            String partGenre = "&with_genres=" + testUrl;
            String partRating = "&vote_average.gte=" + rating;
            String json = baseJsonUrl + partGenre + partRating;
            Json test = new Json();
            JSONArray var= test.calculateJSON(json);
            return var;
        }
        else if(genre == "Drama"){
            String testUrl = ("18");
            String partGenre = "&with_genres=" + testUrl;
            String partRating = "&vote_average.gte=" + rating;

            String json = baseJsonUrl + partGenre + partRating;
            Json test = new Json();
            JSONArray var= test.calculateJSON(json);
            return var;
        }
        else if(genre == "Science Fiction"){
            String testUrl = ("878");
            String partGenre = "&with_genres=" + testUrl;
            String partRating = "&vote_average.gte=" + rating;

            String json = baseJsonUrl + partGenre + partRating;
            Json test = new Json();
            JSONArray var= test.calculateJSON(json);
            return var;
        }
        else{
            String testUrl = ("27");
            String partGenre = "&with_genres=" + testUrl;
            String partRating = "&vote_average.gte=" + rating;

            String json = baseJsonUrl + partGenre + partRating;
            Json test = new Json();
            JSONArray var= test.calculateJSON(json);
            return var;
        }

    }


    //Calculate Genre & Year
    public JSONArray calculateGenreAndYear(String genre, String year){
        //Base Json String
        String baseJsonUrl = "https://api.themoviedb.org/3/discover/movie?api_key=e5292871b995bcafe88a3ebf71e825ea";

        if(genre == "Action"){
            String testUrl = ("28");
            String partGenre = "&with_genres=" + testUrl;
            String partRating = "&primary_release_year=" + year;
            String json = baseJsonUrl + partGenre + partRating;
            Json test = new Json();
            JSONArray var = test.calculateJSON(json);
            return var;

        }
        else if(genre == "Comedy"){
            String testUrl = ("35");
            String partGenre = "&with_genres=" + testUrl;
            String partRating = "&primary_release_year=" + year;
            String json = baseJsonUrl + partGenre + partRating;
            Json test = new Json();
            JSONArray var = test.calculateJSON(json);
            return var;
        }
        else if(genre == "Drama"){
            String testUrl = ("18");
            String partGenre = "&with_genres=" + testUrl;
            String partRating = "&primary_release_year=" + year;
            String json = baseJsonUrl + partGenre + partRating;
            Json test = new Json();
            JSONArray var = test.calculateJSON(json);
            return var;
        }
        else if(genre == "Science Fiction"){
            String testUrl = ("878");
            String partGenre = "&with_genres=" + testUrl;
            String partRating = "&primary_release_year=" + year;
            String json = baseJsonUrl + partGenre + partRating;
            Json test = new Json();
            JSONArray var = test.calculateJSON(json);
            return var;
        }
        else{
            String testUrl = ("27");
            String partGenre = "&with_genres=" + testUrl;
            String partRating = "&primary_release_year=" + year;
            String json = baseJsonUrl + partGenre + partRating;
            Json test = new Json();
            JSONArray var = test.calculateJSON(json);
            return var;
        }

    }

    //Calculate Genre & Actor
    public JSONArray calculateGenreAndActor(String genre, String actor){
        //Base Json String
        String baseJsonUrl = "https://api.themoviedb.org/3/discover/movie?api_key=e5292871b995bcafe88a3ebf71e825ea";

        if(genre == "Action"){

            String testUrl = "28";
            String partGenre = "&with_genres=" + testUrl;
            String partActor = "&with_people=";
            Json test = new Json();

            String varTest = test.calculateJSONActorNameToIdString(actor);
            String completeString = baseJsonUrl+ partGenre + partActor + varTest;

            JSONArray var = test.calculateJSON(completeString);

            return var;

        }
        else if(genre == "Comedy"){
            String testUrl = ("35");
            String partGenre = "&with_genres=" + testUrl;
            String partActor = "&with_people=";
            Json test = new Json();
            String varTest = test.calculateJSONActorNameToIdString(actor);
            String completeString = baseJsonUrl+ partGenre + partActor + varTest;
            JSONArray var = test.calculateJSON(completeString);
            return var;
        }
        else if(genre == "Drama"){
            String testUrl = ("18");
            String partGenre = "&with_genres=" + testUrl;
            String partActor = "&with_people=";
            Json test = new Json();
            String varTest = test.calculateJSONActorNameToIdString(actor);
            String completeString = baseJsonUrl+ partGenre + partActor + varTest;
            JSONArray var = test.calculateJSON(completeString);
            return var;
        }
        else if(genre == "Science Fiction"){
            String testUrl = ("878");
            String partGenre = "&with_genres=" + testUrl;
            String partActor = "&with_people=";
            Json test = new Json();
            String varTest = test.calculateJSONActorNameToIdString(actor);
            String completeString = baseJsonUrl+ partGenre + partActor + varTest;
            JSONArray var = test.calculateJSON(completeString);
            return var;
        }
        else{
            String testUrl = ("27");
            String partGenre = "&with_genres=" + testUrl;
            String partActor = "&with_people=";
            Json test = new Json();
            String varTest = test.calculateJSONActorNameToIdString(actor);
            String completeString = baseJsonUrl+ partGenre + partActor + varTest;
            JSONArray var = test.calculateJSON(completeString);
            return var;
        }
    }

    //Calculate Year and Actor
    public JSONArray calculateYearAndActor(String year, String actor){
        //Base Json String
        String baseJsonUrl = "https://api.themoviedb.org/3/discover/movie?api_key=e5292871b995bcafe88a3ebf71e825ea";
        String partYear = "&primary_release_year=" + year;
        String partActor = "&with_people=";
        Json test = new Json();
        String varTest = test.calculateJSONActorNameToIdString(actor);
        String completeString = baseJsonUrl+ partYear + partActor + varTest;
        JSONArray var = test.calculateJSON(completeString);
        return var;
    }

    //Calculate Year and Rating
    public JSONArray calculateYearAndRating(String year, String rating){
        //Base Json String
        String baseJsonUrl = "https://api.themoviedb.org/3/discover/movie?api_key=e5292871b995bcafe88a3ebf71e825ea";
        String partYear = "&primary_release_year=" + year;
        String partRating = "&vote_average.gte=" + rating;
        Json test = new Json();
        String completeString = baseJsonUrl+ partYear + partRating;

        JSONArray var = test.calculateJSON(completeString);
        return var;
    }

    //Calculate Actor and Rating
    public JSONArray calculateActorAndRating(String actor, String rating){
        //Base Json String
        String baseJsonUrl = "https://api.themoviedb.org/3/discover/movie?api_key=e5292871b995bcafe88a3ebf71e825ea";
        String partRating = "&vote_average.gte=" + rating;
        String partActor = "&with_people=";
        Json test = new Json();
        String varTest = test.calculateJSONActorNameToIdString(actor);
        String completeString = baseJsonUrl+ partActor + varTest + partRating;

        JSONArray var = test.calculateJSON(completeString);
        return var;
    }



    /////////////////////3 search Terms
    //Search on actor & Year & Rating
    public JSONArray calculateActorYearRating(String actor, String year, String rating){
        String baseJsonUrl = "https://api.themoviedb.org/3/discover/movie?api_key=e5292871b995bcafe88a3ebf71e825ea";
        String partRating = "&vote_average.gte=" + rating;
        String partYear = "&primary_release_year=" + year;
        String partActor = "&with_people=";
        Json test = new Json();
        String varTest = test.calculateJSONActorNameToIdString(actor);
        String completeString = baseJsonUrl+ partActor + varTest + partRating + partYear;

        JSONArray var = test.calculateJSON(completeString);
        return var;
    }

    //Search on Genre & Year & Rating
    public JSONArray calculateGenreYearRating(String genre, String year, String rating){
        String baseJsonUrl = "https://api.themoviedb.org/3/discover/movie?api_key=e5292871b995bcafe88a3ebf71e825ea";

        if(genre == "Action"){

            String testUrl = "28";
            String partGenre = "&with_genres=" + testUrl;
            String partRating = "&vote_average.gte=" + rating;
            String partYear = "&primary_release_year=" + year;
            Json test = new Json();
            String completeString = baseJsonUrl+ partYear + partRating + partGenre;

            JSONArray var = test.calculateJSON(completeString);
            return var;
        }
        else if(genre == "Comedy"){

            String testUrl = "35";
            String partGenre = "&with_genres=" + testUrl;
            String partRating = "&vote_average.gte=" + rating;
            String partYear = "&primary_release_year=" + year;
            Json test = new Json();
            String completeString = baseJsonUrl+ partYear + partRating + partGenre;

            JSONArray var = test.calculateJSON(completeString);
            return var;
        }
        else if(genre == "Drama"){

            String testUrl = "18";
            String partGenre = "&with_genres=" + testUrl;
            String partRating = "&vote_average.gte=" + rating;
            String partYear = "&primary_release_year=" + year;
            Json test = new Json();
            String completeString = baseJsonUrl+ partYear + partRating + partGenre;

            JSONArray var = test.calculateJSON(completeString);
            return var;
        }
        else if(genre == "Science Fiction"){

            String testUrl = "878";
            String partGenre = "&with_genres=" + testUrl;
            String partRating = "&vote_average.gte=" + rating;
            String partYear = "&primary_release_year=" + year;
            Json test = new Json();
            String completeString = baseJsonUrl+ partYear + partRating + partGenre;

            JSONArray var = test.calculateJSON(completeString);
            return var;
        }
        else{
            String testUrl = "27";
            String partGenre = "&with_genres=" + testUrl;
            String partRating = "&vote_average.gte=" + rating;
            String partYear = "&primary_release_year=" + year;
            Json test = new Json();
            String completeString = baseJsonUrl+ partYear + partRating + partGenre;

            JSONArray var = test.calculateJSON(completeString);
            return var;
        }
    }

    //this method calculate the search terms Genre & Actor & Rating
    public JSONArray calculateGenreActorRating(String genre, String actor, String rating){
        String baseJsonUrl = "https://api.themoviedb.org/3/discover/movie?api_key=e5292871b995bcafe88a3ebf71e825ea";

        if(genre == "Action"){

            String testUrl = "28";
            String partGenre = "&with_genres=" + testUrl;
            String partActor = "&with_people=";
            String partRating = "&vote_average.gte=" + rating;
            Json test = new Json();
            String varTest = test.calculateJSONActorNameToIdString(actor);
            String completeString = baseJsonUrl+ partGenre + partActor + varTest + partRating;

            JSONArray var = test.calculateJSON(completeString);
            return var;

        }
        else if(genre == "Comedy"){
            String testUrl = ("35");
            String partGenre = "&with_genres=" + testUrl;
            String partActor = "&with_people=";
            String partRating = "&vote_average.gte=" + rating;
            Json test = new Json();
            String varTest = test.calculateJSONActorNameToIdString(actor);
            String completeString = baseJsonUrl+ partGenre + partActor + varTest + partRating;

            JSONArray var = test.calculateJSON(completeString);
            return var;
        }
        else if(genre == "Drama"){
            String testUrl = ("18");
            String partGenre = "&with_genres=" + testUrl;
            String partActor = "&with_people=";
            String partRating = "&vote_average.gte=" + rating;
            Json test = new Json();
            String varTest = test.calculateJSONActorNameToIdString(actor);
            String completeString = baseJsonUrl+ partGenre + partActor + varTest + partRating;

            JSONArray var = test.calculateJSON(completeString);
            return var;
        }
        else if(genre == "Science Fiction"){
            String testUrl = ("878");
            String partGenre = "&with_genres=" + testUrl;
            String partActor = "&with_people=";
            String partRating = "&vote_average.gte=" + rating;
            Json test = new Json();
            String varTest = test.calculateJSONActorNameToIdString(actor);
            String completeString = baseJsonUrl+ partGenre + partActor + varTest + partRating;

            JSONArray var = test.calculateJSON(completeString);
            return var;
        }
        else{
            String testUrl = ("27");
            String partGenre = "&with_genres=" + testUrl;
            String partActor = "&with_people=";
            String partRating = "&vote_average.gte=" + rating;
            Json test = new Json();
            String varTest = test.calculateJSONActorNameToIdString(actor);
            String completeString = baseJsonUrl+ partGenre + partActor + varTest + partRating;

            JSONArray var = test.calculateJSON(completeString);
            return var;
        }
    }

    //This is a method for the search terms Genre & Year & Actor
    public JSONArray calculateGenreYearActor(String genre, String year, String actor){
        String baseJsonUrl = "https://api.themoviedb.org/3/discover/movie?api_key=e5292871b995bcafe88a3ebf71e825ea";
        if(genre == "Action"){

            String testUrl = "28";
            String partGenre = "&with_genres=" + testUrl;
            String partActor = "&with_people=";
            String partYear = "&primary_release_year=" + year;
            Json test = new Json();
            String varTest = test.calculateJSONActorNameToIdString(actor);
            String completeString = baseJsonUrl+ partGenre + partActor + varTest + partYear;

            JSONArray var = test.calculateJSON(completeString);
            return var;

        }
        else if(genre == "Comedy"){
            String testUrl = ("35");
            String partGenre = "&with_genres=" + testUrl;
            String partActor = "&with_people=";
            String partYear = "&primary_release_year=" + year;
            Json test = new Json();
            String varTest = test.calculateJSONActorNameToIdString(actor);
            String completeString = baseJsonUrl+ partGenre + partActor + varTest + partYear;

            JSONArray var = test.calculateJSON(completeString);
            return var;
        }
        else if(genre == "Drama"){
            String testUrl = ("18");
            String partGenre = "&with_genres=" + testUrl;
            String partActor = "&with_people=";
            String partYear = "&primary_release_year=" + year;
            Json test = new Json();
            String varTest = test.calculateJSONActorNameToIdString(actor);
            String completeString = baseJsonUrl+ partGenre + partActor + varTest + partYear;

            JSONArray var = test.calculateJSON(completeString);
            return var;
        }
        else if(genre == "Science Fiction"){
            String testUrl = ("878");
            String partGenre = "&with_genres=" + testUrl;
            String partActor = "&with_people=";
            String partYear = "&primary_release_year=" + year;
            Json test = new Json();
            String varTest = test.calculateJSONActorNameToIdString(actor);
            String completeString = baseJsonUrl+ partGenre + partActor + varTest + partYear;

            JSONArray var = test.calculateJSON(completeString);
            return var;
        }
        else{
            String testUrl = ("27");
            String partGenre = "&with_genres=" + testUrl;
            String partActor = "&with_people=";
            String partYear = "&primary_release_year=" + year;
            Json test = new Json();
            String varTest = test.calculateJSONActorNameToIdString(actor);
            String completeString = baseJsonUrl+ partGenre + partActor + varTest + partYear;

            JSONArray var = test.calculateJSON(completeString);
            return var;
        }
    }

    /////////////////////////All the search terms
    //This is a method for the search terms Genre & Year & Actor
    public JSONArray calculateGenreYearActorRating(String genre, String year, String actor, String rating){
        String baseJsonUrl = "https://api.themoviedb.org/3/discover/movie?api_key=e5292871b995bcafe88a3ebf71e825ea";
        if(genre == "Action"){

            String testUrl = "28";
            String partGenre = "&with_genres=" + testUrl;
            String partRating = "&vote_average.gte=" + rating;
            String partActor = "&with_people=";
            String partYear = "&primary_release_year=" + year;
            Json test = new Json();
            String varTest = test.calculateJSONActorNameToIdString(actor);
            String completeString = baseJsonUrl+ partGenre + partActor + varTest + partYear + partRating;

            JSONArray var = test.calculateJSON(completeString);
            return var;

        }
        else if(genre == "Comedy"){
            String testUrl = ("35");
            String partGenre = "&with_genres=" + testUrl;
            String partRating = "&vote_average.gte=" + rating;
            String partActor = "&with_people=";
            String partYear = "&primary_release_year=" + year;
            Json test = new Json();
            String varTest = test.calculateJSONActorNameToIdString(actor);
            String completeString = baseJsonUrl+ partGenre + partActor + varTest + partYear + partRating;
            JSONArray var = test.calculateJSON(completeString);
            return var;
        }
        else if(genre == "Drama"){
            String testUrl = ("18");
            String partGenre = "&with_genres=" + testUrl;
            String partRating = "&vote_average.gte=" + rating;
            String partActor = "&with_people=";
            String partYear = "&primary_release_year=" + year;
            Json test = new Json();
            String varTest = test.calculateJSONActorNameToIdString(actor);
            String completeString = baseJsonUrl+ partGenre + partActor + varTest + partYear + partRating;
            JSONArray var = test.calculateJSON(completeString);
            return var;
        }
        else if(genre == "Science Fiction"){
            String testUrl = ("878");
            String partGenre = "&with_genres=" + testUrl;
            String partRating = "&vote_average.gte=" + rating;
            String partActor = "&with_people=";
            String partYear = "&primary_release_year=" + year;
            Json test = new Json();
            String varTest = test.calculateJSONActorNameToIdString(actor);
            String completeString = baseJsonUrl+ partGenre + partActor + varTest + partYear + partRating;
            JSONArray var = test.calculateJSON(completeString);
            return var;
        }
        else{
            String testUrl = ("27");
            String partGenre = "&with_genres=" + testUrl;
            String partRating = "&vote_average.gte=" + rating;
            String partActor = "&with_people=";
            String partYear = "&primary_release_year=" + year;
            Json test = new Json();
            String varTest = test.calculateJSONActorNameToIdString(actor);
            String completeString = baseJsonUrl+ partGenre + partActor + varTest + partYear + partRating;
            JSONArray var = test.calculateJSON(completeString);
            return var;
        }
    }





}

