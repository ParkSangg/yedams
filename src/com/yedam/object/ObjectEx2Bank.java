package com.yedam.object;

import java.util.Scanner;

public class ObjectEx2Bank{

	static Bank[] accounts = new Bank[2]; 
	static Scanner scn = new Scanner(System.in);
	
	public static void registerAccount() {
		for (int i = 0; i<accounts.length; i++) {

			System.out.println("계좌번호를 등록합니다\n사용하실 계좌번호를 입력하세요");
			String id = scn.nextLine();
			Bank b1 = new Bank();
			
			if(i != 0) {
				boolean Check = false;
				for (int j=0; j< i; j++) {
					if (accounts[j].getAccountNo().equals(id)) {
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
			
			b1.setAccountNo(id);
			System.out.println("이름을 입력> ");
			String name = scn.nextLine();
			b1.setOwner(name);
			
			System.out.println(b1.getBalance());
			
			accounts[i] = b1;
		}
	}
	public static void searchAccount() {
		String searching = scn.nextLine();
		for(int i=0; i < accounts.length; i++) {
			if(accounts[i].getAccountNo().equals(searching)) {
				System.out.printf("계좌주 : %s님의 계좌잔액은 %s원 입니다.\n",accounts[i].getOwner(),accounts[i].getBalance());
			}
		}
	}
	public static boolean checkAccount(String accountNo) {
		String searching = scn.nextLine();
		boolean isExist = false;
		for(int i=0; i < accounts.length; i++) {
			if(accounts[i] !=null && accounts[i].getAccountNo().equals(searching)) {
				isExist = true;
				break;
			}
		}
		return isExist;
	} 
	public static void deposit() {
		
		String Send = scn.nextLine();
		boolean isTrue = checkAccount(Send);
			for(int i=0; i<accounts.length; i++) {
				System.out.println("보내실 금액을 입력해주세요.");
				int money = Integer.parseInt(scn.nextLine());
				accounts[i].setBalance(accounts[i].getBalance()+money);
			if(!isTrue){
			System.out.println("찾는 계좌 정보가 없습니다.");
			}
		}
	}

	public static void withdraw() 
{
		
		
		String cash = scn.nextLine();
		
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i].getAccountNo().equals(cash)) {
				System.out.println("꺼내실 금액을 입력해주세요.");
				int money = Integer.parseInt(scn.nextLine());
				accounts[i].setBalance(accounts[i].getBalance()-money);
			}
		}
	}
	
	public static void main(String[] args) {
		
		boolean run = true;
			int selectNo = 0;
			
			while(run) {
				System.out.println("1.등록 2.조회(계좌번호) 3.입금 4.출금 5.종료");
				System.out.println("선택> ");
				selectNo = Integer.parseInt(scn.nextLine());
				
				if(selectNo == 1) {//등록
					registerAccount();
					
				}else if (selectNo == 2) {
					System.out.println("계좌번호를 조회합니다\n계좌번호를 입력해주세요");
					searchAccount();
					
				}else if (selectNo == 3) {
					System.out.println("입금화면 입니다\n받으시는 분의 계좌번호를 입력해주세요");
					deposit();
					
				}else if (selectNo == 4) {
					System.out.println("출금화면 입니다\n출금하실분의 계좌번호를 입력해주세요");
					withdraw();
					
				}else if (selectNo == 5) {
					System.out.println("종료합니다.");
					System.exit(0);
				}
			}
		System.out.println("end of prog.");
	}
}
