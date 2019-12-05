package model;
import java.util.ArrayList;


public class Question {

	
	private ArrayList<Answer> AnswerList=new ArrayList<Answer>();
	private String team;
	private int Correct_answer;
	private String level;
	private int correctScore;
	private int wrongScore;
	private String correctAnswer;
	private String question;
	
	
	public Question(String question) {
		
		this.question = question;
	}

	public Question(String question, ArrayList<String> arrayList, String correctAnswer, String team, String level) {

		this.question=question;	
		this.team=team;
		this.level=level;
		this.Correct_answer=Integer.parseInt(correctAnswer) ;
		int i=0;
		for (String answer : arrayList) {
			Answer new_an=new Answer(i,answer);
			this.AnswerList.add(new_an);
			
			}
		
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
		return " question " + question+ " Answers:" + AnswerList + ", team=" + team + ", Correct_answer=" + Correct_answer
				+ ", level=" + level + ", correctScore=" + correctScore + ", wrongScore=" + wrongScore
				 ;
	}

	public int getCorrect_answer() {
		return Correct_answer;
	}

	public void setCorrect_answer(int correct_answer) {
		Correct_answer = correct_answer;
	}
	
}
