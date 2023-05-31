package Reference;

public class ReferenceEx3 {
	public static void main(String[] args) {
		// 학생점수 89.5 78.9 90.4 값 저장, sum, avg
		double[] scores = {89.5 , 78.9, 90.4};
		double sum = 0;
		for(double score : scores) {
			sum += score;
		}
		double avg = sum/3;
		double maxVal = scores[0];
		for(double score : scores) {
			if (maxVal < score) {
				maxVal = score;
			}
		}
		System.out.printf("합계점수는 %.2f, 평균은 %.2f, 최고점수는 %.2f.", sum, avg, maxVal);
	}
}
