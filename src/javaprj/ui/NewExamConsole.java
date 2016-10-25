
package javaprj.ui;


import com.entity.NewExam;

import entity.Exam;
import ui.ExamConsole;

public class NewExamConsole extends ExamConsole {
	
	public Exam newExam() {
		return new NewExam();
	}
	
	
	
/*	public void onInput(Exam exam) {
		Scanner scan = new Scanner(System.in);

		System.out.printf("컴퓨터:");
		int com = scan.nextInt();
		
		 * NewExam ex=(NewExam) exam; ex.setCom(com);
		  ((NewExam) exam).setCom(com);

	}

	public void onPrint(Exam exam) {
		// TODO Auto-generated method stub
		System.out.printf("컴퓨터 : %d\n", ((NewExam) exam).getCom());
	}*/
}