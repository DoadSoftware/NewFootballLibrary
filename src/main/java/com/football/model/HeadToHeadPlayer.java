package com.football.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class HeadToHeadPlayer implements Cloneable {

    private int playerId;
    private int goals;
    private String matchFileName;
    private Team team;
    private Team opponentTeam;
    private boolean teamVsTeam = false;
    
    public HeadToHeadPlayer(int playerId, int goals, String matchFileName, Team team, Team opponentTeam) {
        this.playerId = playerId;
        this.goals = goals;
        this.matchFileName = matchFileName;
        this.team = team;
        this.opponentTeam = opponentTeam;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public String getMatchFileName() {
        return matchFileName;
    }

    public void setMatchFileName(String matchFileName) {
        this.matchFileName = matchFileName;
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

    public boolean isTeamVsTeam() {
        return teamVsTeam;
    }

    public void setTeamVsTeam(boolean teamVsTeam) {
        this.teamVsTeam = teamVsTeam;
    }

    @Override
    public HeadToHeadPlayer clone() {
        try {
            return (HeadToHeadPlayer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

	@Override
	public String toString() {
		return "HeadToHeadPlayer [playerId=" + playerId + ", goals=" + goals + ", matchFileName=" + matchFileName
				+ ", team=" + team + ", opponentTeam=" + opponentTeam + ", teamVsTeam=" + teamVsTeam + "]";
	}



}