package model;

import java.util.ArrayList;

public class Question {

	private String question;
	private ArrayList<String> arrayList;
	private String team;
	private answer answer;
	private String level;
	private int correctScore;
	private int wrongScore;
	private String correctAnswer;
	
	public Question(String question, ArrayList<String> arrayList, String correctAnswer, String team, String level) {
		// TODO Auto-generated constructor stub
		this.question=question;
		this.arrayList=arrayList;
		this.correctAnswer=correctAnswer;
		this.team=team;
		this.level=level;
	}
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public answer getAnswer() {
		return answer;
	}
	public void setAnswer(answer answer) {
		this.answer = answer;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public int getCorrectScore() {
		return correctScore;
	}
	public void setCorrectScore(int correctScore) {
		this.correctScore = correctScore;
	}
	public int getWrongScore() {
		return wrongScore;
	}
	public void setWrongScore(int wrongScore) {
		this.wrongScore = wrongScore;
	}

	@Override
	public String toString() {
		return "Question [question=" + question + ", arrayList=" + arrayList + ", team=" + team + ", answer=" + answer
				+ ", level=" + level + ", isAssigned=" +", correctScore=" + correctScore + ", wrongScore="
				+ wrongScore + ", correctAnswer=" + correctAnswer + "]";
	}
	
}
