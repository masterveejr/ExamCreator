package ExamCreator;

import java.util.Random;

public class OrderingQuestion implements Question{
	private String question;
	private String[] answers;
	private String[] correct;
	
	public OrderingQuestion(String question, String[] answers, String[] correct){
		this.question=question;
		this.answers=answers;
		this.correct = correct;
	}
	public String getQuestion(){
		return question;
	}
	public String[] getAnswers(){
		return answers;
	}
	private int[] shuffleArray(){
		int[] array = new int[correct.length];
		for (int i = 0; i < array.length; i++){
			array[i] = i;
		}
		int index;
		Random random = new Random();
		for(int b = array.length - 1; b>0;b--){
			index = random.nextInt(b+1);
			if(index != b){
				array[index] ^= array[b];
				array[b] ^= array[index];
				array[index] ^= array[b];
				
			}
		}
		return array;
	}
	@Override
	public String toString(){
		StringBuilder kb = new StringBuilder();
		kb.append("ORD"+"	"+ question);
		for (int b = 0;b<answers.length;b++){
			kb.append("	" + answers[b]);
		}
		return kb.toString();
	}
	public String examPrinter(){
		StringBuilder kb = new StringBuilder();
		kb.append(question+"\n");
		int counter = 1;
		for (int b = 0;b<answers.length;b++){
			kb.append(counter+ ". " + answers[b]+"\n");
			counter++;
		}
		return kb.toString();
	}
	public String AExamPrinter(){
		StringBuilder kb = new StringBuilder();
		kb.append(question+"\n");
		String cor = "";
		int counter = 1;
		for (int b = 0;b<answers.length;b++){
			kb.append(counter+ ". " + answers[b]+"\n");
			counter++;
		}
		kb.append("\n");
		for (int b = 0; b < correct.length; b++){
			if(b!=correct.length-1){
				kb.append(correct[b]+  "-");
			}
			else 
				kb.append(correct[b]);
			}
		return kb.toString();
	}
}//RANDOM PRINT FOR EXAMORNTER
