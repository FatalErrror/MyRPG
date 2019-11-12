package com.company.rpg;

public enum Class {//варианты класса персонажа
    //Маг  ,Воин
     wizard("маг"),warrior("воин");
    String _class;
     Class(String _class){
         this._class = _class;
     }

}
