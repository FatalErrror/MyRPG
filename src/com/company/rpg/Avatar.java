package com.company.rpg;

import java.util.Scanner;

public class Avatar { // База хранения данных на момент работы игры
    //=========== Поля данных =================
    private String Name; // Имя персонажа
    private int progres; // Сколько сюжета пройдено
    private int lvl; // Уровень персонажа
    private Race race; // расса персонажа
    private Class _class; // Класс персонажа
    int money = 0;// добавить в конструктор
    private Personaj pers; // Класс для выполнения действий персонажа
    //============ конструкторы ===============
    public Avatar(String Name,Race race,int lvl,int progres,Class _class,int money,Personaj pers){// Конструктор для загрузки старого персонажа
        this.Name = Name;
        this.pers = pers;
        this.progres = progres;
        this.lvl = lvl;
        this.race = race;
        this._class = _class;
        this.money = money;
    }// Конструктор для загрузки старого персонажа
    public Avatar(String Name,Race race,int lvl,int progres,int money,Wizzard pers){// Конструктор для загрузки старого персонажа
        this.Name = Name;
        this.pers = pers;
        this.progres = progres;
        this.lvl = lvl;
        this.race = race;
        this.money = money;
        this._class = Class.wizard;
    }// Конструктор для загрузки старого персонажа мага
    public Avatar(String Name,Race race,int lvl,int progres,int money,Warrior pers){// Конструктор для загрузки старого персонажа
        this.Name = Name;
        this.pers = pers;
        this.progres = progres;
        this.lvl = lvl;
        this.race = race;
        this.money = money;
        this._class = Class.warrior;
    }// Конструктор для загрузки старого персонажа воина
    public Avatar(String Name,Race race, Class _class, Personaj pers){// Конструктор для создания нового персонажа
        this.Name = Name;
        this.pers = pers;
        this.progres = 0;
        this.lvl = 1;
        this._class = _class;
        this.race = race;
    }// Конструктор для создания нового персонажа
    public Avatar(String Name,Race race, Wizzard pers){// Конструктор для создания нового персонажа
        this.Name = Name;
        this.pers = pers;
        this.progres = 0;
        this.lvl = 1;
        this._class = Class.wizard;
        this.race = race;
    }// Конструктор для создания нового персонажа мага
    public Avatar(String Name,Race race, Warrior pers){// Конструктор для создания нового персонажа
        this.Name = Name;
        this.pers = pers;
        this.progres = 0;
        this.lvl = 1;
        this._class = Class.warrior;
        this.race = race;
    }// Конструктор для создания нового персонажа вона
    //=========== геторы ==============
    public int getLvl() {
        return lvl;
    }
    public Class get_class() {
        return _class;
    }
    public Race getRace() {
        return race;
    }
    public String getName() {
        return Name;
    }
    public Personaj getPers() {
        return pers;
    }
    public int getProgres() {
        return progres;
    }
    //=========== сеторы ===================
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
    public void setProgres(int progres) {
        this.progres = progres;
    }
    public void setPers(Personaj pers) {
        this.pers = pers;
    }
    //============== методы ===================
    public static Avatar create(){//Создание нового персонажа
        Scanner in = new Scanner(System.in);
        String Name; // Имя персонажа
        Race race = null; // расса персонажа
        Personaj pers; // Класс для выполнения действий персонажа
        System.out.print("Введите имя персонажа: ");
        Name = in.nextLine();
        res.TwoLine();
        System.out.println(res.SwitchRace);
        switch (Game.getAnswer(new char[] {'1','2','3'})){
            case '1':race = Race.Elf;break;
            case '2':race = Race.Human;break;
            case '3':race = Race.Dwarf;break;
        }
        System.out.println(res.SwitchClass);
        if (Game.getAnswer(new char[] {'1','2'})=='1'){

            return new Avatar(Name,race,new Wizzard(90,60,race.magicweapon));
        }else {

            return new Avatar(Name,race,new Warrior(100,20,race.coolweapon));
        }
    }//Создание нового персонажа
    public void getCharacrteristic(){//Вывод характеристик
        System.out.println("Ваши характеристики:");
        System.out.println("Ваше имя: "+Name);
        System.out.println("Ваш прогрес в игре: "+progres+"%");
        System.out.println("Ваш уровень: "+lvl+" lvl");
        System.out.println("Ваша расса: "+race.race);
        System.out.println("Ваш класс: "+_class._class);
        System.out.println("Здоровье: "+pers.getHealth());
        if (_class == Class.wizard){
            System.out.println("Манна: "+pers.getManna());
        }else {
            System.out.println("Броня: "+pers.getArmor());
        }
        System.out.println("Вы имеете: "+money+" монет");
        System.out.println("Ваше оружие: "+pers.getWeapon().name);
        System.out.println("Характеристики вашего оружия: ");
        if (_class == Class.wizard){
            System.out.println("Описание:\n"+pers.getWeapon().description);
            System.out.println("Затраты манны: "+pers.getWeapon().needmana*lvl);
            System.out.println("Урон: "+pers.getWeapon().damage*lvl);
            System.out.println("Дальность атаки: "+pers.getWeapon().distance*lvl);
            System.out.println("Защита: "+pers.getWeapon().defend*lvl);
        }else {
            System.out.println("Описание:\n"+pers.getWeapon().description);
            System.out.println("Урон: "+pers.getWeapon().damage*lvl);
            System.out.println("Дальность атаки: "+pers.getWeapon().distance*lvl);
            System.out.println("Защита: "+pers.getWeapon().defend*lvl);
        }
        res.TwoLine();
    }//Вывод характеристик
}
