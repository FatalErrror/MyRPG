package com.company.rpg;

public class Warrior extends Personaj {// Класс наследник от класса для выполнения действий персонажа. Класс "Воин"

    //============ конструкторы ===============
    public Warrior(int health,int armor, Weapon weapon) {//Конструктор где манна по дефолту равна нулю для воина
        super(health, 0,armor,weapon);
    }//Конструктор где манна по дефолту равна нулю для воина
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
