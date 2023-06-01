package Reference;

import java.util.Scanner;

class Student1{
	String name;
	int EngScore;
	int MathScore;
}

public class ReferenceEx8 {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.name = "홍길동";
		s1.EngScore = 90;
		s1.MathScore = 90;
		
		Student1 s2 = new Student1();
		s2.name = "김길동";
		s2.EngScore = 85;
		s2.MathScore = 75;
		
		Student1 s3 = new Student1();
		s3.name = "박길동";
		s3.EngScore = 65;
		s3.MathScore = 84;
		
		Student1[] students = {s1,s2,s3};
		Scanner scn = new Scanner(System.in);
		String sName = scn.nextLine();
		
		for(int i = 0; i < students.length; i++) {
			if(students[i].name.equals(sName)) {
				System.out.println(students[i].name);
				System.out.println(students[i].EngScore);
				System.out.println(students[i].MathScore);
				System.out.println("----------------------");
			}
		}
	}
}
