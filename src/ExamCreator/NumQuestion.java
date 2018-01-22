package ExamCreator;

public class NumQuestion implements Question{
	private String question;
	private String answer;
	private String tolerance;
	
	
	public NumQuestion(String question, String answer){
		this.question= question;
		this.answer=answer;
		tolerance = "";
	}
	
	public NumQuestion(String question, String answer, String tolerance){
		this.question= question;
		this.answer=answer;
		this.tolerance=tolerance;
	}
	
	public String getQuestion(){
		return question;
	}
	public String getAnswer(){
		return answer;
	}
	public String getTolerance(){
		return tolerance;
	}
	@Override
	public String toString(){
		return "NUM" + "	" + question + "	" + answer + "	" + tolerance;
		}
	public String examPrinter(){
		return question;
	}
	public String AExamPrinter(){
		return question + "\n" + answer;
	}

}
