package com.company;

public class Main {

    public static void main(String[] args) {

  /* Player player = new Player();
    player.name  ="Paolo";
   player.health = 20;
   player.weapon = "sword";

    int damage = 10;
    player.loseHealth(damage);
        System.out.println("remaning healt = " + player.healtRemaining());

    damage = 11;
    player.health = 200;
    player.loseHealth(damage);
        System.out.println("remaning healt = " + player.healtRemaining());
*/


  EnhancedPlayer player = new EnhancedPlayer("Paolo", 200, "sword");

  System.out.println("Initial healt is " + player.getHitPoints());






    }
}
