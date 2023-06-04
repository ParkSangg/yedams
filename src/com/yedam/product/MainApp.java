package com.yedam.product;
import java.util.Scanner;

public class MainApp {
	static Products Items[];
	static Scanner scn = new Scanner(System.in);
	
	private static void howMany() {
		System.out.println("총 상품수를 입력해주세요.(종류)");
		int whole = Integer.parseInt(scn.nextLine());
		Items = new Products[whole];
		return;
	}
	public static void itemvalue() {

		boolean isNull = false;
		for (int i=0; i<Items.length; i++) {
			if(Items[i] == null) {
				isNull = true;
				break;
			}
		}
		if(!isNull) {
			System.out.println("등록할 공간이 없습니다.");
			return;
		}
		
		for (int i=0; i<Items.length; i++) {
			System.out.println("상품명을 입력해주세요");
			String ItemName = scn.nextLine();
			Products p1 = new Products();
			
			p1.setName(ItemName);
			
			System.out.println("가격을 입력해주세요");
			int ItemPrice = Integer.parseInt(scn.nextLine());
			p1.setPrice(ItemPrice);
			
			if (Items[i] == null) {
			Items[i] = p1;
		}
		}
	}
	public static void search() {
		for (int i=0; i<Items.length; i++) {
			System.out.printf("%s:%d원\n",Items[i].getName(),Items[i].getPrice());
		}
	}
	public static void main(String[] args) {
		boolean run = true;
			int selectNo = 0;
			
			while(run) {
				System.out.println("1.상품 수 2.상품 및 가격입력 3.제품별 가격 4.분석 5.종료");
				System.out.println("선택 >");
				selectNo = Integer.parseInt(scn.nextLine());
				if (selectNo == 0) {
					
				}else if (selectNo == 1){
					howMany();
				}else if (selectNo == 2) {
					itemvalue();
				}else if (selectNo == 3) {
					search();
				}else if (selectNo == 4) {
					
				}else if (selectNo == 5) {
					
				}
			}
		
	}
}
