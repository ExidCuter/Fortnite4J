package xyz.dodo.fortnite;


import xyz.dodo.entity.FortniteData;
import xyz.dodo.parser.HTTPParser;
import xyz.dodo.parser.JSONParser;

import java.util.concurrent.TimeUnit;

public class Fortnite {
    private String apiKey;

    public Fortnite(String apyKey) {
        this.apiKey = apyKey;
    }

    public FortniteData getPlayerInfo(String platform, String nickname) {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return JSONParser.getDataFromJSON(HTTPParser.getStatsfromNickname(platform, nickname, apiKey));
    }
}
