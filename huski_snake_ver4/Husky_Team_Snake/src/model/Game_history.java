package model;

import java.util.Date;


public class Game_history {
	
	private Date game_date;
	private String total_Score;
	private String number_of_questions;
	private String number_of_right_Answers;
		
	
	//**********Getters and Setters************//
	protected Player player; 
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public String getGame_number() {
		return game_number;
	}
	public void setGame_number(String game_number) {
		this.game_number = game_number;
	}
	public Date getGame_date() {
		return game_date;
	}
	public void setGame_date(Date game_date) {
		this.game_date = game_date;
	}
	public String getTotal_Score() {
		return total_Score;
	}
	public void setTotal_Score(String total_Score) {
		this.total_Score = total_Score;
	}
	public String getNumber_of_questions() {
		return number_of_questions;
	}
	public void setNumber_of_questions(String number_of_questions) {
		this.number_of_questions = number_of_questions;
	}
	public String getNumber_of_right_Answers() {
		return number_of_right_Answers;
	}
	public void setNumber_of_right_Answers(String number_of_right_Answers) {
		this.number_of_right_Answers = number_of_right_Answers;
	}
	//******constructor**********//
	private String game_number;
	public Game_history(String game_number, Date game_date, String total_Score, String number_of_questions,
			String number_of_right_Answers, Player player) {
		super();
		this.game_number = game_number;
		this.game_date = game_date;
		this.total_Score = total_Score;
		this.number_of_questions = number_of_questions;
		this.number_of_right_Answers = number_of_right_Answers;
		this.player = player;
	}
	
	}


