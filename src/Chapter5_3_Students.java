import java.util.Scanner;
public class Chapter5_3_Students {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("-------------------------------");
			System.out.println("선택>");
			int SelectNo = Integer.parseInt(scn.nextLine());
			if(SelectNo == 1) {
				System.out.println("학생수 입력 페이지입니다.");
				studentNum = Integer.parseInt(scn.nextLine());
				scores = new int [studentNum]; 
				
			}else if(SelectNo == 2) {
				System.out.println("점수 입력 페이지입니다.");
				for(int i=0;i<scores.length;i++) {
					scores[i] = Integer.parseInt(scn.nextLine());
					System.out.println("입력된 점수는 "+scores[i]+"점 입니다.");
				}
			}else if(SelectNo == 3) {
				System.out.println("점수 리스트 페이지입니다.");
				for(int i=0;i<scores.length;i++) {
					int score = scores[i];
					System.out.println(scores[i]);
				}
			}else if(SelectNo == 4) {
				System.out.println("점수 분석 페이지입니다.");
				int max = 0;
				int avg = 0;
				int sum = 0;
				
				for (int i=0;i<scores.length;i++) {
					sum += scores[i];
					if(max < scores[i]) {
						max = scores[i];
					}
				}
				avg = sum / scores.length;
				System.out.println("평균은 " + avg);
				System.out.println("총점은 " + sum);
				System.out.println("최고점수는 " + max);
			}else if(SelectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
