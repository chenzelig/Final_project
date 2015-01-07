package com.example.qq;

import java.util.Date;

public class Game {
	private Type name;
	private Date dateAndTime;
	private int score;
	
	
	public Game(Type name, Date time, int score){
	this.name=name;
	this.dateAndTime=time;
	this.score=score;
	}
	public Game(Type name, Date time){
		this.name=name;
		this.dateAndTime=time;
		}
	
	public Type getNmae(){
		return name;
	}
	
	public Date getTime(){
		return dateAndTime;
	}
	
	public int getScore(){
		return score;
	}
	
	public void setName(Type name){
		this.name=name;
	}
	
	public void setTime(Date time){
		this.dateAndTime=time;
	}
	
	public void setScore(int score){
		this.score=score;
	}
}
