package model;

public class Student {
	//����
	String name;
	//����
	int age;
	//�Ա�
	String sex;
	//ѧ��
	String Snum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSnum() {
		return Snum;
	}
	public void setSnum(String snum) {
		Snum = snum;
	}
	public Student(String name, int age, String sex, String snum) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.Snum = snum;
	}
	
}
