package test;

import model.Student;

public class Test {
	public static void main(String args[]){
		Student s = new Student("�����",21,"Ů","201577G0341");
		System.out.println("������"+s.getName());
		System.out.println("���䣺"+s.getAge());
		System.out.println("�Ա�"+s.getSex());
		System.out.println("ѧ�ţ�"+s.getSnum());
	}
	
	
}
