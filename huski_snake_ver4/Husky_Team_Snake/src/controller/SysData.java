package controller;
import java.io.FileReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;

import model.Player;
import model.Question;


public class SysData {
	
	public static SysData single_instance = null; 
	HashMap<String, Array[]>Questions;
	HashSet<Player>players=new HashSet<Player>();
	
	/*
	 * creating singleton show for the sysdata
	 */
	public static SysData getinstance()
	{
		 if (single_instance == null) 
	            single_instance = new SysData(); 
	  
	        return single_instance;
	}
	
	
	public boolean add_new_player(String user_Name)
	{
		Player p=new Player(user_Name);
		if(!(players.contains(p)))
			{
			players.add(p);
			return true;
			}
         return false;
	}
	
	public void initiateGame () {
		
	}
	public void readFromFile () {
		

	}
	public void writeToFile () {
		
	}
	public void addNewQuestion () {
		
	}
	public void removeQuestion  () {
		
	}
	public void saveGame  () {
		
	}
	public void selectQuestion   () {
		
	}
	
	
	public void ReadJSONFile() {
		Map<String, Question> quMap = new HashMap<>();
		ArrayList<Question> questions = new ArrayList<>();

	try {
		ArrayList<String> answers = new ArrayList<>();
		String question = "";
		String correctAnswer = "";
		String level = "";
		String team = "";
		JSONObject obj = (JSONObject) new JSONParser().parse(new FileReader("assets/questions/q.json"));
		JSONArray arr = (JSONArray) obj.get("questions");
		Iterator<JSONObject> iterator = arr.iterator();
		while (iterator.hasNext()) {
			JSONObject temp = iterator.next();
			question = (String) temp.get("question");
			correctAnswer = (String) temp.get("correct_ans");
			level = (String) temp.get("level");
			team = (String) temp.get("team");
			JSONArray tempAnswers = (JSONArray) temp.get("answers");
			Iterator<String> iterator2 = tempAnswers.iterator();
			while (iterator2.hasNext())
				answers.add(iterator2.next());
			
			questions.add(new Question(question, new ArrayList<>(answers), correctAnswer, team, level));
			Question tempQ = new Question(question, new ArrayList<>(answers), correctAnswer, team, level);
			quMap.put(question, tempQ);
			answers.clear();
			for (Question q : questions) {
				System.out.println(q);
			}
			
		}	
					
				}catch(Exception e){
					e.printStackTrace();
	}

}

	
	
	
	

	 
	
}
