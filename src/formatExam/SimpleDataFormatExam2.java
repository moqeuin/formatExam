package formatExam;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class SimpleDataFormatExam2 {

	public static void main(String[] args) {
		
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		
		Scanner sc = new Scanner(System.in);
		Date inDate = null;
		// sc에 데이터가 들어올 때 true를 반환하고 입력할 때까지 기다린다,개행문자 입력문자로 판단
		while(sc.hasNextLine()) {
			try {
				inDate = df.parse(sc.nextLine());
				break;
			} catch (ParseException e) {
				System.out.println("날짜를" + pattern + "의 형태롤 다시 입력해주세요");
				e.printStackTrace();
			}
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar today = Calendar.getInstance();
		long day = (Math.abs((today.getTimeInMillis()-cal.getTimeInMillis())/(60*60*1000)));
		System.out.println(day);
	}

}
