package com.yedam.insa;

import java.util.Calendar;

// set(), cal()
public class CalendarEx {
	static int year;
	static int month;
	
	
	static void set(int year, int month) {
		CalendarEx.year = year;
		CalendarEx.month = month-1;
	}
	
	static void cal() {
		Calendar cal = Calendar.getInstance();
		cal.get(Calendar.DATE);
		cal.set(CalendarEx.year, CalendarEx.month,1);
		//공백수, 마지막날 설정
		int firstdate = cal.get(Calendar.DAY_OF_WEEK) - 1;
		int lastdate = cal.getActualMaximum(Calendar.DATE);
		//달력표시
		String days = "Sun Mon Tue Wed Thr Fri Sat";
		System.out.println(days);
		
		for(int i=1; i<=firstdate;i++) {
			System.out.printf("%3s ","");
		}
		for(int j=1; j<=lastdate;j++) {
			System.out.printf("%3d ",j);
			if((firstdate +j) %7 == 0) {
				System.out.println();
			}
		}
	}
}
