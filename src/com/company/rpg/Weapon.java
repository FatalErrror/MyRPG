package com.company.rpg;

public enum  Weapon {//варианты оружия
    //=========== Магические =============
    staff("Посох мага",
        "Магический посох, что сделан лучшеми эльфами из великого древа",//описание
        5,//затраты манны
        17,//урон
        20,//дальность атаки
        15//защита
        ),
    wizzardbook("Книга волшебника",
        "Книга, написанная человеком, с заклинаниями защиты и атаки, что сравнимы с магией эльфов",//описание
        7,//затраты манны
        15,//урон
        16,//дальность атаки
        20//защита
    ),
    glove("Магические перчатки",
        "Перчатки, созданные мастерами своего дела, и усиливающие тебя до невероятных высот",//описание
        6,//затраты манны
        22,//урон
        2,//дальность атаки
        10//защита
        ),
    hammer("Молот",
        "",//описание
        10,//затраты манны
        30,//урон
        5,//дальность атаки
        20//защита
        ),
    //============= Обычные ===============
    spear("Копьё",
        "",//описание
        19,//урон
        4,//дальность атаки
        10//защита
        ),
    axe("Топор",
        "Главное оружие всех дварфов, искусством владения которым они обучаются с детства",//описание
        25,//урон
        1,//дальность атаки
        25//защита
        ),
    sword("Мечь",
        "Невероятное оружие, которым владели все рассы и поколения",//описание
        20,//урон
        2,//дальность атаки
        30//защита
         ),

    bow("Лук",
        "Лук, чьи стрелы летят точно в яблочко",//описание
        18,//урон
        25,//дальность атаки
        2//защита
        );
    public String name;
    public String description;//описание
    public int needmana = 0;//затраты манны
    public int damage;//урон
    public int distance;//дальность атаки
    public int defend;//защита
    Weapon(String name,String description, int needmana, int damage, int distance, int defend) {
        this.name = name;
        this.description = description;
        this.needmana = needmana;
        this.damage = damage;
        this.distance = distance;
        this.defend = defend;
    }
    Weapon(String name,String description, int damage, int distance, int defend) {
        this.name = name;
        this.description = description;
        this.damage = damage;
        this.distance = distance;
        this.defend = defend;
    }
}
