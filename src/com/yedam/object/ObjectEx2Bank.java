package com.yedam.object;

import java.util.Scanner;

public class ObjectEx2Bank {
	public static void main(String[] args) {
		Bank[] accounts = new Bank[3]; 
		
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		int selectNo = 0;
		
		while(run) {
			System.out.println("1.등록 2.조회(계좌번호) 3.입금 4.출금 5.종료");
			System.out.println("선택> ");
			selectNo = Integer.parseInt(scn.nextLine());
			
			if(selectNo == 1) {//등록
				
				for (int i = 0; i<accounts.length; i++) {

					System.out.println("계좌번호를 등록합니다\n사용하실 계좌번호를 입력하세요");
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
				System.out.println("계좌번호를 조회합니다\n계좌번호를 입력해주세요");
				String searching = scn.nextLine();
				
				for(int i=0; i < accounts.length; i++) {
					if(accounts[i].accountNo.equals(searching)) {
						System.out.printf("계좌주 : %s님의 계좌잔액은 %s원 입니다.\n",accounts[i].owner,accounts[i].balance);
				}
					
				}
			}else if (selectNo == 3) {
				System.out.println("입금화면 입니다\n받으시는 분의 계좌번호를 입력해주세요");
				String Send = scn.nextLine();
				for(int i=0; i<accounts.length; i++) {
					if(accounts[i].accountNo.equals(Send)) {
						System.out.println("보내실 금액을 입력해주세요.");
						int money = Integer.parseInt(scn.nextLine());
						accounts[i].balance += money;
					}
				}
			}else if (selectNo == 4) {
				for(int i=0; i<accounts.length; i++) {
						System.out.println("꺼내실 금액을 입력해주세요.");
						int money = Integer.parseInt(scn.nextLine());
						accounts[i].balance -= money;
				}
			}else if (selectNo == 5) {
				System.out.println("종료합니다.");
				System.exit(0);
			}
		}
		
		System.out.println("end of prog.");
		
		
	}
}
