package com.example.gaetan.quizz.models;

/**
 * Created by gilian on 27/01/2018.
 */

public class Question {
    private int id;
    private String title;
    private String responseOne;
    private String responseTwo;
    private String responseThree;
    private String responseFour;
    private String theme;
    private int goodResponse;

    public Question(){}

    public int getId(){return this.id;}
    public void setId(int id){this.id = id;}

    public String getTitle(){return this.title;}
    public void setTitle(String title){this.title = title;}

    public String getResponseOne(){return this.responseOne;}
    public void setResponseOne(String responseOne){ this.responseOne = responseOne;}

    public String getResponseTwo(){ return this.responseTwo;}
    public void setResponseTwo(String responseTwo){}

    public String getResponseThree(){return this.responseThree;}
    public void setResponseThree(String responseThree){ this.responseThree = responseThree;}

    public String getResponseFour(){return this.responseFour;}
    public void setResponseFour(String responseFour){this.responseFour = responseFour;}

    public String getTheme(){return this.theme;}
    public void setTheme(String theme){this.theme = responseFour;}

    public int getGoodResponse(){return this.goodResponse;}
    public void setGoodResponse(int goodResponse){this.goodResponse = goodResponse;}
}
