package ru.frigesty;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {

    Queue<Game> games = new LinkedList<>();

    public void addGame(Game gameName){
        games.add(gameName);
    }

    public void printGameNames(){
        Iterator<Game> iterator = games.iterator();
        if(iterator.hasNext()){
            do{
                System.out.println(iterator.next().getGameName());
            }
            while (iterator.hasNext());
        }
    }

    public void deleteGame(Game gameName){
        games.remove(gameName);
    }

    public void presenceOfTheGameInTheQueue(Game value){
        System.out.println(games.contains(value));
    }

    public void findGame(Game value){
        System.out.println(games.contains(value));
    }
}