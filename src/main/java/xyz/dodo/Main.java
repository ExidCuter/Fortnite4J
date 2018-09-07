package xyz.dodo;

import xyz.dodo.fortnite.entity.FortniteData;
import xyz.dodo.fortnite.entity.League;
import xyz.dodo.fortnite.Fortnite;

public class Main {
    public static void main(String[] args) {
        Fortnite fortnite = new Fortnite("a293af93-e11a-41a7-93fe-3bdb2206728b");

        FortniteData data = fortnite.getPlayerInfo("pc", "DodoDodovic"); // this is me
        if (data.getResult().isOk()){
           System.out.println(data.getId());
           System.out.println(data.getPlayer());
           System.out.println(data.getLeague(League.Mode.life_time));
        } else {
            System.out.println(data.getResult());
        }
    }
}
