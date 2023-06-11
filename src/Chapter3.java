import java.util.Scanner;
public class Chapter3 {
	public static void main(String[] args) {
		/*Scanner scn = new Scanner(System.in);
		int score = Integer.parseInt(scn.nextLine());
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 
			((score > 70) ? 'C' : ((score > 60) ? 'D' : ((score > 50) ? 'E' : 'F'))));
		System.out.println(score + "점은" + grade + "등급입니다.");*/
		
		/*byte b = 5;
		int c = -b;
		double result = 10 / (double) c;
		System.out.println(result);*/
		
		/*int var1 = 5;
		int var2 = 2;
		double var3 = (double) var1 / var2 ;
		int var4 = (int)(var3 * var2);
		System.out.println(var4);
		
		int value = 356;
		System.out.println(value-(value%100));*/
		
		float var1 = 10f;
		double var2 = (double)var1 /100;
		System.out.println(var2);
		
		if(var2 == 0.1) {
			System.out.println("10%");
		}else {
			System.out.println("not10%");
		}
		
		
	}
}