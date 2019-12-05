package model;

public class Answer {
	
	protected String text;
	protected int answerNum;
	
	
	public Answer(int answerNum, String text ) {
		
		this.answerNum = answerNum;
		this.text = text;
		
	}
	
	
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
	public int getAnswerNum() {
		return answerNum;
	}
	public void setAnswerNum(int answerNum) {
		this.answerNum = answerNum;
	}
	
	
	@Override
	public String toString() {
		return   text ;
	}


	protected String the_answer;
	
	
}
