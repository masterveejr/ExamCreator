package ExamCreator;

public class ShortQuestion implements Question {
	private String SQQuestion;
	private String SQSample;
	
	public ShortQuestion(String q,String s){
		this.SQQuestion=q;
		this.SQSample=s;
	}

	public String getSQQuestion() {
		return SQQuestion;
	}

	public String getSQSample() {
		return SQSample;
	}
	@Override
	public String toString(){
		return "SQ" + "	" + SQQuestion + "	"+ SQSample;
	}
	public String examPrinter(){
		return SQQuestion;
	}
	public String AExamPrinter(){
		return SQQuestion + "	"+ SQSample;
	}
}
