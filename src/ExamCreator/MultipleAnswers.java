package ExamCreator;

public class MultipleAnswers implements Question {
	
	private String MAQuestion;
	private String[] MAAnswer;
	private String[] MACorrect;
	private String[] letter = {"A","B","C","D"};
	
	public MultipleAnswers(String question, String[] answer, String[] correct){
		this.MAQuestion = question;
		this.MAAnswer = answer;
		this.MACorrect = correct;
	}
	public String getMAQuestion() {
		return MAQuestion;
	}
	public void setMAQuestion(String mAQuestion) {
		MAQuestion = mAQuestion;
	}
	public String[] getMAAnswer() {
		return MAAnswer;
	}
	public void setMAAnswer(String[] mAAnswer) {
		MAAnswer = mAAnswer;
	}
	public String[] getMACorrect() {
		return MACorrect;
	}
	public void setMACorrect(String[] mACorrect) {
		MACorrect = mACorrect;
	}
	@Override
	public String toString(){
		StringBuilder kb = new StringBuilder();
		kb.append("MA"+"	"+ MAQuestion);
		for (int b = 0;b<MAAnswer.length;b++){
			kb.append("	" + MAAnswer[b] + "	" + MACorrect[b]);
		}
		return kb.toString();
	}
	public String examPrinter(){
		StringBuilder kb = new StringBuilder();
		kb.append(MAQuestion+"\n");
		for (int b = 0;b<MAAnswer.length;b++){
			kb.append(letter[b]+ ") " + MAAnswer[b]+"\n");
		}
		return kb.toString();
	}
	public String AExamPrinter(){
		StringBuilder kb = new StringBuilder();
		kb.append(MAQuestion+"\n");
		for (int b = 0;b<MAAnswer.length;b++){
			kb.append(letter[b]+ ") " + MAAnswer[b]+ " "+ MACorrect[b] + "\n");
		}
		return kb.toString();
	}

	
}

