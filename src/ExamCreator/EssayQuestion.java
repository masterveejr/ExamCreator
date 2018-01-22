package ExamCreator;

public class EssayQuestion implements Question {
	private String EQQuestion;
	private String EQSample;
	
	public EssayQuestion(String question, String sample){
		this.EQQuestion=question;
		this.EQSample = sample;
	}

	public String getEQQuestion() {
		return EQQuestion;
	}

	public String getEQSample() {
		return EQSample;
	}
	public String bbPrinter(){
		return "EQ" + "	" + EQQuestion + "	" + EQSample;
	}
	public String examPrinter(){
		return EQQuestion;
	}
	public String AExamPrinter(){
		return EQQuestion+ "	" + EQSample;
	}
}
