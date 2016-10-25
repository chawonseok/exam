import javaprj.ui.NewExamConsole;
import ui.ExamConsole;
import ui.ExamConsoleListener;
import ui.NewExamConsoleListener;

public class ISprgram {

	public static void main(String[] args) {
		ExamConsole console = new ExamConsole();
	
		console.setConsoleListener(new NewExamConsoleListener());///인터페이스
		
		console.input();
		console.print();
		/*ExamConsoleListener rc =null ;
		rc=new NewExamConsoleListener();
		rc.onPrint(exam);
		rc.inPrint(exam);*/
		/*console.input();
		console.print();*/
		/*Exam exam = new NewExam(1, 1, 1, 1);
		System.out.printf("tatal is %d\n", exam.total());*/
	/*	System.out.printf("tatal is %6.2f\n", exam.avg());
		NewExam exam = new NewExam(10, 10, 10, 10);*/
		/*ExamList list = new NewExam();
		list.add(exam);*/
		/*Frame frame= new NewFrame();
		frame.setVisible(true);*/
	
	}
}
