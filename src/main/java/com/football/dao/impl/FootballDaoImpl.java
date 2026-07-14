package com.football.dao.impl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.football.dao.FootballDao;
import com.football.model.Bugs;
import com.football.model.ExtraData;
import com.football.model.Fixture;
import com.football.model.Formation;
import com.football.model.Ground;
import com.football.model.HeadToHead;
import com.football.model.HeaderText;
import com.football.model.InfobarStats;
import com.football.model.LeaderBoard;
import com.football.model.NameSuper;
import com.football.model.Officials;
import com.football.model.Player;
import com.football.model.PlayerComparison;
import com.football.model.PlayerProfile;
import com.football.model.PlayerStat;
import com.football.model.Playoff;
import com.football.model.Staff;
import com.football.model.Statistics;
import com.football.model.Team;
import com.football.model.TeamColor;
import com.football.model.TeamStat;
import com.football.model.VariousText;
import com.football.util.FootballUtil;

@Transactional
@Repository("footballDao")
public class FootballDaoImpl implements FootballDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public Player getPlayer(String whatToProcess, String valueToProcess) {
        switch (whatToProcess) {
        case FootballUtil.PLAYER:
        	return getSession().createQuery(
        		    "FROM Player p WHERE p.playerId = :playerId",
        		    Player.class)
        		    .setParameter("playerId", Integer.parseInt(valueToProcess))
        		    .uniqueResult();
        default:
            return null;
        }
    }

    @Override
    public Team getTeam(String whatToProcess, String valueToProcess) {
        switch (whatToProcess) {
        case FootballUtil.TEAM:
        	return getSession().createQuery(
        		    "FROM Team t WHERE t.teamId = :teamId",
        		    Team.class)
        		    .setParameter("teamId", Integer.parseInt(valueToProcess))
        		    .uniqueResult();
            
        default:
            return null;
        }
    }

    @Override
    public List<NameSuper> getNameSupers() {
        return getSession().createQuery("FROM NameSuper", NameSuper.class).getResultList();
    }

    @Override
    public List<Team> getTeams() {
        return getSession().createQuery("FROM Team", Team.class).getResultList();
    }

    @Override
    public List<Player> getPlayers(String whatToProcess, String valueToProcess) {
        switch (whatToProcess) {
        case FootballUtil.TEAM:
        	return getSession().createQuery(
        		    "FROM Player p WHERE p.teamId = :teamId",
        		    Player.class)
            	.setParameter("teamId", Integer.parseInt(valueToProcess)).getResultList();
        default:
            return null;
        }
    }

    @Override
    public List<Bugs> getBugs() {
        return getSession().createQuery("FROM Bugs", Bugs.class).getResultList();
    }

    @Override
    public List<Ground> getGrounds() {
        return getSession().createQuery("FROM Ground", Ground.class).getResultList();
    }

    @Override
    public List<Playoff> getPlayoffs() {
        return getSession().createQuery("FROM Playoff", Playoff.class).getResultList();
    }

    @Override
    public List<VariousText> getVariousTexts() {
        return getSession().createQuery("FROM VariousText", VariousText.class).getResultList();
    }

    @Override
    public Ground getGround(int ground_id) {
    	return getSession().createQuery(
    		    "FROM Ground g WHERE g.groundId = :groundId",Ground.class).setParameter("groundId", ground_id).uniqueResult();
    }

    @Override
    public List<Statistics> getAllStats() {
        return getSession().createQuery("FROM Statistics", Statistics.class).getResultList();
    }

    @Override
    public List<Player> getAllPlayer() {
        return getSession().createQuery("FROM Player", Player.class).getResultList();
    }

    @Override
    public List<Fixture> getFixtures() {
        return getSession().createQuery("FROM Fixture", Fixture.class).getResultList();
    }

    @Override
    public List<Formation> getFormations() {
        return getSession().createQuery("FROM Formation", Formation.class).getResultList();
    }

    @Override
    public List<TeamColor> getTeamColors() {
        return getSession().createQuery("FROM TeamColor", TeamColor.class).getResultList();
    }

    @Override
    public List<Staff> getStaff() {
        return getSession().createQuery("FROM Staff", Staff.class).getResultList();
    }

    @Override
    public List<Officials> getOfficials() {
        return getSession().createQuery("FROM Officials", Officials.class).getResultList();
    }

    @Override
    public List<ExtraData> getExtraData() {
        return getSession().createQuery("FROM ExtraData", ExtraData.class).getResultList();
    }

    @Override
    public List<LeaderBoard> getLeaderBoard() {
        return getSession().createQuery("FROM LeaderBoard", LeaderBoard.class).getResultList();
    }

    @Override
    public List<TeamStat> getTeamStats() {
        return getSession().createQuery("FROM TeamStat", TeamStat.class).getResultList();
    }

    @Override
    public List<HeadToHead> getHeadToHeadStats() {
        return getSession().createQuery("FROM HeadToHead", HeadToHead.class).getResultList();
    }

    @Override
    public List<PlayerStat> getPlayerStats() {
        return getSession().createQuery("FROM PlayerStat", PlayerStat.class).getResultList();
    }

    @Override
    public List<InfobarStats> getInfobarStats() {
        return getSession().createQuery("FROM InfobarStats", InfobarStats.class).getResultList();
    }

    @Override
    public List<HeaderText> getHeaderText() {
        return getSession().createQuery("FROM HeaderText", HeaderText.class).getResultList();
    }

    @Override
    public List<PlayerComparison> getPlayerComparisons() {
        return getSession().createQuery("FROM PlayerComparison", PlayerComparison.class).getResultList();
    }

    @Override
    public List<PlayerProfile> getPlayerProfiles() {
        return getSession().createQuery("FROM PlayerProfile", PlayerProfile.class).getResultList();
    }
}