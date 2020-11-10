package formatExam;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDataFormatExam {

	public static void main(String[] args) {
		
		// SimpleDateFormat은 Date데이터를 지정된 형식으로 변환해서 문자열로 출력한다.
		
		Date today = new Date();
		
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4,sdf5,sdf6,sdf7,sdf8,sdf9;
		
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("yy년 MMM dd일  E요일");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		
		sdf5 = new SimpleDateFormat("오늘은 올 해의 D번 째 날입니다.");
		sdf6 = new SimpleDateFormat("오늘은 이 달의 d번 째 날입니다.");
		sdf7 = new SimpleDateFormat("오늘은 올 해의 W번 째 주입니다.");
		sdf8 = new SimpleDateFormat("오늘은 올 해의 w번 째 주입니다.");
		sdf9 = new SimpleDateFormat("오늘은 올 해의 F번 째 E요일입니다.");
		
		
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		System.out.println(sdf5.format(today));
		System.out.println(sdf6.format(today));
		System.out.println(sdf7.format(today));
		System.out.println(sdf8.format(today));
		System.out.println(sdf9.format(today));
		
		// parse, 문자열을 형식에 맞춰 대입하면 Date타입 데이터로 변환한다.
		
		DateFormat sd1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat sd2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d= sd1.parse("2019년 11월 23일");
			System.out.println(d); //Sat Nov 23 00:00:00 KST 2019
			System.out.println(sd2.format(d)); // 2019/11/23
		} catch (ParseException e) {			
			e.printStackTrace();
		}
		
		// format() : date -> 형식 -> 문자열
		// parse() : 문자열 -> 형식 -> date
		
		
	}

}
