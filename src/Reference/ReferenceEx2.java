package Reference;

public class ReferenceEx2 {
	public static void main(String[] args) {
		int[] intAry = {30, 40, 50};
		double[] dblAry = {30, 40, 50};
		String[] strAry = {"H", "E", "L", "L", "O"};
 		int[] inAry2 = new int[3];
 			
 		
		System.out.println(intAry[0]);
		intAry[0] = 33; 
		System.out.println(intAry[0]);
		 
		int isum = intAry[0] + intAry[1] + intAry[2];
		for(int i=0; i<3; i++) {
			isum += intAry[i];
		}
		for (String str : strAry) {
			System.out.println(str);
		}
		System.out.println("합계: " + isum);
		
		double dsum = dblAry[0] + dblAry[1] + dblAry[2];
		
		System.out.println(isum);
		System.out.println(dsum);
	}
}
