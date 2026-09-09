package com.football.Flowics;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.football.model.Team;
import com.football.model.Ground;
import com.football.model.Player;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MatchInfo {
     
	private int homeSubstitutesPerTeam;

	private int awaySubstitutesPerTeam;
	  
	private String tournament;

	private String matchIdent;
	  
	private int matchId;

	private int homeTeamFormationId;

	private int awayTeamFormationId;
	  
	private int homeTeamId;

	private int awayTeamId;
 
	private String homeTeamJerseyColor;

	private String awayTeamJerseyColor;
	  
	private String homeTeamGKJerseyColor;

	private String awayTeamGKJerseyColor;

	private int groundId;

	private String venueName;
  
	private Ground ground;
	  
	private Team homeTeam;

	private Team awayTeam;
	  
	private List<Player> homeSquad;

	private List<Player> homeSubstitutes;
	  
	private List<Player> awaySquad;

	private List<Player> awaySubstitutes;
	  
	private List<Player> homeOtherSquad;

	private List<Player> awayOtherSquad;
	
	public MatchInfo(int homeSubstitutesPerTeam, int awaySubstitutesPerTeam, String tournament, String matchIdent,
			int matchId, int homeTeamFormationId, int awayTeamFormationId, int homeTeamId, int awayTeamId,
			String homeTeamJerseyColor, String awayTeamJerseyColor, String homeTeamGKJerseyColor,
			String awayTeamGKJerseyColor, int groundId, String venueName, Ground ground, Team homeTeam, Team awayTeam,
			List<Player> homeSquad, List<Player> homeSubstitutes, List<Player> awaySquad, List<Player> awaySubstitutes,
			List<Player> homeOtherSquad, List<Player> awayOtherSquad) {
		super();
		this.homeSubstitutesPerTeam = homeSubstitutesPerTeam;
		this.awaySubstitutesPerTeam = awaySubstitutesPerTeam;
		this.tournament = tournament;
		this.matchIdent = matchIdent;
		this.matchId = matchId;
		this.homeTeamFormationId = homeTeamFormationId;
		this.awayTeamFormationId = awayTeamFormationId;
		this.homeTeamId = homeTeamId;
		this.awayTeamId = awayTeamId;
		this.homeTeamJerseyColor = homeTeamJerseyColor;
		this.awayTeamJerseyColor = awayTeamJerseyColor;
		this.homeTeamGKJerseyColor = homeTeamGKJerseyColor;
		this.awayTeamGKJerseyColor = awayTeamGKJerseyColor;
		this.groundId = groundId;
		this.venueName = venueName;
		this.ground = ground;
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.homeSquad = homeSquad;
		this.homeSubstitutes = homeSubstitutes;
		this.awaySquad = awaySquad;
		this.awaySubstitutes = awaySubstitutes;
		this.homeOtherSquad = homeOtherSquad;
		this.awayOtherSquad = awayOtherSquad;
	}

	public int getHomeSubstitutesPerTeam() {
		return homeSubstitutesPerTeam;
	}

	public void setHomeSubstitutesPerTeam(int homeSubstitutesPerTeam) {
		this.homeSubstitutesPerTeam = homeSubstitutesPerTeam;
	}

	public int getAwaySubstitutesPerTeam() {
		return awaySubstitutesPerTeam;
	}

	public void setAwaySubstitutesPerTeam(int awaySubstitutesPerTeam) {
		this.awaySubstitutesPerTeam = awaySubstitutesPerTeam;
	}

	public String getTournament() {
		return tournament;
	}

	public void setTournament(String tournament) {
		this.tournament = tournament;
	}

	public String getMatchIdent() {
		return matchIdent;
	}

	public void setMatchIdent(String matchIdent) {
		this.matchIdent = matchIdent;
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public int getHomeTeamFormationId() {
		return homeTeamFormationId;
	}

	public void setHomeTeamFormationId(int homeTeamFormationId) {
		this.homeTeamFormationId = homeTeamFormationId;
	}

	public int getAwayTeamFormationId() {
		return awayTeamFormationId;
	}

	public void setAwayTeamFormationId(int awayTeamFormationId) {
		this.awayTeamFormationId = awayTeamFormationId;
	}

	public int getHomeTeamId() {
		return homeTeamId;
	}

	public void setHomeTeamId(int homeTeamId) {
		this.homeTeamId = homeTeamId;
	}

	public int getAwayTeamId() {
		return awayTeamId;
	}

	public void setAwayTeamId(int awayTeamId) {
		this.awayTeamId = awayTeamId;
	}

	public String getHomeTeamJerseyColor() {
		return homeTeamJerseyColor;
	}

	public void setHomeTeamJerseyColor(String homeTeamJerseyColor) {
		this.homeTeamJerseyColor = homeTeamJerseyColor;
	}

	public String getAwayTeamJerseyColor() {
		return awayTeamJerseyColor;
	}

	public void setAwayTeamJerseyColor(String awayTeamJerseyColor) {
		this.awayTeamJerseyColor = awayTeamJerseyColor;
	}

	public String getHomeTeamGKJerseyColor() {
		return homeTeamGKJerseyColor;
	}

	public void setHomeTeamGKJerseyColor(String homeTeamGKJerseyColor) {
		this.homeTeamGKJerseyColor = homeTeamGKJerseyColor;
	}

	public String getAwayTeamGKJerseyColor() {
		return awayTeamGKJerseyColor;
	}

	public void setAwayTeamGKJerseyColor(String awayTeamGKJerseyColor) {
		this.awayTeamGKJerseyColor = awayTeamGKJerseyColor;
	}

	public int getGroundId() {
		return groundId;
	}

	public void setGroundId(int groundId) {
		this.groundId = groundId;
	}

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public Ground getGround() {
		return ground;
	}

	public void setGround(Ground ground) {
		this.ground = ground;
	}

	public Team getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}

	public Team getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(Team awayTeam) {
		this.awayTeam = awayTeam;
	}

	public List<Player> getHomeSquad() {
		return homeSquad;
	}

	public void setHomeSquad(List<Player> homeSquad) {
		this.homeSquad = homeSquad;
	}

	public List<Player> getHomeSubstitutes() {
		return homeSubstitutes;
	}

	public void setHomeSubstitutes(List<Player> homeSubstitutes) {
		this.homeSubstitutes = homeSubstitutes;
	}

	public List<Player> getAwaySquad() {
		return awaySquad;
	}

	public void setAwaySquad(List<Player> awaySquad) {
		this.awaySquad = awaySquad;
	}

	public List<Player> getAwaySubstitutes() {
		return awaySubstitutes;
	}

	public void setAwaySubstitutes(List<Player> awaySubstitutes) {
		this.awaySubstitutes = awaySubstitutes;
	}

	public List<Player> getHomeOtherSquad() {
		return homeOtherSquad;
	}

	public void setHomeOtherSquad(List<Player> homeOtherSquad) {
		this.homeOtherSquad = homeOtherSquad;
	}

	public List<Player> getAwayOtherSquad() {
		return awayOtherSquad;
	}

	public void setAwayOtherSquad(List<Player> awayOtherSquad) {
		this.awayOtherSquad = awayOtherSquad;
	}
	
}