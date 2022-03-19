package com.company;

public class Main {

    public static void main(String[] args) {
Medic medic= new Medic();
medic.setHealPoints(10);

Hero heros[]={ new  Magic(), new  Medic(), new  Warrior()};
        for (int i = 0; i <heros.length ; i++) {
            heros[i].applySuperAbility();
            medic.increaseExperence();
        }

    }

    }

