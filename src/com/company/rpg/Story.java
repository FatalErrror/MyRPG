package com.company.rpg;

import java.util.Scanner;

import static java.lang.System.*;

public class Story {

    //=========== Поля данных =================

    //============ конструкторы ===============

    //============== методы ===================
    public void StartStory(int progres){
        switch (progres+1){
            case 1: episode_1();break;
            case 2: break;
            case 3: break;
            case 4: break;
            case 5: break;
            case 6: break;
            case 7: break;
            case 8: break;
            case 9: break;
            case 10: break;
            case 11: break;
            case 12: break;
            case 13: break;
            case 14: break;
            case 15: break;
            case 16: break;
            case 17: break;
            case 18: break;
            case 19: break;
            case 20: break;
        }
    }
    void episode_1(){
        out.println("Ваша история начинается сдесь и сейчас");
        out.println("Вам выбирать что будет дальше и как закончится эта история");
        for (int i = 0; i < 3; i++) {
            town();
        }
    }
    void town(){
        out.println("1) Сохронить и выйти 2) Пойти изучать подземелья\n3) Отправится на задание 4) Показать характеристики");
        res.OneLine();
        switch (getAnswer(new char[] {'1','2','3','4'})){
            case '1':Game.SaveAndOut();break;
            case '2':cave();break;
            case '3':task();break;
            case '4':Game.avatar.getCharacrteristic();break;
        }
    }

    void cave(){
        out.println("Вы спускаетесь в подземелье рядом с городом...");
        out.println("Бродя по подземелью вы натыкаетесь на дрягоценный камень и подбираете его...");
        out.println("Походив по подземелью ещё немного вы собираетесь возвращатся,\nНо вот не задача на обратном пути вам встречается монстр");
        out.println("Вы достаёте своё оружие и начинаете сражаться...");
        if (batle()){
            Game.avatar.money += 10;
            out.println("Победив вы возвращаетесь в город и продаёте камень что нашли в подземелье...");
            out.println("теперь у вас "+Game.avatar.money+" монет");
        }else {

        }
    }

    void task(){

    }

    boolean batle(){
        return true;
    }
    char getAnswer(char[] Case){
        char answer;
        boolean truein;
        truein = false;
        Scanner in = new Scanner(System.in);
        answer = in.nextLine().charAt(0);
        while (!truein){
            for (int i = 0; i < Case.length; i++) {
                truein = answer == Case[i];
                if (truein ) {
                    res.TwoLine();
                    return answer;
                }
            }
            out.println(res.InputError);
            answer = in.nextLine().charAt(0);
        }
        return ' ';
    } //Получение ответа из списка char
}

