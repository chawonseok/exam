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
		System.out.println("������������������������������");
		System.out.println("��          ���� �޴�                       ��");
		System.out.println("������������������������������");
		System.out.println("           1.���� �Է�                      ");
		System.out.println("           2.���� ���                      ");
		System.out.println("           3.��      ��                      ");
		System.out.printf("           ����>");
		int menu = scan.nextInt();
		return menu;
	}

	public void input() {
		int kor, eng, math;
		int s = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("������������������������������");
		System.out.println("��          ���� �Է�                     ��");
		System.out.println("������������������������������");
		while (s == 1) {

			System.out.print("����:");
			kor = scan.nextInt();
			while (kor < 0 || kor > 100) {
				System.out.println("�������� ���� 0~100�Դϴ�.�ٽ��Է��ϼ���");
				kor = scan.nextInt();
			}

			System.out.print("����:");
			eng = scan.nextInt();
			while (eng < 0 || eng > 100) {
				System.out.println("�������� ���� 0~100�Դϴ�.�ٽ��Է��ϼ���");
				eng = scan.nextInt();
			}

			System.out.print("����:");
			math = scan.nextInt();
			while (math < 0 || math > 100) {
				System.out.println("�������� ���� 0~100�Դϴ�.�ٽ��Է��ϼ���");
				math = scan.nextInt();
			}
			Exam exam = null;/////////
	         if(consoleListener != null)/////newExam�Լ��� ���Ǳ� ���� ��ġ
	            exam = consoleListener.newExam(); //list.get(list.getIndex());
	         else
	            exam = new Exam();
				

	         if(consoleListener != null)////onPrint�Լ��� ���Ǳ����� ��ġ
	             consoleListener.onPrint(exam);
		
			System.out.println("����Ͻ÷��� 1�� �����Ϸ���2���Է����ּ���");
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

		System.out.println("��������������������������������������������������������������������������");
		System.out.println(
						   "��          3.�� �� �� ��                           ��");
		System.out.println("��������������������������������������������������������������������������");
		System.out.println("����ȣ    ���� �� ���� ��  ���� �� ���� �� ���� ��        ��");
		System.out.println("��������������������������������������������������������������������������");
		for (int i = 0; i < list.size(); i++) {
			Exam exam = list.get(i);
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();

			int total = exam.total();
			float avg = exam.avg();
			System.out.printf("���� : %d\n", kor);
			System.out.printf("���� : %d\n", eng);
			System.out.printf("���� : %d\n", math);
			if(consoleListener != null)//////onPrint�Լ��� ���Ǳ�����
	            consoleListener.onPrint(exam);			
			System.out.printf("���� : %d\n", total);
			System.out.printf("��� : %f\n", avg);
			System.out.println("��������������������������������������������������������������������������");
		}
	}

	public void setConsoleListener(ExamConsoleListener consoleListener) {
		this.consoleListener = consoleListener;
	}

}
