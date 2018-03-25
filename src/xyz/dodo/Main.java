package xyz.dodo;

import xyz.dodo.entity.FortniteData;
import xyz.dodo.entity.League;
import xyz.dodo.fortnite.Fortnite;

public class Main {
    public static void main(String[] args) {
        Fortnite fortnite = new Fortnite("YOUR-API-KEY");

        FortniteData data = fortnite.getPlayerInfo("pc", "ExidCuter"); // this is me
        if (data.getResult().isOk()){
           System.out.println(data.getId());
           System.out.println(data.getPlayer());
           System.out.println();
            System.out.println(data.getLeague(League.Mode.life_time));
        } else {
            System.out.println(data.getResult());
        }
    }
}
