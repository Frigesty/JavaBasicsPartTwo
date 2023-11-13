package ru.frigesty;

import java.util.HashMap;
import java.util.Map;

public class MapImplementation {

    Map<Integer, Game> games = new HashMap<>();

    public void addGame(Game gameName){
        Integer key = games.size() + 1;
        games.put(key, gameName);
    }

    public void printGameNames(){
        for (var entry : games.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ". Value: " + entry.getValue().getGameName());
        }
    }

    public void deleteGame(Game gameName){
        games.entrySet().removeIf(entry -> entry.getValue().equals(gameName));
    }

    public void findGame(Game value){
        System.out.println(games.containsValue(value));
    }
}