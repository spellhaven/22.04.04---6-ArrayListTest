package ch6_p357_String;

import java.util.Calendar;

public class CalendarTest_373 {

	public static void main(String[] args, Calendar cal) { // 어 Calendar cal 이걸 main()함수의 인수로 넣으면 에러가 않나네... 외? 신기헤.
		// 어. 사실 웹에선 Calendar를 쓸 일이 별로 없어...
		// 왜냐면 자바의 시간을 가져오지 않고, 데이터베이스에 자동으로 저장되는 시간을 가져와서 찍기 때문이야.		
		int time = cal.get(Calendar.AM_PM);
		System.out.println(time);
		
		// 아 않되네... 그냥 가자 ㅋ
	}

}
