package com.company.rpg;
import java.util.Scanner;
import static java.lang.System.*;

public class Story {

    //=========== Поля данных =================
    boolean endTask = false;
    //============ конструкторы ===============

    //============== методы ===================
    public void StartStory(int progres){
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
        }
    }
    void episode_1(){
        out.println("Ваша история начинается сдесь и сейчас");
        out.println("Вам выбирать что будет дальше и как закончится эта история");

    }
    void episode_2(){
        endTask=false;
        while(!endTask){
            town();
        }
    }
    void town(){
        out.println(res.InTown+(Game.avatar.get_class()==Class.wizard?"Купить Зелье манны":"Сходить к кузнецу"));
        res.OneLine();
        switch (getAnswer(new char[] {'1','2','3','4','5','6'})){
            case '1':Game.SaveAndOut();break;
            case '2':cave();break;
            case '3':task();break;
            case '4':Game.avatar.getCharacrteristic();break;
            case '5':;break;
            case '6':;break;
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
            out.println("Теперь у вас "+Game.avatar.money+" монет");
        }else {

        }
    }

    void task(){

        endTask =true;
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

