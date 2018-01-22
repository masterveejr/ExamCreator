package ExamCreator;

public class test {

	public static void main(String[] args) {
		String question = "this is a question";
		String sample = "adfsdsfdsa";
		String[] ans = {"one", "two", "three","four"};
		String[] match = {"1", "2", "3","4"};
		
		MatchingQuestions one = new MatchingQuestions(question, ans, match);
		System.out.println(one.toString());
		System.out.println(one.AExamPrinter());
		System.out.println(one.examPrinter());
		System.out.println("***************************************************\n");
		OrderingQuestion oQ = new OrderingQuestion(question, ans, match);
		System.out.println(oQ.toString());
		System.out.println(oQ.AExamPrinter());
		System.out.println(oQ.examPrinter());
		System.out.println("***************************************************\n");
		MultipleAnswers mA = new MultipleAnswers(question, ans, match);
		System.out.println(mA.toString());
		System.out.println(mA.AExamPrinter());
		System.out.println(mA.examPrinter());
		System.out.println("***************************************************\n");
		EssayQuestion es = new EssayQuestion(question,sample);
		System.out.println(es.bbPrinter());
		System.out.println(es.examPrinter());
		System.out.println(es.AExamPrinter());
		System.out.println("***************************************************\n");
		MultipleChoice mc = new MultipleChoice(question, ans,match);
		System.out.println(mc.toString());
		System.out.println(mc.examPrinter());
		System.out.println(mc.AExamPrinter());
		System.out.println("***************************************************\n");
		FibQuestion q = new FibQuestion(question, ans);
		System.out.println(q.toString());
		System.out.println(q.examPrinter());
		System.out.println(q.AExamPrinter());
	}

}
