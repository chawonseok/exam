package ui;

import java.util.Scanner;

import collection.ExamList;
import entity.Exam;

public class ExamConsole {
	private ExamConsoleListener consoleListener;
	private ExamList list;

	public ExamConsole() {
		list = new ExamList();
	}

	public static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("┌─────────────┐");
		System.out.println("│          메인 메뉴                       │");
		System.out.println("└─────────────┘");
		System.out.println("           1.성적 입력                      ");
		System.out.println("           2.성적 출력                      ");
		System.out.println("           3.종      료                      ");
		System.out.printf("           선택>");
		int menu = scan.nextInt();
		return menu;
	}

	public void input() {
		int kor, eng, math;
		int s = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("┌─────────────┐");
		System.out.println("│          성적 입력                     │");
		System.out.println("└─────────────┘");
		while (s == 1) {

			System.out.print("국어:");
			kor = scan.nextInt();
			while (kor < 0 || kor > 100) {
				System.out.println("정상적인 값은 0~100입니다.다시입력하세요");
				kor = scan.nextInt();
			}

			System.out.print("영어:");
			eng = scan.nextInt();
			while (eng < 0 || eng > 100) {
				System.out.println("정상적인 값은 0~100입니다.다시입력하세요");
				eng = scan.nextInt();
			}

			System.out.print("수학:");
			math = scan.nextInt();
			while (math < 0 || math > 100) {
				System.out.println("정상적인 값은 0~100입니다.다시입력하세요");
				math = scan.nextInt();
			}
			Exam exam = null;/////////
	         if(consoleListener != null)/////newExam함수가 사용되기 위한 장치
	            exam = consoleListener.newExam(); //list.get(list.getIndex());
	         else
	            exam = new Exam();
				

	         if(consoleListener != null)////onPrint함수가 사용되기위한 장치
	             consoleListener.onPrint(exam);
		
			System.out.println("계속하시려면 1을 종료하려면2를입력해주세요");
			s = scan.nextInt();
			exam.setKor(kor);
			exam.setEng(eng);
			exam.setMath(math);
			
			/*
			 * list.exams[list.index].kor = kor; list.exams[list.index].eng =
			 * eng; list.exams[list.index].math = math;
			 */

			list.add(exam);

		}

	}

	public void onInput(Exam exam) {
		// TODO Auto-generated method stub

	}

	public void onPrint(Exam exam) {
		// TODO Auto-generated method stub

	}

	public Exam newExam() {
		// TODO Auto-generated method stub
		return new Exam();
	}

	public void print() {

		System.out.println("┌───────────────────────────────────┐");
		System.out.println(
						   "│          3.성 적 출 력                           │");
		System.out.println("├─────┬────┬─────┬────┬────┬────────┤");
		System.out.println("│번호    │국 어 │영 어  │수 학 │총 점 │평 균        │");
		System.out.println("├─────┼────┼─────┼────┼────┼────────┤");
		for (int i = 0; i < list.size(); i++) {
			Exam exam = list.get(i);
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();

			int total = exam.total();
			float avg = exam.avg();
			System.out.printf("국어 : %d\n", kor);
			System.out.printf("영어 : %d\n", eng);
			System.out.printf("수학 : %d\n", math);
			if(consoleListener != null)//////onPrint함수가 사용되기위해
	            consoleListener.onPrint(exam);			
			System.out.printf("총점 : %d\n", total);
			System.out.printf("평균 : %f\n", avg);
			System.out.println("└─────┴────┴─────┴────┴────┴────────┘");
		}
	}

	public void setConsoleListener(ExamConsoleListener consoleListener) {
		this.consoleListener = consoleListener;
	}

}
