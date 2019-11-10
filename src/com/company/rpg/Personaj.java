package com.company.rpg;

public abstract class Personaj {// Класс для выполнения действий персонажа
    //=========== Поля данных =================
    private int expirence;
    private Weapon weapon;
    private int health;
    private int manna;
    private int armor;
    private int MaxManna;
    private int MaxArmor;
    //============ конструкторы ===============
    public Personaj(int health,int MaxManna,int MaxArmor, Weapon weapon) {// Общий вид конструктора со всеми полями для нового перса
        this.manna = MaxManna;
        this.armor = MaxArmor;
        this.MaxArmor = MaxArmor;
        this.MaxManna = MaxManna;
        this.weapon = weapon;
        this.health = health;
    }// Общий вид конструктора со всеми полями для нового перса
    public Personaj(int health,int MaxManna,int MaxArmor,int manna,int armor, Weapon weapon) {// Общий вид конструктора со всеми полями для старого перса
        this.MaxArmor = MaxArmor;
        this.MaxManna = MaxManna;
        this.manna = manna;
        this.armor = armor;
        this.weapon = weapon;
        this.health = health;
    }// Общий вид конструктора со всеми полями для старого перса
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
    public int getMaxManna() {
        return MaxManna;
    }
    public int getMaxArmor() {
        return MaxArmor;
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
    public void setMaxManna(int maxManna) {
        MaxManna = maxManna;
    }
    public void setMaxArmor(int maxArmor) {
        MaxArmor = maxArmor;
    }
    //== Обязательные абстрактные методы действий для классов наследников ==
    public abstract void move(); // передвижение
    public abstract void attac(); // атака
    public abstract void defend(); // защита
}
