package com.yedam.object;

import java.util.Scanner;

public class ObjectEx2Bank {
	public static void main(String[] args) {
		Bank[] accounts = new Bank[3]; 
		// int[] {0,0,0}, Bank[] {null,null,null}
		
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		int selectNo = 0;
		int count = 0;
		
		while(run) {
			System.out.println("1.등록 2.조회(계좌번호) 3.입금 4.출금 5.종료");
			System.out.println("선택> ");
			selectNo = Integer.parseInt(scn.nextLine());
			
			if(selectNo == 1) {//등록
				System.out.println("계좌번호를 등록해주세요");
				
				for (int i = 0; i<accounts.length; i++) {
					
					String id = scn.nextLine();
					Bank b1 = new Bank();
					
					if(i != 0) {
						boolean Check = false;
						for (int j=0; j< i; j++) {
							if (accounts[j].accountNo.equals(id)) {
								Check= true;
							break;
							}
						}
						if (Check) {
							System.out.println("중복값입니다.");
							i--;
							continue;
						}
					}
					
					b1.accountNo = id;
					System.out.println("이름을 입력> ");
					b1.owner = scn.nextLine();
					
					System.out.println(b1.balance);
					
					accounts[i] = b1;
				}
			}else if (selectNo == 2) {
				System.out.println("계좌번호를 입력하세요");
				
			}else if (selectNo == 3) {
				System.out.println("입금화면 입니다");
				
			}else if (selectNo == 4) {
				System.out.println("출금화면 입니다");
				
			}else if (selectNo == 5) {
				System.out.println("종료합니다.");
			}
		}
		
		System.out.println("end of prog.");
		
		
	}
}
