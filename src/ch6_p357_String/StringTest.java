package ch6_p357_String;

public class StringTest {

	public static void main(String[] args) {
		// p.359 - String Ȱ�� �Լ����� �ϳ��� ������ ���� ��. ��
		
		String a = "Korea";
		String b = "Japan";
		String c = "     USA   ";
		String d = "Korea, Japan, China, USA"; //�������� ���� �� �ϼ̴µ� ���� �׷��� �ϳ�? �� split()�Լ��� Ư���� ���� ����� Ȯ���� �ٸ��� �ϳ� ��~
		
		int str_count = a.length(); // ���ڿ��� ����(����)
		
		System.out.println(str_count);
		
		String ab = a.concat(b); // ���ڿ� ����! concatenate�� ���ڴ�.
		System.out.println(ab);
		
		String c_trim = c.trim(); // ���� ���� ����. ��
		System.out.println(c); // Ȯ���� �ٸ���? �ڵ������� ���鵵 ASCII ���� ���´�! �и��� ���ڴ�. null�� �ƴ϶� �����ϴ� ���̵�.
		System.out.println(c_trim); // �׷��� c�� c_trim�� ������ �ٸ� ������ ��޵Ǵ� ����.
		
		// ��) �׷��� �⺻������ �ܺ� ������ ũ�Ѹ��� �� trim()�� ���������� �� �� ���� �ִ� �� �����ϴ�.
		// ��) "�ڵ�� ����ȯ!" <- ���� �߿��� ����̴�. ���� ������ �𸣴� ���ʿ��� ���̴��� ����ϴ� �� ����.
		// Better safe than sorry.
		
		String a_re = a.replace("K", "k"); // replace()�� �� �״�� ���� ���� ��ü. ���ڿ��̴ϱ� K ���� "K"��� �ϴ� �� ���� ����. ��
		System.out.println(a_re);
		
		String a_sub = a.substring(3); // �ᱹ �迭 �ε����� ���� ����: �̷� �Լ��� �����. (��� �ڹ��� String Ŭ������ ���� ��ü�� �޸𸮿��� �迭�� �������. ������ �� �ƴ� �� ���� ������...)
		System.out.println(a_sub); // substring()�� �� �ε������� ������ ����ϴ� ���̴�.
		// �ε����� K(0), o(1), r(2), e(3), a(4)�ϱ�. ��
		
		char a_ch = a.charAt(2); // charAt()�� �� ���ڸ� �̾Ƴ� �ִ� ��.
		System.out.println(a_ch);
		
		String s[] = d.split(","); // split(): �����ڷ� �и��� ���� ����� ���� s[]���� �����ϰڴٴ� ���. (�ᱹ �̰� ������ �͵� String�� �迭�� ����Ǵ� ���̴ϱ� �׷���. p 363 �׸� ����.)
//		String s[] = d.split(", "); // �ٷ� �����̶� �̰Ŷ� Ȯ���� ��°��� �ٸ���. �� �� ��.
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

}
