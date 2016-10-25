package collection;

import entity.Exam;

public class ExamList {
	private Exam[] exams;
	private int index;
	private int capacity;
	private int amount;

	public ExamList() {
		capacity = 10;
		amount = 10;
		exams = new Exam[capacity];
		

	}

	public ExamList(int capacity, int amount) {
		this.capacity = capacity;
		this.amount = amount;

		exams = new Exam[capacity];
		

	}

	public void add(Exam exam) {
		if (getIndex() >= capacity) {
			Exam[] temp = new Exam[capacity + amount];
			for (int i = 0; i < getIndex(); i++)
				temp[i] = exams[i];
			capacity += amount;
			exams = temp;
		}
		exams[index++] = exam;
	}

	public Exam get(int index) {
		return exams[index];
	}

	public int getIndex(){
		return index;
	}
	public int size(){
		return index;
	}
	public void setIndex(int index){
		this.index=index;
	}

	
	
}
