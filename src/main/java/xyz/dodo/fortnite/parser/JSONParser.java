package xyz.dodo.fortnite.parser;

import org.json.JSONArray;
import xyz.dodo.fortnite.entity.*;
import org.json.JSONObject;

import java.util.ArrayList;

public class JSONParser {
    public static FortniteData getDataFromJSON(String json) {
        try {
            JSONObject jsonObject = new JSONObject(json);

            if (jsonObject.has("error")) {
                return new FortniteData(new SuccessCode(jsonObject.getString("error"), SuccessCode.Type.error));
            } else {
                JSONObject leagues = jsonObject.getJSONObject("stats");
                JSONArray lifeTimeJson = jsonObject.getJSONArray("lifeTimeStats");
                ArrayList<League> leaguesArray = new ArrayList<>();
                for (int i = 0; i < leagues.length(); i++) {
                    String leagueName = "";
                    ArrayList<Stat> statArray = new ArrayList<>();
                    JSONObject league = null;
                    try {
                        switch (i) {
                            case 0:
                                league = leagues.getJSONObject("p2");
                                leagueName = "p2";
                                break;
                            case 1:
                                league = leagues.getJSONObject("p10");
                                leagueName = "p10";
                                break;
                            case 2:
                                league = leagues.getJSONObject("p9");
                                leagueName = "p9";
                                break;
                            case 4:
                                league = leagues.getJSONObject("curr_p2");
                                leagueName = "curr_p2";
                                break;
                            case 5:
                                league = leagues.getJSONObject("curr_p10");
                                leagueName = "curr_p10";
                                break;
                            case 6:
                                league = leagues.getJSONObject("curr_p9");
                                leagueName = "curr_p9";
                                break;
                            default:
                                continue;
                        }
                    } catch (Exception e) {}
                    for (int j = 0; j < league.length(); j++) {
                        boolean brk = false;
                        JSONObject stat = null;
                        try {
                            switch (j) {
                                case 1:
                                    stat = league.getJSONObject("score");
                                    break;
                                case 2:
                                    stat = league.getJSONObject("top1");
                                    break;
                                case 3:
                                    stat = league.getJSONObject("top3");
                                    break;
                                case 4:
                                    stat = league.getJSONObject("top5");
                                    break;
                                case 5:
                                    stat = league.getJSONObject("top6");
                                    break;
                                case 6:
                                    stat = league.getJSONObject("top10");
                                    break;
                                case 7:
                                    stat = league.getJSONObject("top12");
                                    break;
                                case 8:
                                    stat = league.getJSONObject("top25");
                                    break;
                                case 9:
                                    stat = league.getJSONObject("kd");
                                    break;
                                case 10:
                                    stat = league.getJSONObject("winRatio");
                                    break;
                                case 11:
                                    stat = league.getJSONObject("matches");
                                    break;
                                case 12:
                                    stat = league.getJSONObject("kills");
                                    break;
                                case 13:
                                    stat = league.getJSONObject("kpg");
                                    break;
                                case 14:
                                    stat = league.getJSONObject("avgTimePlayed");
                                    break;
                                case 15:
                                    stat = league.getJSONObject("scorePerMatch");
                                    break;
                                default:
                                    brk = true;
                                    break;
                            }
                        } catch (Exception e) {}
                        if (!brk && stat != null)
                            statArray.add(new Stat(stat.getString("label"), stat.getString("category"), stat.getString("field"), stat.getString("value")));
                    }
                    leaguesArray.add(new League(leagueName, statArray));
                }
                ArrayList<Stat> lifeTimeStats = new ArrayList<>();
                for (int i = 0; i < lifeTimeJson.length(); i++) {
                    JSONObject currObj = lifeTimeJson.getJSONObject(i);
                    lifeTimeStats.add(new Stat(currObj.getString("key"), currObj.getString("value")));
                }
                leaguesArray.add(new League("lifeTimeStats", lifeTimeStats));
                Player player = new Player(jsonObject.getString("accountId"), jsonObject.getString("epicUserHandle"), jsonObject.getString("platformNameLong"));
                return new FortniteData(jsonObject.getString("accountId"), player, leaguesArray, new SuccessCode("Everything is ok", SuccessCode.Type.ok));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new FortniteData(new SuccessCode("Unknown Error WTF IS GOING ON!!!", SuccessCode.Type.error));
        }
    }
}
