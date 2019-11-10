package com.company.rpg;

public enum Race {//варианты рассы персонажа
    //эльф,человек,дварф(гном)

    Elf (
           "Эльф",
        Weapon.staff,
        Weapon.bow
        ),
    Human (
            "Человек",
        Weapon.wizzardbook,
        Weapon.sword
    ),
    Dwarf (
            "Дварф",
        Weapon.glove,
        Weapon.axe
        );
    public String race;
    public Weapon magicweapon;
    public Weapon coolweapon;
    Race(String race,Weapon magicweapon,Weapon coolweapon){
        this.race = race;
        this.magicweapon = magicweapon;
        this.coolweapon = coolweapon;
    }
}
