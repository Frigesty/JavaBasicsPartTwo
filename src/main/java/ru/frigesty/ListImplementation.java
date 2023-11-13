package ru.frigesty;

import java.util.ArrayList;
import java.util.List;

public class ListImplementation {
    List<Game> games = new ArrayList<>();

    public void addGame(Game gameName){
        games.add(gameName);
    }

    public void printGameNames(){
        for (int i = 0; i < games.size(); i++) {
            System.out.println("Game name: " + games.get(i).getGameName());
        }
    }

    public void deleteGame(Game gameName){
        games.remove(gameName);
    }

    public void presenceOfTheGameInTheList(Game value){
        System.out.println(games.contains(value));
    }

    public void printGameIndex(Game value){
        int gameIndex = games.indexOf(value);
        System.out.println(gameIndex);
    }

    public void printGameByIndex(int index){
        System.out.println("Игра по индексу " + index + ": " + games.get(index).getGameName());
    }

    public void setByIndex(int index, Game gameName){
        games.set(index, gameName);
        System.out.println("Измеинили значение в индексе " + index + " на " + gameName.getGameName());
    }

    public void addByIndex(int index, Game gameName){
        games.set(index, gameName);
        System.out.println("Внесли значение " + gameName.getGameName() + " в индекс " + index + ".");
    }
}