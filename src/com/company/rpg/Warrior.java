package com.company.rpg;

public class Warrior extends Personaj {// Класс наследник от класса для выполнения действий персонажа. Класс "Воин"

    //============ конструкторы ===============
    public Warrior(int health,int MaxArmor, Weapon weapon) {//Конструктор где манна по дефолту равна нулю для нового воина
        super(health, 0,MaxArmor,weapon);
    }//Конструктор где манна по дефолту равна нулю для нового воина
    public Warrior(int health,int MaxArmor,int armor, Weapon weapon) {//Конструктор где манна по дефолту равна нулю для старого воина
        super(health, 0,MaxArmor,0,armor,weapon);
    }//Конструктор где манна по дефолту равна нулю для старого воина
    //== Обязательные методы действий из класса родителя ==
    @Override
    public void move() {

    }// передвижение
    @Override
    public void attac() {

    }// атака
    @Override
    public void defend() {

    }// защита
}
