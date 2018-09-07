package xyz.dodo.fortnite.entity;

import java.util.ArrayList;
import java.util.List;

public class FortniteData {
    String id;
    Player player;
    List<League> leagues;
    SuccessCode result;

    public String getId() {
        return id;
    }

    public Player getPlayer() {
        return player;
    }

    public List<League> getLeagues() {
        return leagues;
    }

    public League getLeague(League.Mode mode) {
        for (League league : leagues) {
            if (league.getMode() == mode) {
                return league;
            }
        }
        return new League();
    }

    public SuccessCode getResult() {
        return result;
    }


    public FortniteData(SuccessCode result) {
        id = "-999999";
        player = new Player("unknown", "No Data", "Error");
        leagues = new ArrayList<>();
        this.result = result;
    }

    public FortniteData(String id, Player player, List<League> leagues, SuccessCode result) {
        this.id = id;
        this.player = player;
        this.leagues = leagues;
        this.result = result;
    }

    @Override
    public String toString() {
        return "FortniteData{" +
                "id=" + id +
                ", player=" + player +
                ", leagues=" + leagues +
                '}';
    }
}
