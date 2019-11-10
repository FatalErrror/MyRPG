package com.company.rpg;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class SaveAndLoadAvatar {
    //=========== Поля данных =================
    final static String patch = ".\\src\\Resurses\\Date.txt";// Расположения файла с данными
    //Структура файла Date.txt
    //   ||
    //   \/
      /*
    № строки| что хранит     | В какой тип надо преоброзовать | номер в массиве
    ---------------------------------------------------------------------------
          1)| Имя персонажа  | <String>                       | 0
          2)| Расса персонажа| <enum Race>                    | 1
          3)| Прогрес        | <int>                          | 2
          4)| Клас персонажа | <Class>                        | 3
          5)| Здоровье       | <int>                          | 4
          6)| Оружие         | <enum Weapon>                  | 5
          7)| Манна/Броня    | <int>                          | 6
          8)| lvl            | <int>                          | 7
          9)| Монет          | <int>                          | 8
    */

    //================ методы ==================
    public static Avatar loadAvatar() {// Превращение массива строк в класс "Avatar"
        String[] date = LoadStream();//получение массива
        Personaj personaj;//Создание обекта "Personaj"

        if (date[3] == Class.wizard.name()) {// Если класс Маг то
            personaj = new Wizzard(Integer.parseInt(date[4]), Integer.parseInt(date[6]), Weapon.valueOf(date[5]));//Инициализация объекта как Маг
        } else {// иначе
            personaj = new Warrior(Integer.parseInt(date[4]), Integer.parseInt(date[6]), Weapon.valueOf(date[5]));//Инициализация объекта как Воин
        }
        Avatar avatar = new Avatar(date[0], Race.valueOf(date[1]), Integer.parseInt(date[7]), Integer.parseInt(date[2]), Class.valueOf(date[3]),Integer.parseInt(date[8]), personaj);//Создание и инициализация объеката "Avatar"
        return avatar; //Возврат инициализированного объекта "Avatar"
    }// Превращение массива строк в класс "Avatar"

    public static void saveAvatar(Avatar avatar) {// Превращение класса "Avatar" в массив строк
        String[] date = new String[9]; // Создание массива
        //== заполнение масива даннами ==
        date[0] = avatar.getName();//.get___ это получение полей через геторы
        date[1] = avatar.getRace().name();//.name() это превращение enum в строку//.get___ это получение полей через геторы
        date[2] = avatar.getProgres() + "";// +"" это способ присвоить строке число//.get___ это получение полей через геторы
        date[3] = avatar.get_class().name();//.name() это превращение enum в строку//.get___ это получение полей через геторы
        date[4] = avatar.getPers().getHealth() + "";// +"" это способ присвоить строке число//.get___ это получение полей через геторы
        date[5] = avatar.getPers().getWeapon().name();//.name() это превращение enum в строку//.get___ это получение полей через геторы
        date[6] = date[3] == Class.wizard.name() ? avatar.getPers().getManna() + "" : avatar.getPers().getArmor() + "";//проверка класса и взятие нужных данных
        date[7] = avatar.getLvl() + "";// +"" это способ присвоить строке число//.get___ это получение полей через геторы
        date[8] = avatar.money+"";
        //================================
        WriteStream(date);//передача масива метод для записи в фаил
    }// Превращение класса "Avatar" в массив строк

    private static String[] LoadStream() {// Чтение файла и запись данных в массив
        LineNumberReader lineNumberReader = null;// создание объекта "LineNumberReader"
        String[] date = new String[9];// создание масива для данных из файла
        try {//обработка исключений
            lineNumberReader = new LineNumberReader(new FileReader(patch));//инициализация чтения строк с передачей ему пути к файлу
            for (int i = 0; i < date.length; i++) {//чтение 7 строк
                date[i] = lineNumberReader.readLine(); // запись строки в масив
            }

        } catch (Exception ex) {//обработка исключений
            ex.printStackTrace();
        } finally {
            try {//обработка исключений
                if (lineNumberReader != null) {//проверка инициализирован-ли ридер строки
                    lineNumberReader.close();//закрытие ридера строки
                }
            } catch (IOException ex) {//обработка исключений
                ex.printStackTrace();
            }
        }
        return date;// Возврат массива с данными
    }// Чтение файла и запись данных в массив

    private static void WriteStream(String[] date) { // Запись данных из массива в файл

        try {//обработка исключений
            //=== Стерание старых данных ===
            FileWriter fileWriter1 = new FileWriter(patch, false);//создание и инициализация оъекта для записи в фаил (<путь к файлу>,<указание нужно-ли сохранять старый данные>)
            fileWriter1.write("");//запись пустой строки
            fileWriter1.close();//закрытие врайтера строки
            //==============================
            FileWriter fileWriter = new FileWriter(patch, true);//создание и инициализация оъекта для записи в фаил (<путь к файлу>,<указание нужно-ли сохранять старый данные>)
            for (int i = 0; i < 9; i++) {//запись 7 строк
                fileWriter.write(date[i] + "\n");//запись данных из массива в строку// + "\n" это переход на следующию строку
            }
            fileWriter.close();//закрытие врайтера строки
        } catch (IOException e) {//обработка исключений
            e.printStackTrace();
        }
    }// Запись данных из массива в файл
}
