package com.yedam.StudentApp;
import java.util.Scanner;
public class index {
	//학생정보관리 App.
	//1.등록 2.목록 3.조회(이름) 4.수정(점수) 5.삭제 6.종료 (목차)
	//정보// 학생번호(23-001).이름.성별(남,여).성적
	static Student[] accounts = new Student[3];
	static Scanner scn = new Scanner(System.in);
	public static void register() {
		for(int i=0; i<accounts.length; i++) {
			
			System.out.println("학생등록화면입니다.\n학번을 입력해주세요.(00-000)");
			String StId = scn.nextLine();
			Student s1 = new Student();
			
			if(i != 0) {
				boolean Check = false;
				for (int j=0; j< i; j++) {
					if (accounts[j].getStudentNo().equals(StId)) {
						Check= true;
					break;
					}
				}
				if (Check) {
					System.out.println("이미 존재하는 학번입니다.");
					i--;
					continue;
				}
			}
			
			s1.setStudentNo(StId);
			
			System.out.println("이름을 입력해주세요.");
			String Stname = scn.nextLine();
			s1.setName(Stname);
			
			System.out.println("성별을 입력해주세요 남 / 여");
			String Stgender = scn.nextLine();
			s1.setGender(Stgender);
			
			System.out.println("점수를 입력해주세요");
			int Stscore = Integer.parseInt(scn.nextLine());
			s1.setScore(Stscore);
			
			accounts[i] = s1;
		}
	}
	public static void list() {
		for(int i=0; i < accounts.length; i++) {
			System.out.println(accounts[i]);
		}
	}
	
	
	public static void main(String[] args) {
		boolean run = true;
			int selectNo = 0;
			
			while(run) {
				System.out.println("1.등록 2.목록 3.조회 4.수정 5.삭제 6.종료");
				System.out.println("선택>");
				selectNo = Integer.parseInt(scn.nextLine());
				if(selectNo == 0) {
					
				}else if(selectNo == 1){
					register();
				}else if(selectNo == 2) {
					list();
				}else if(selectNo == 3) {
					
				}else if(selectNo == 4) {
					
				}else if(selectNo == 5) {
					
				}else if(selectNo == 6) {
					
				}
			}
	}
	//1.register() 2.list() 3.search() 4.modify() 5.remove
				//  남-1명, 여-2명, 최고점수: 학생이름 - 100점
	}
