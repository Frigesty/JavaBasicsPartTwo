package ru.frigesty;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetImlementation {
    Set<Game> games = new HashSet<>();

    public void addGame(Game gameName){
        games.add(gameName);
    }

    public void printGameNames(){
        Iterator<Game> i = games.iterator();
        while (i.hasNext())
            System.out.println(i.next().getGameName());
    }

    public void deleteGame(Game gameName){
        games.remove(gameName);
    }

    public void presenceOfTheGameInTheSet(Game value){
        System.out.println(games.contains(value));
    }
}