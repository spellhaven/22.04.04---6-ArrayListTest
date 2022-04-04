package ch6_p357_String;

public class MathClassTest_371 {

	public static void main(String[] args) {
		// Math 클래스도 java.lang에 포함되어 있다. import 안 해 줘도 있는 충직한 놈.
		// 충직하고... 현명하지만 내가 부를 때까지는 잘난척하며 말하지도 않고 과묵하게 기다리고... 몸도 좋을 거 같음. 군침싹
		
		System.out.println(Math.PI); // 피칸 파이
		System.out.println(Math.E); // 자연로그의 밑(오잃러상수). 아니 씨발 자연로그형! 난 몰라 너!!
		
		System.out.println(Math.floor(0));
		System.out.println(Math.floor(4.5)); // 얘보다 작은 정수 찾아 주는 놈 (내림)
		System.out.println(Math.ceil(9.682)); // 얘보다 큰 정수 찾아 주는 놈 (올림)
		System.out.println(Math.round(1544.11234)); // 반올림
		
		System.out.println(Math.sqrt(25));
		System.out.println(Math.sqrt(28)); // 죄곱근
		
		System.out.println(Math.exp(5)); // e의 5승
		
		double rand = Math.random(); // 기본적으로 Math.random()은 0과 1 사이의 랜덤한 double 값(난수)을 반환한다.	
		System.out.println(rand); // 어? C언어랑 다르게 여기 Math.random()은 우리가 시간이 시드야~ 이렇게 안 명시해도 알아서 계속 달라지네?
		
		int lotto = (int)(Math.random() * 45 + 1); // 그래서 이렇게 로또 번호를 만들 수 있지 뭐. 형변환하는 거 잊지 마.
		System.out.println(lotto); // 이런 식으로 컴퓨터와 가위바위보 하기~ 도 할 수 있고 뭐. 크크킄.
	}

}
