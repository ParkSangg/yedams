package Reference;

public class ReferenceEx5 {
	public static void main(String[] args) {
		
		int a = 34;
		int b = 85;
		int c = 22;
		int intAry[] = {a,b,c};
		//제일 큰수 intAry 의 첫번째 : 제일 큰 값..제일 작은 값
		for (int j=0; j < intAry.length;j++) {
			for (int i = 0; i < intAry.length -1; j+i)
			int num  = 0;
			if (intAry[i]>intAry[i+1]) {
				num = intAry[i];
				intAry[i]=intAry[i+1];
				intAry[i+1] = num;
			}
		}
		System.out.println(intAry[0]);
	}
	}
}
