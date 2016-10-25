package ui;

import entity.Exam;

 public interface ExamConsoleListener {
	Exam newExam();
	void onPrint(Exam exam);
	void inPrint(Exam exam);

}
