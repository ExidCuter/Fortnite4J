package xyz.dodo.entity;


public class Player {
    String accId;
    String nickname;
    String platform;

    public String getAccId() {
        return accId;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPlatform() {
        return platform;
    }

    public Player(String accId, String nickname, String platform) {
        this.accId = accId;
        this.nickname = nickname;
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Player{" +
                "accId='" + accId + '\'' +
                ", nickname='" + nickname + '\'' +
                ", platform='" + platform + '\'' +
                '}';
    }
}
