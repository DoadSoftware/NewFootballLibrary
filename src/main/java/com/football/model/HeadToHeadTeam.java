package com.football.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class HeadToHeadTeam implements Cloneable {

    private int teamGoals;
    private int totalMatches;

    private String matchFileName;

    private int P1_Goals;
    private int P2_Goals;
    private int P3_Goals;

    private Team team;
    private Team opponentTeam;

    private String venue;

    public HeadToHeadTeam(int teamGoals, String matchFileName, Team team, Team opponentTeam, String venue) {

        this.teamGoals = teamGoals;
        this.matchFileName = matchFileName;
        this.team = team;
        this.opponentTeam = opponentTeam;
        this.venue = venue;
    }

    public int getTeamGoals() {
        return teamGoals;
    }

    public void setTeamGoals(int teamGoals) {
        this.teamGoals = teamGoals;
    }

    public int getTotalMatches() {
        return totalMatches;
    }

    public void setTotalMatches(int totalMatches) {
        this.totalMatches = totalMatches;
    }

    public String getMatchFileName() {
        return matchFileName;
    }

    public void setMatchFileName(String matchFileName) {
        this.matchFileName = matchFileName;
    }

    public int getP1_Goals() {
        return P1_Goals;
    }

    public void setP1_Goals(int p1_Goals) {
        P1_Goals = p1_Goals;
    }

    public int getP2_Goals() {
        return P2_Goals;
    }

    public void setP2_Goals(int p2_Goals) {
        P2_Goals = p2_Goals;
    }

    public int getP3_Goals() {
        return P3_Goals;
    }

    public void setP3_Goals(int p3_Goals) {
        P3_Goals = p3_Goals;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Team getOpponentTeam() {
        return opponentTeam;
    }

    public void setOpponentTeam(Team opponentTeam) {
        this.opponentTeam = opponentTeam;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    @Override
    public HeadToHeadTeam clone() {
        try {
            return (HeadToHeadTeam) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "HeadToHeadTeam{" +
                "teamGoals=" + teamGoals +
                ", totalMatches=" + totalMatches +
                ", matchFileName='" + matchFileName + '\'' +
                ", P1_Goals=" + P1_Goals +
                ", P2_Goals=" + P2_Goals +
                ", P3_Goals=" + P3_Goals +
                ", team=" + team +
                ", opponentTeam=" + opponentTeam +
                ", venue='" + venue + '\'' +
                '}';
    }
}