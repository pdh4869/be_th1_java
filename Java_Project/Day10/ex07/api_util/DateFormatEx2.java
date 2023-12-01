package ex07.api_util;

import java.util.*;
import java.text.*;
class DateFormatEx2{
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2005, 9, 3);	
		Date day = cal.getTime();
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4, sdf22, sdf222, sdf2222;
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("yy-MM-dd E요일"); // E 하나 > 월, E 네개 > 월요일
		sdf22 = new SimpleDateFormat("yy-MM-dd E");   
		sdf222 = new SimpleDateFormat("yy-MM-dd E",Locale.ENGLISH); // 영문요일
		sdf2222 = new SimpleDateFormat("yy-MM-dd EEEE",Locale.ENGLISH); // +day
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS"); // 00~60
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a"); // 오전 / 오후
		
		System.out.println(sdf1.format(day)); // format(Date d)
		System.out.println(sdf2.format(day));
		System.out.println(sdf22.format(day));  //
		System.out.println(sdf222.format(day));
		System.out.println(sdf2222.format(day));
		System.out.println(sdf3.format(day));
		System.out.println(sdf4.format(day));

	}
}