package ru.frigesty;

public class Main {

    public static void main(String[] args) {
        Game witcher = new Game("The Witcher 3", "CD PROJEKT RED", 1102);
        Game gtaV = new Game("Grand Theft Auto V", "Rockstar North", 1378);
        Game bg3 = new Game("Baldur's Gate 3", "Larian Studios", 1999);
        Game rust = new Game("Rust", "Facepunch Studios", 1100);
        Game rdr2 = new Game("Red Dead Redemption 2", "Rockstar North", 2300);
        Game cyberpunk = new Game("Cyberpunk 2077", "CD PROJEKT RED", 2576);

        ListImplementation list = new ListImplementation();
        SetImlementation set = new SetImlementation();
        MapImplementation map = new MapImplementation();
        QueueImplementation queue = new QueueImplementation();

        System.out.println("Ниже представлена реализация в классе ListImplementation цикла `for` с коллекцией List.");
        System.out.println("Добавим несколько игр в List:");
        list.addGame(witcher);
        list.addGame(rdr2);
        list.addGame(witcher);
        list.addGame(gtaV);
        list.addGame(cyberpunk);
        list.addGame(gtaV);
        list.printGameNames();
        System.out.println("Игра `Grand Theft Auto V` есть в List?");
        list.presenceOfTheGameInTheList(gtaV);
        System.out.println("Узнаем индекс игры `Cyberpunk 2077`.");
        list.printGameIndex(cyberpunk);
        System.out.println("Игра `Rust` есть в List?");
        list.presenceOfTheGameInTheList(rust);
        System.out.println("Теперь удалим игру The Witcher 3.");
        list.deleteGame(witcher);
        System.out.println("Результат после удаления игры:");
        list.printGameNames();
        System.out.println("Изменим значение в идексе 3.");
        list.setByIndex(3,bg3);
        System.out.println("Результат после изменения:");
        list.printGameNames();
        System.out.println("Выведем игру по индексу 4.");
        list.printGameByIndex(4);
        System.out.println("Добавим значение на идекс 2.");
        list.addByIndex(2, rust);
        System.out.println("Результат после добавления:");
        list.printGameNames();
        System.out.println(" ");

        System.out.println("Ниже представлена реализация в классе ListImplementation цикла `while` с коллекцией Set.");
        System.out.println("Добавим несколько игр в Set:");
        set.addGame(witcher);
        set.addGame(rdr2);
        set.addGame(witcher);
        set.addGame(gtaV);
        set.addGame(cyberpunk);
        set.addGame(gtaV);
        set.printGameNames();
        System.out.println("Игра `Grand Theft Auto V` есть в set?");
        set.presenceOfTheGameInTheSet(gtaV);
        System.out.println("Игра `Rust` есть в set?");
        set.presenceOfTheGameInTheSet(rust);
        System.out.println("Теперь удалим игру The Witcher 3.");
        set.deleteGame(witcher);
        System.out.println("Результат после удаления игры:");
        set.printGameNames();
        System.out.println(" ");

        System.out.println("Ниже представлена реализация в классе MapImplementation цикла `for each` с коллекцией Map.");
        System.out.println("Добавим несколько игр в Map:");
        map.addGame(witcher);
        map.addGame(rdr2);
        map.addGame(witcher);
        map.addGame(gtaV);
        map.addGame(cyberpunk);
        map.addGame(gtaV);
        map.printGameNames();
        System.out.println("Игра `Red Dead Redemption 2` есть в Map?");
        map.findGame(rdr2);
        System.out.println("Теперь удалим игру The Witcher 3.");
        map.deleteGame(witcher);
        System.out.println("Результат после удаления игры:");
        map.printGameNames();
        System.out.println(" ");

        System.out.println("Ниже представлена реализация в классе QueueImplementation цикла `do while` с коллекцией Queue.");
        System.out.println("Добавим несколько игр в Queue:");
        queue.addGame(witcher);
        queue.addGame(rdr2);
        queue.addGame(witcher);
        queue.addGame(gtaV);
        queue.addGame(cyberpunk);
        queue.addGame(gtaV);
        queue.printGameNames();
        System.out.println("Игра `Red Dead Redemption 2` есть в queue?");
        queue.findGame(rdr2);
        System.out.println("Теперь удалим игру The Witcher 3.");
        queue.deleteGame(witcher);
        System.out.println("Результат после удаления игры:");
        queue.printGameNames();
    }
}