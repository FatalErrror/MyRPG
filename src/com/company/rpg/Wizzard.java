package com.company.rpg;

public class Wizzard extends Personaj{// Класс наследник от класса для выполнения действий персонажа. Класс "Маг"

    //============ конструкторы ===============
    public Wizzard(int health,int MaxManna, Weapon weapon) {//Конструктор где броня по дефолту равна нулю для нового мага
        super(health, MaxManna,0,weapon);
    }//Конструктор где броня по дефолту равна нулю для нового мага
    public Wizzard(int health,int MaxManna,int manna, Weapon weapon) {//Конструктор где броня по дефолту равна нулю для старого мага
        super(health, MaxManna,0,manna,0,weapon);
    }//Конструктор где броня по дефолту равна нулю для старого мага
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
