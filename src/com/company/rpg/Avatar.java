package com.company.rpg;

public class Avatar { // База хранения данных на момент работы игры
    //=========== Поля данных =================
    private String Name; // Имя персонажа
    private int progres; // Сколько сюжета пройдено
    private int lvl; // Уровень персонажа
    private Race race; // расса персонажа
    private Class _class; // Класс персонажа
    private Personaj pers; // Класс для выполнения действий персонажа
    //============ конструкторы ===============
    public Avatar(String Name,Race race,int lvl,int progres,Class _class,Personaj pers){// Конструктор для загрузки старого персонажа
        this.Name = Name;
        this.pers = pers;
        this.progres = progres;
        this.lvl = lvl;
        this.race = race;
        this._class = _class;
    }// Конструктор для загрузки старого персонажа
    public Avatar(String Name,Race race,int lvl,int progres,Wizzard pers){// Конструктор для загрузки старого персонажа
        this.Name = Name;
        this.pers = pers;
        this.progres = progres;
        this.lvl = lvl;
        this.race = race;
        this._class = Class.wizard;
    }// Конструктор для загрузки старого персонажа мага
    public Avatar(String Name,Race race,int lvl,int progres,Warrior pers){// Конструктор для загрузки старого персонажа
        this.Name = Name;
        this.pers = pers;
        this.progres = progres;
        this.lvl = lvl;
        this.race = race;
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

}
