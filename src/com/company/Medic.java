package com.company;

public class Medic extends Hero {
   int healPoints;

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность МЕЧ. ");


    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public void increaseExperence(){
        System.out.println(healPoints+=healPoints/10);
    }
}
