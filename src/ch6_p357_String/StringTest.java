package ch6_p357_String;

public class StringTest {

	public static void main(String[] args) {
		// p.359 - String 활용 함수들을 하나씩 따라해 보는 중. ㅋ
		
		String a = "Korea";
		String b = "Japan";
		String c = "     USA   ";
		String d = "Korea, Japan, China, USA"; //교수님은 띄어쓰기 않 하셨는데 나도 그려야 하나? 아 split()함수의 특성에 의해 결과가 확실히 다르긴 하네 ㅋ~
		
		int str_count = a.length(); // 문자열의 길이(개수)
		
		System.out.println(str_count);
		
		String ab = a.concat(b); // 문자열 연결! concatenate의 약자다.
		System.out.println(ab);
		
		String c_trim = c.trim(); // 양쪽 공백 제거. ㅋ
		System.out.println(c); // 확실히 다르지? 코딩에서는 공백도 ASCII 값을 갖는다! 분명히 문자다. null이 아니라 존재하는 값이디.
		System.out.println(c_trim); // 그래서 c와 c_trim이 완전히 다른 값으로 취급되는 거지.
		
		// 교) 그래서 기본적으로 외부 데이터 크롤링할 땐 trim()을 무지성으로 한 번 돌려 주는 게 좋습니다.
		// 교) "코드는 유비무환!" <- 정말 중요한 명언이다. 뭐가 들어올지 모르니 불필요해 보이더라도 대비하는 게 낫지.
		// Better safe than sorry.
		
		String a_re = a.replace("K", "k"); // replace()는 말 그대로 뭐를 뭐로 대체. 문자열이니까 K 말고 "K"라고 하는 거 잊지 말디. ㅋ
		System.out.println(a_re);
		
		String a_sub = a.substring(3); // 결국 배열 인덱스의 존재 이유: 이런 함수들 쓸라고. (사실 자바의 String 클래스로 만든 객체도 메모리에는 배열로 저장되지. 선언할 땐 아닌 거 같아 보여도...)
		System.out.println(a_sub); // substring()은 그 인덱스부터 끝까지 출력하는 놈이다.
		// 인덱스는 K(0), o(1), r(2), e(3), a(4)니까. ㅋ
		
		char a_ch = a.charAt(2); // charAt()은 한 글자만 뽑아내 주는 놈.
		System.out.println(a_ch);
		
		String s[] = d.split(","); // split(): 구분자로 분리해 놓은 놈들을 여기 s[]에다 저장하겠다는 얘기. (결국 이게 가능한 것도 String이 배열로 저장되는 놈이니까 그렇다. p 363 그림 봐라.)
//		String s[] = d.split(", "); // 바로 윗줄이랑 이거랑 확실히 출력값이 다르다. 잘 봐 둬.
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

}
