package com.example.hw3_5;

import java.io.Serializable;

public class BasketballClub implements Serializable {
    String teamName;
    int icon;
    String description;

    public BasketballClub(String teamName, int icon, String description) {
        this.teamName = teamName;
        this.icon = icon;
        this.description = description;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
