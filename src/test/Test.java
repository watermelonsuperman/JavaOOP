package test;

import model.Student;

public class Test {
	public static void main(String args[]){
		Student s = new Student("王焱昕",21,"女","201577G0341");
		System.out.println("姓名："+s.getName());
		System.out.println("年龄："+s.getAge());
		System.out.println("性别："+s.getSex());
		System.out.println("学号："+s.getSnum());
	}
	
	
}
