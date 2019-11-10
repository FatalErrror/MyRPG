package com.company.rpg;
import java.util.Scanner;

import static java.lang.System.*;

public class Game {
    public static Avatar avatar;
    public static void main(String[] args) {
        Story story = new Story();
        out.println(res.Start);
        out.println(res.Start_1);
       if ( getAnswer(new char[] {'1','2'}) == '1'){

           out.println(res.StartGame);
           avatar = Avatar.create();
           out.println("Вы создали своего персонажа,\nВеликого "+avatar.get_class()._class+"а,\nЧто спасёт этот мир от зла");
           res.TwoLine();
           avatar.getCharacrteristic();
           story.StartStory(avatar.getProgres());
       }else{
           res.TwoLine();
           avatar = SaveAndLoadAvatar.loadAvatar();
           out.println("Вы вернулись в игру, "+avatar.getName()+"\n"+"Мы рады вас приветствовать");
           res.TwoLine();
           avatar.getCharacrteristic();
           out.println("И да продолжиться история");
           res.TwoLine();
           story.StartStory(avatar.getProgres());
       }

    }
    //============== методы ===================
    static char getAnswer(char[] Case){
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
    public static void SaveAndOut(){

        SaveAndLoadAvatar.saveAvatar(avatar);
        exit(0);
    }
}
