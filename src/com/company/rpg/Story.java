package com.company.rpg;
import java.util.Scanner;
import static java.lang.System.*;

import java.util.Scanner;

import static java.lang.System.*;

public class Story {
<<<<<<< HEAD
=======

    //=========== Поля данных =================
>>>>>>> master

    //=========== Поля данных =================
    boolean endTask = false;
    //============ конструкторы ===============

    //============== методы ===================
    public void StartStory(int progres){
<<<<<<< HEAD
        switch (progres/5 +1){
            case 1: episode_1();Game.avatar.progres +=5;break;
            case 2: episode_2();Game.avatar.progres +=5;break;
            case 3: Game.avatar.progres +=5;break;
            case 4: Game.avatar.progres +=5;break;
            case 5: Game.avatar.progres +=5;break;
            case 6: Game.avatar.progres +=5;break;
            case 7: Game.avatar.progres +=5;break;
            case 8: Game.avatar.progres +=5;break;
            case 9: Game.avatar.progres +=5;break;
            case 10: Game.avatar.progres +=5;break;
            case 11: Game.avatar.progres +=5;break;
            case 12: Game.avatar.progres +=5;break;
            case 13: Game.avatar.progres +=5;break;
            case 14: Game.avatar.progres +=5;break;
            case 15: Game.avatar.progres +=5;break;
            case 16: Game.avatar.progres +=5;break;
            case 17: Game.avatar.progres +=5;break;
            case 18: Game.avatar.progres +=5;break;
            case 19: Game.avatar.progres +=5;break;
            case 20: Game.avatar.progres +=5;break;
=======
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
>>>>>>> master
        }
    }
    void episode_1(){
        out.println("Ваша история начинается сдесь и сейчас");
        out.println("Вам выбирать что будет дальше и как закончится эта история");
<<<<<<< HEAD

    }
    void episode_2(){
        endTask=false;
        while(!endTask){
=======
        for (int i = 0; i < 3; i++) {
>>>>>>> master
            town();
        }
    }
    void town(){
<<<<<<< HEAD
        out.println(res.InTown+(Game.avatar.get_class()==Class.wizard?"Купить Зелье манны":"Сходить к кузнецу"));
        res.OneLine();
        switch (getAnswer(new char[] {'1','2','3','4','5','6'})){
=======
        out.println("1) Сохронить и выйти 2) Пойти изучать подземелья\n3) Отправится на задание 4) Показать характеристики");
        res.OneLine();
        switch (getAnswer(new char[] {'1','2','3','4'})){
>>>>>>> master
            case '1':Game.SaveAndOut();break;
            case '2':cave();break;
            case '3':task();break;
            case '4':Game.avatar.getCharacrteristic();break;
<<<<<<< HEAD
            case '5':;break;
            case '6':;break;
        }
    }


=======
        }
    }

>>>>>>> master
    void cave(){
        out.println("Вы спускаетесь в подземелье рядом с городом...");
        out.println("Бродя по подземелью вы натыкаетесь на дрягоценный камень и подбираете его...");
        out.println("Походив по подземелью ещё немного вы собираетесь возвращатся,\nНо вот не задача на обратном пути вам встречается монстр");
        out.println("Вы достаёте своё оружие и начинаете сражаться...");
        if (batle()){
            Game.avatar.money += 10;
            out.println("Победив вы возвращаетесь в город и продаёте камень что нашли в подземелье...");
<<<<<<< HEAD
            out.println("Теперь у вас "+Game.avatar.money+" монет");
=======
            out.println("теперь у вас "+Game.avatar.money+" монет");
>>>>>>> master
        }else {

        }
    }

    void task(){

<<<<<<< HEAD
        endTask =true;
=======
>>>>>>> master
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

