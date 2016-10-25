package ui;

import java.util.Scanner;

import com.entity.NewExam;

import entity.Exam;

public  class NewExamConsoleListener implements ExamConsoleListener {

	@Override
	public void onPrint(Exam exam) {
		Scanner scan = new Scanner(System.in);

		System.out.printf("컴퓨터:");
		int com = scan.nextInt();
		/*
		 * NewExam ex=(NewExam) exam; ex.setCom(com);
		 */ ((NewExam) exam).setCom(com);

		
	}
	@Override
	public Exam newExam() {
		// TODO Auto-generated method stub
		return new NewExam();
	}
	@Override
	public void inPrint(Exam exam) {
		// TODO Auto-generated method stub
				System.out.printf("컴퓨터 : %d\n", ((NewExam) exam).getCom());
	}

}
