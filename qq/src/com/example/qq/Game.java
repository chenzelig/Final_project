package com.example.qq;

import java.util.Date;

public class Game {
	private String name;
	private long dateAndTime;
	private int score;
	private String userID;
	

	
	public Game(String name, long time, int score, String userid){
		this.name=name;
		this.dateAndTime=time;
		this.score=score;
		this.userID=userid;
		}
	public Game(String name, long time, int score){
	this.name=name;
	this.dateAndTime=time;
	this.score=score;
	}
	public Game(String name, long time){
		this.name=name;
		this.dateAndTime=time;
		}
	
	public Game(){
		
		}
	
	public String getGameType(){
		return name;
	}
	
	public long getTime(){
		return dateAndTime;
	}
	
	public int getScore(){
		return score;
	}
	
	public String getUserId(){
		return userID;
	}
	
	public void setGameType(String name){
		this.name=name;
	}
	
	public void setTime(long time){
		this.dateAndTime=time;
	}
	
	public void setScore(int score){
		this.score=score;
	}
	
	public void setUserID(String userId){
		this.userID=userId;
	}
}
