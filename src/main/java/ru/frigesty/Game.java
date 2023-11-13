package ru.frigesty;

public class Game {
    private String gameName;
    private String developer;
    private int price;

    public Game(String gameName, String developer, int price){
        this.gameName = gameName;
        this.developer = developer;
        this.price = price;
    }

    public String getGameName(){
        return this.gameName;
    }
}