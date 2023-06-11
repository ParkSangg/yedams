package chapter6;

public class Member {
	String name;
	String id;
	
	
	Member(String name){
		this(name,"hong");
	}
	Member(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	Member user1 = new Member("홍길동","hong");
	
}
