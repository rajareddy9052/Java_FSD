package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int playerId;
	private String playerName;
	private String playerteamName;
	private int age;
	
	public Player() {
		
	}

	

	public Player( String playerName, String playerteamName, int age) {
		super();
		//this.playerId = playerId;
		this.playerName = playerName;
		this.playerteamName = playerteamName;
		this.age = age;
	}



	public int getPlayerId() {
		return playerId;
	}



	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}



	public String getPlayerName() {
		return playerName;
	}



	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}



	public String getPlayerteamName() {
		return playerteamName;
	}



	public void setPlayerteamName(String playerteamName) {
		this.playerteamName = playerteamName;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerteamName=" + playerteamName
				+ ", playerage=" + age + "]";
	}

	
}
