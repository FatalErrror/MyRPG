package com.company.rpg;

public abstract class Personaj {// Класс для выполнения действий персонажа
    //=========== Поля данных =================
    private Weapon weapon;
    private int health;
    private int manna;
    private int armor;
    //============ конструкторы ===============
    public Personaj(int health,int manna,int armor, Weapon weapon) {// Общий вид конструктора со всеми полями
        this.manna = manna;
        this.armor = armor;
        this.weapon = weapon;
        this.health = health;
    }// Общий вид конструктора со всеми полями
    //=========== геторы ==============
    public int getHealth() {
        return health;
    }
    public Weapon getWeapon() {
        return weapon;
    }
    public int getManna() {
        return manna;
    }
    public int getArmor() {
        return armor;
    }
    //=========== сеторы ===================
    public void setManna(int manna) {
        this.manna = manna;
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    //== Обязательные абстрактные методы действий для классов наследников ==
    public abstract void move(); // передвижение
    public abstract void attac(); // атака
    public abstract void defend(); // защита
}
