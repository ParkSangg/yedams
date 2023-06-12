package com.yedam.insa;

public class EnumEx {
	public static void main(String[] args) {
		Student s1 = new Student("23-01", "고길동", 80, Gender.MEN);
		Student s2 = new Student("23-02", "둘리", 70, Gender.WOMEN);
		Student s3 = new Student("23-03", "또치", 85, Gender.MEN);
		Student s4 = new Student("23-04", "도너", 40, Gender.WOMEN);
		
		Student[] students = { s1, s2, s3, s4};
		
		for(int i=0; i<students.length; i++) {
			if(students[i].getGender() == Gender.WOMEN) {
				System.out.printf("이름은 %s, 점수는 %d,\n",students[i].getName(),students[i].getScore());
			}
		}
	}
}
