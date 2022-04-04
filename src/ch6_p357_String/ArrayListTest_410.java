package ch6_p357_String;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest_410 {

	public static void main(String[] args) {	
		
		ArrayList<String> strArray = new ArrayList<String>();
		
		String str1 = "Korea";
		String str2 = "Japan";
		String str3 = "France";
		String str4 = "USA";
		
		//이렇게 만들어진 저 4개의 String 개체들을 strArray라는 이름의 ArrayList에 넣어 볼게요 ㅋ
		// 원래 add 하는 것도 반복문으로 돌리긴 한다... 뭐 4개니까 그냥 해 봄 ㅋ
		strArray.add(str1);
		strArray.add(str2);
		strArray.add(str3);
		strArray.add(str4);

		
		// ArrayList를 출력하는 방법: Iterator(반복자)를 선언한 후 간지나게 for문으로 돌린다. while문으로 돌리거나. 함해보자 ㅋ.
		Iterator<String> it = strArray.iterator();
		
		while(it.hasNext()) {
			String str000 = it.next(); // ArrayList는 array와 다르게 연결되어 있는 자료 구조가 아니다. ('메모리 상 번지수'가 붙어 있지 않다.) 그러니 가져오는 놈 - Iterator를 써야 한다.
			System.out.println(str000); // '다음 항목'이 없을 때까지 Iterator는 ArrayList 상의 원소들을 계속 가져온다. Iterator는 직접 가리키는 놈은 아니라 한다... p 410 봐라.
		}
			
		String str0 = strArray.get(0); // 교) 처음에 선언할 때 <String>이라고 String을 담는 ArrayList를 선언했으니, String str0에 담아야 한다.
		System.out.println("get()함수로 하나만 뽑을 수 있어. " + str0); // 우리가 ArrayList 선언할 때 abc라는 클래스를 담으라고 <abc>라고 했으면 abc를 선언해서 strArray.get(0)을 받았어야지. ㅇㅋ?
		
	}
}




























