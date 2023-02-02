//Реализовать абстрактный класс Warrior, с полями name, weapon, healthPoint
//        Создать интерфейс Weapon с методом damage(), который будет показывать наносимый урон
//        На основе класса Warrior создать различные типы воинов, например, лучник, меченосец,
//        ополченец и т.п. У лучника добавить поле расстояние поражения.
//        Создать различные виды вооружения, например, меч, лук, лопата. Обеспечить, чтобы определенный
//        тип воина мог нести только определенной оружие
//        Создать класс командира

//На основе работы на уроке. Создать класс щита, разработать разные типы щитов, добавить в семейство
//        классов Warriors обобщения в виде щитов. Реструктуризировать код в конечных классах семейства Warriors.
//        Добавить метод определения минимального щита в команде.
//        * Продумать, как можно сделать воина без щита.

package org.example;

import org.example.Shields.Buckler;
import org.example.Shields.Hoplon;
import org.example.Wepons.Bow;
import org.example.Wepons.Sword;
import org.example.Wepons.Weapon;

public class Main {
    public static void main(String[] args) {

        Team<Swordman> team1 = new Team<>();
        Team<Archer> team2 = new Team<>();
        team1.addWariorTeam(new Swordman(
                        "Человек Макс",
                        15,
                        new Sword(15),
                        new Hoplon(20))
                )
                .addWariorTeam(new Swordman(
                        "Человек Ветр",
                        15,
                        new Sword(25),
                        new Buckler(40))
                );

        for (Swordman swordman : team1) {
            System.out.println(swordman);
        }

        team2.addWariorTeam(new Archer(
                        "Эльф Леголас",
                        15,
                        new Bow(30, 40))
                )
                .addWariorTeam(new Archer(
                        "Эльф Калеил",
                        15,
                        new Bow(25, 48))
                );


        for (Archer archer : team2) {
            System.out.println(archer);
        }
        System.out.println("___________________");
        System.out.println(team1.maxRange());
        System.out.println(team2.maxRange());
        System.out.println("___________________");
        System.out.println("Минимальный щит в команде : ");

        System.out.println("team1 " + team1.minProtection());
        System.out.println("team2 " + team2.minProtection());
    }
}