package ExamCreator;

public class TfQuestion implements Question {
	private String question;
	private String answer;
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString(){
		StringBuilder kb = new StringBuilder();
		kb.append("TF"+"	"+ question + "	"+answer);
		return kb.toString();
	}
	public String examPrinter(){
		StringBuilder kb = new StringBuilder();
		kb.append(question+"\n"+ "True\n" + "False");
		return kb.toString();
	}
	public String AExamPrinter(){
		StringBuilder kb = new StringBuilder();
		kb.append(question+"\n" + answer);
		return kb.toString();
	}
	
}
