package formatExam;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatExam {

	public static void main(String[] args) {
		// 정수를 원하는 패턴으로 변환해서 문자열로 반환한다.
		
		
		double number =12346.789;
		// #은 10진수,  #.##E0 (10진수).(10진수)(10진수) E0은 지정한 자릿수까지 자릿수를 올린만큼 표시한다.
		DecimalFormat df = new DecimalFormat("#.##E0");
		
		String str = df.format(number);
		System.out.println(str); // 1.23E4
		
		
		// parse, 기호나 문자가 포함된 문자열을 숫자로 바꾼다.
		
		DecimalFormat df1 = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.##E0");
		
		try {
			Number num = df1.parse("123,456.78");
			// Integer.parseInt는 ,가 포함된 문자열을 변환하지못한다.
			double d = num.doubleValue();
			System.out.println("d: " + d); //d: 123456.78
			System.out.println(df2.format(num)); //1.23E5
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		

	}

}
