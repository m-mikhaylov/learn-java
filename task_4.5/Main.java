/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/

public class Main{
    public static void main(String[] args) {
        Horse horse = new Horse("Бьюти", "Пегая", 10);
        horse.run();
        Pegasus pegasus = new Pegasus("Икар", "Мифическая", 1001);
        pegasus.fly();
    }
}


abstract class Animal {
    private String nickname;
    private String breed;
    private int age;

    public Animal(String nickname, String breed, int age) {
        this.nickname = nickname;
        this.breed = breed;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }
}


class Horse extends Animal {
    public Horse(String nickname, String breed, int age) {
        super(nickname, breed, age); }   
        
    public void run(){ System.out.println("Игого, я поскакал(а)"); }    
}

class Pegasus extends Horse {
     public Pegasus(String nickname, String breed, int age) {
        super(nickname, breed, age); }
        
    public void fly(){ System.out.println("Игого, я полетел(а)");  } 
}

