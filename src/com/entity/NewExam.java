package com.entity;

import entity.Exam;

public class NewExam/*확장,자식,하위,파생*/ extends Exam/*기반,부모,상위,기저*/
{
	private int com;

	public NewExam() {
		this(0,0,0,0);
		
	}
	public NewExam(int com,int kor,int eng,int math) {
		super(kor,eng,math);
		this.com=com;
	}
	public int total() {
		return super.total()+this.com;
		
	}
	public float avg() {
		return  total() / 4.0f;
		
	}
	
	public int getCom(){
		return com;
	
	}
	public void setCom(int com) {
		this.com = com;
	}
	
}
