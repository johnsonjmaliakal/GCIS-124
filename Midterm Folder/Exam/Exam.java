package Exam;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exam {
    private final String name;
    private Map<String,String> questions; 
    
    public Exam(String name){
        this.name = name;
        questions = new HashMap<String,String>();
    }

    public String getName(){
        return name;
    }

    public void addQuestion(String statement, String answer){
        questions.put(statement, answer);
    }

    public int getNumberofQuestions(){
        // write code to return the number of questions stored in the exam
        int n = questions.size();
        return n;
    }

    public String getAnswer(String statement){
        // write code to return the answer associated with a given question statement
        String ans = questions.get(statement);
        return ans;
    }

    public Set<String> getQuestionStatements(){
        // write code to return all question statements as a set
        Set<String> Qset = questions.keySet();
        return Qset;
    }  

    public boolean contains(String statement){
        // write code to return true if a given question statement exists in the exam
        Set<String> Qset = questions.keySet();
        if (Qset.contains(statement)){
            return true;
        }
        return false;
     }
}

