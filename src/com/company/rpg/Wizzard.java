package com.company.rpg;

public class Wizzard extends Personaj{// Класс наследник от класса для выполнения действий персонажа. Класс "Маг"

    //============ конструкторы ===============
    public Wizzard(int health,int manna, Weapon weapon) {//Конструктор где броня по дефолту равна нулю для мага
        super(health, manna,0,weapon);
    }//Конструктор где броня по дефолту равна нулю для мага
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
