/*
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
Требования:
•	Программа не должна считывать данные с клавиатуры.
•	У класса Dog должна быть переменная name с типом String.
•	У класса Dog должна быть переменная age с типом int.
•	У класса должен быть сеттер для переменной name.
•	У класса должен быть геттер для переменной name.
•	У класса должен быть сеттер для переменной age.
•	У класса должен быть геттер для переменной age.
*/


public class Main {
    public static void main(String[] args) {

    }
}

public class Dog {
    private String name;
    private int age;
    
    public void setName (Strint name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setAge (int age) {
        this.age = age;
    }
    
    public String getAge() {
        return this.age;
    }
    
}

