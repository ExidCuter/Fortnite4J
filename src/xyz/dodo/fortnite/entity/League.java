package xyz.dodo.fortnite.entity;

import java.util.ArrayList;
import java.util.List;

public class League { //name by Oleksander
    public enum Mode {
        solo, duo, squad, solo_current, duo_current, squad_current, life_time, unknown
    }

    private Mode mode;
    private List<Stat> stats;


    public Mode getMode() {
        return mode;
    }

    public List<Stat> getStats() {
        return stats;
    }

    public League(String mode, List<Stat> stats) {
        this.mode = getModeFromString(mode);
        this.stats = stats;
    }

    public League() {
        this.mode = Mode.unknown;
        this.stats = new ArrayList<>();
    }

    public static Mode getModeFromString(String mode) {
        switch (mode) {
            case "p2":
                return Mode.solo;
            case "p10":
                return Mode.duo;
            case "p9":
                return Mode.squad;
            case "curr_p2":
                return Mode.solo_current;
            case "curr_p10":
                return Mode.duo_current;
            case "curr_p9":
                return Mode.squad_current;
            case "lifeTimeStats":
                return Mode.life_time;
            case "solo":
                return Mode.solo;
            case "duo":
                return Mode.duo;
            case "squad":
                return Mode.squad;
            case "currsolo":
                return Mode.solo_current;
            case "currduo":
                return Mode.duo_current;
            case "currsquad":
                return Mode.squad_current;
            case "life":
                return Mode.life_time;
        }
        return Mode.unknown;
    }

    @Override
    public String toString() {
        return "League{" +
                "mode=" + mode +
                ", stats=" + stats +
                '}';
    }
}
