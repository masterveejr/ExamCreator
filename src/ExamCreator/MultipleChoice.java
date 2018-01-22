package ExamCreator;

public class MultipleChoice implements Question{
	private String MCQuestion;
	private String[] MCAnswer;
	private String[] MCCorrect;
	private String[] letter = {"A","B","C","D"};
	public MultipleChoice(String q, String[] a, String[] m){
		this.MCQuestion=q;
		this.MCAnswer=a;
		this.MCCorrect=m;
	}
	
	public String getMCQuestion() {
		return MCQuestion;
	}
	public void setMCQuestion(String mCQuestion) {
		MCQuestion = mCQuestion;
	}
	public String[] getMCAnswer() {
		return MCAnswer;
	}
	public void setMCAnswer(String[] mCAnswer) {
		MCAnswer = mCAnswer;
	}
	public String[] getMCCorrect() {
		return MCCorrect;
	}
	public void setMCCorrect(String[] mCCorrect) {
		MCCorrect = mCCorrect;
	}
	@Override
	public String toString(){
		StringBuilder kb = new StringBuilder();
		kb.append("MC"+"	"+ MCQuestion);
		for (int b = 0;b<MCAnswer.length;b++){
			kb.append("	" + MCAnswer[b] + "	" + MCCorrect[b]);
		}
		return kb.toString();
	}
	public String examPrinter(){
		StringBuilder kb = new StringBuilder();
		kb.append(MCQuestion+"\n");
		
		for (int b = 0;b<MCAnswer.length;b++){
			kb.append(letter[b]+ ") " + MCAnswer[b]+"\n");
			
		}
		return kb.toString();
	}
	public String AExamPrinter(){
		StringBuilder kb = new StringBuilder();
		kb.append(MCQuestion+"\n");
		for (int b = 0;b<MCAnswer.length;b++){
			kb.append(letter[b]+ ") " + MCAnswer[b]+ " "+ MCCorrect[b] + "\n");
		}
		return kb.toString();
	}
	
	

	

}
