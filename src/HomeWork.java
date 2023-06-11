public class HomeWork {
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = (char)((int)c1 + 1);
		System.out.println(c2);
		
		/*int x = 5;
		int y = 2;
		double result = x / y;
		System.out.println(result);
		
		// 2.0 >> 계산할때 double로 타입변환 하지 않음.
		*/
		
		/*int x = 5;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result);*/
		
		/*double var1 = 3.5;
		double var2 = 2.7;
		int result = (int)(var1 + var2);
		System.out.println(result);*/
		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int var4Val = (int)Double.parseDouble(var4);
		int result = (int)(var1 + var2 + var3+var4Val);
		System.out.println(result);
		
		String str1 = 2 + 3 + "";
		String str2 = 2 + "" + 3;
		String str3 = "" + 2 + 3;
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		byte value = Byte.parseByte("10");
		int value1 = Integer.parseInt("10000");
		float value2 = Float.parseFloat("20.5");
		double value3 = Double.parseDouble("3.14159");
		
		
	}
}
