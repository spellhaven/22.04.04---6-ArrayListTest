package ch6_p357_String;

public class MathClassTest_371 {

	public static void main(String[] args) {
		// Math Ŭ������ java.lang�� ���ԵǾ� �ִ�. import �� �� �൵ �ִ� ������ ��.
		// �����ϰ�... ���������� ���� �θ� �������� �߳�ô�ϸ� �������� �ʰ� �����ϰ� ��ٸ���... ���� ���� �� ����. ��ħ��
		
		System.out.println(Math.PI); // ��ĭ ����
		System.out.println(Math.E); // �ڿ��α��� ��(���ҷ����). �ƴ� ���� �ڿ��α���! �� ���� ��!!
		
		System.out.println(Math.floor(0));
		System.out.println(Math.floor(4.5)); // �꺸�� ���� ���� ã�� �ִ� �� (����)
		System.out.println(Math.ceil(9.682)); // �꺸�� ū ���� ã�� �ִ� �� (�ø�)
		System.out.println(Math.round(1544.11234)); // �ݿø�
		
		System.out.println(Math.sqrt(25));
		System.out.println(Math.sqrt(28)); // �˰���
		
		System.out.println(Math.exp(5)); // e�� 5��
		
		double rand = Math.random(); // �⺻������ Math.random()�� 0�� 1 ������ ������ double ��(����)�� ��ȯ�Ѵ�.	
		System.out.println(rand); // ��? C���� �ٸ��� ���� Math.random()�� �츮�� �ð��� �õ��~ �̷��� �� ����ص� �˾Ƽ� ��� �޶�����?
		
		int lotto = (int)(Math.random() * 45 + 1); // �׷��� �̷��� �ζ� ��ȣ�� ���� �� ���� ��. ����ȯ�ϴ� �� ���� ��.
		System.out.println(lotto); // �̷� ������ ��ǻ�Ϳ� ���������� �ϱ�~ �� �� �� �ְ� ��. ũũ��.
	}

}
