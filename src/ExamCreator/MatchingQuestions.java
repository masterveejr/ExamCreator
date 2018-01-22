package ExamCreator;

public class MatchingQuestions implements Question{
	private String MQQuestion;
	private String[] MQAnswers;
	private String[] MQMatches;
	private String[] letter = {"A","B","C","D"};
	public MatchingQuestions(String question,String[] answer, String[] matches){
		this.MQQuestion = question;
		this.MQAnswers = answer;
		this.MQMatches = matches;
	}

	public String getMQQuestion() {
		return MQQuestion;
	}

	public String[] getMQAnswers() {
		return MQAnswers;
	}
	@Override
	public String toString(){
		StringBuilder kb = new StringBuilder();
		kb.append("MAT"+"	"+ MQQuestion);
		for (int b = 0;b<MQAnswers.length;b++){
			kb.append("	" + MQAnswers[b]+"	"+MQMatches[b]);
		}
		return kb.toString();
	}
	public String examPrinter(){
		StringBuilder kb = new StringBuilder();
		kb.append(MQQuestion+"\n");
		int counter = 1;
		for (int b = 0;b<MQAnswers.length;b++){
			kb.append(counter+ ". " + MQAnswers[b]+"     " + letter[b]+ ") " +MQMatches[b]+"\n");
			counter++;
		}
		return kb.toString();
	}
	public String AExamPrinter(){
		StringBuilder kb = new StringBuilder();
		kb.append(MQQuestion+"\n");
		int counter = 1;
		for (int b = 0;b<MQAnswers.length;b++){
			kb.append(counter+ ". " + MQAnswers[b]+ "     "+ letter[b] +") "+ MQMatches[b] + "\n");
			counter++;
		}
		for(int v = 0;v<MQAnswers.length;v++){
			kb.append(MQAnswers[v]+ "-"+ MQMatches[v]+ " , ");
		}
		return kb.toString();
	}

}
