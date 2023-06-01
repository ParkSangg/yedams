package Reference;
import java.util.Scanner;
public class ReferenceEx7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int studentNum = 0;
		int[] scores = null;
		boolean run = true;
		
		while (run) {
			System.out.println("-----------------------------")
			System.out.println("1.학생 수 2.점수입력 3.점수리스트 4.분석(최고,평균) 5.종료");
			System.out.println("-----------------------------");
			System.out.println("선택 > ");
			int selectNo = Integer.parseInt(scn.nextLine());
			if(selectNo == 1) {
				System.out.print("학생 수를 입력하세요");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores =new int[studenNum];
			} else if(selectNo == 2 );
		}
	}
}
