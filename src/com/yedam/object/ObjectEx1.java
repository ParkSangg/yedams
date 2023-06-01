package com.yedam.object;

import java.util.Scanner;

public class ObjectEx1 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		Member[] members = new Member[2];
		
		
		//등록
		for(int i= 0; i< members.length; i++) {
			
			Member m1 = new Member();
			
			System.out.println("아이디를 입력> ");
			String id = scn.nextLine();
			//i => 0 이면 처음등록 , i != 0 이면 ID중복값 확인

			
			
			if(i != 0) {
				boolean Check = false;
				for (int j=0; j< i; j++) {
					if (members[j].memberId.equals(id)) {
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
			m1.memberId = id;
			
			System.out.println("이름을 입력> ");
			m1.membername = scn.nextLine();
			
			System.out.println("Point를 입력> ");
			m1.point = Integer.parseInt(scn.nextLine());
			
			members[i] = m1;
		}
		//ID 조회 후 변경
		System.out.println("조회할 아이디를 입력.");
		String searchId = scn.nextLine();
		System.out.println("변경할 point를 입력");
		
		int newPoint = Integer.parseInt(scn.nextLine());
			
		for(int i= 0; i<members.length; i++) {
				if (members[i].memberId.equals(searchId)) {
					members[i].point = newPoint;
					System.out.println("변경된값:" + members[i].point);
				}
		}
		//출력
		for(int i= 0; i < members.length; i++) {
				System.out.printf("아이디:%s, 이름:%s, point: %d\n",
						members[i].memberId,
						members[i].membername,
						members[i].point);
		}
	scn.close();
	}
}

