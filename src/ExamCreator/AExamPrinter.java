package ExamCreator;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class AExamPrinter {

	private String fileName;
	private School school;
	private Classes classes;
	private User user;
	private EssayQuestion eq;
	private FibQuestion fib;
	private MatchingQuestions mq;
	private MultipleAnswers ma;
	private MultipleChoice mc;
	private NumQuestion nq;
	private OrderingQuestion oq;
	private ShortQuestion sq;
	private TfQuestion tf;
	private String file;
	private List<Question> question;

	public AExamPrinter(String fileName, School school,Classes classes, User user, EssayQuestion eq, FibQuestion fib,
			MatchingQuestions mq, MultipleAnswers ma, MultipleChoice mc, NumQuestion nq, OrderingQuestion oq,
			ShortQuestion sq, TfQuestion tf, String file, List<Question> question) {
		super();
		this.fileName = fileName;
		this.school = school;
		this.classes=classes;
		this.user = user;
		this.eq = eq;
		this.fib = fib;
		this.mq = mq;
		this.ma = ma;
		this.mc = mc;
		this.nq = nq;
		this.oq = oq;
		this.sq = sq;
		this.tf = tf;
		this.file=(classes.getName()+"_AnswerExamOnly.txt");
		this.question = question;
		
	}

	public void printerExamOnly(){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate localDate = LocalDate.now();
		FileWriter fw = null;
		try{
			fw = new FileWriter(file);
			fw.append(school.getName()+ "\n");
			fw.append(classes.getCourseID()+ " " + classes.getName() + "\n");
			fw.append(classes.getSemester() + " "+ classes.getYear() + "\n");
			fw.append("prof."+ user.getfName()+" " + user.getlName()+"\n");
			fw.append(user.geteMail()+"\n");
			fw.append(classes.getName()+"\n");
			fw.append(dtf.format(localDate) + "\n");
			for(int b=0;b<question.size();b++){
				int c = b+1;
				fw.append(c+ ". " +question.get(b).AExamPrinter()+ " \n");
				
			}
		}catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.flush();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
	}
}


	


