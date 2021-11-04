package be.intecbrussel.monster;

import java.util.Random;

public class MonsterApp {
    public static void main(String[] args) {
        Bear myBear = new Bear(1, 50, 5);
        Witch myWitch = new Witch("My witch", 30, 100);


        Random order = new Random();

        int round = 1;


        while (myBear.getHitPoints() > 0 && myWitch.getHitPoints() > 0) {

            int i = order.nextInt(2);

            if (i == 1) {
                myWitch.takeDamage(myBear.bearClawAttack());
                if (myWitch.getHitPoints() <= 0) {
                    System.out.println("Round: " + round + " Witch is defeated");
                    break;
                } else {

                    myBear.takeDamage(myWitch.fireballAttack());

                    if (myBear.getHitPoints() <= 0) {
                        System.out.println("Round: " + round + " Bear is defeated");
                        break;
                    }
                }

            } else {
                myBear.takeDamage(myWitch.fireballAttack());
                if (myBear.getHitPoints() <= 0) {
                    System.out.println("Round: " + round + " Bear is defeated");
                    break;
                } else {
                    myWitch.takeDamage(myBear.bearClawAttack());
                    if (myWitch.getHitPoints() <= 0) {
                        System.out.println("Round: " + round + " Witch is defeated");
                        break;
                    }
                }
            }

            myBear.restoreRp(5);
            myWitch.restoreMp(4);


            System.out.println("Round: " + round + " There is no winner.");
            round++;
        }


    }
}
