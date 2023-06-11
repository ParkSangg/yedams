
public class chapter5 {
	public static void main(String[] args) {
		String str1 = "신민철";
		String str2 = "신민철";
		
		if (str1 == str2) {
			System.out.println("참조가 같다");
		}else {
			System.out.println("참조가 다르다.");
		}
		
		if (str1.equals(str2)) {
			System.out.println("참조가 같습니다.");
		}
		
		String str3 = new String("신민철");
		String str4 = new String("신민철");
		
		if(str3 == str4) {
			System.out.println("34참조같다");
		}else {
			System.out.println("34 참조 다르다");
		}
		if(str3.equals(str4)) {
			System.out.println("34참조 같다");
		}
		
	}
}
