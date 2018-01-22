package ExamCreator;

import java.util.Random;

public class FibQuestion implements Question {
	private String FIBQuestion;
	private String[] FIBAnswer;

	public FibQuestion(String question, String[] answers){
		this.FIBQuestion=question;
		this.FIBAnswer=answers;
		
	}

	public String getFIBQuestion() {
		return FIBQuestion;
	}

	public String[] getFIBAnswer() {
		return FIBAnswer;
	}
	
	@Override
	public String toString(){
		StringBuilder kb = new StringBuilder();
		kb.append("FIB"+"	"+ FIBQuestion);
		for (int b = 0;b<FIBAnswer.length;b++){
			kb.append("	" + FIBAnswer[b]);
		}
		return kb.toString();
	}
	public String examPrinter(){
		StringBuilder kb = new StringBuilder();
		kb.append(FIBQuestion+"\n");
		return kb.toString();
	}
	public String AExamPrinter(){
		StringBuilder kb = new StringBuilder();
		kb.append(FIBQuestion+"\n");
		for (int b = 0;b<FIBAnswer.length;b++){
			kb.append(FIBAnswer[b]+ " , ");
		}
		return kb.toString();
	}

}
