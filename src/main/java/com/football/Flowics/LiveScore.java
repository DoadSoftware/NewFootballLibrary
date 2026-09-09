package com.football.Flowics;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LiveScore {
   
  private int homeTeamScore;

  private int awayTeamScore;

  public int getHomeTeamScore() {
	return homeTeamScore;
  }

  public void setHomeTeamScore(int homeTeamScore) {
	this.homeTeamScore = homeTeamScore;
  }

  public int getAwayTeamScore() {
	return awayTeamScore;
  }

  public void setAwayTeamScore(int awayTeamScore) {
	this.awayTeamScore = awayTeamScore;
  }

}