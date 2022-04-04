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
		
		//�̷��� ������� �� 4���� String ��ü���� strArray��� �̸��� ArrayList�� �־� ���Կ� ��
		// ���� add �ϴ� �͵� �ݺ������� ������ �Ѵ�... �� 4���ϱ� �׳� �� �� ��
		strArray.add(str1);
		strArray.add(str2);
		strArray.add(str3);
		strArray.add(str4);

		
		// ArrayList�� ����ϴ� ���: Iterator(�ݺ���)�� ������ �� �������� for������ ������. while������ �����ų�. ���غ��� ��.
		Iterator<String> it = strArray.iterator();
		
		while(it.hasNext()) {
			String str000 = it.next(); // ArrayList�� array�� �ٸ��� ����Ǿ� �ִ� �ڷ� ������ �ƴϴ�. ('�޸� �� ������'�� �پ� ���� �ʴ�.) �׷��� �������� �� - Iterator�� ��� �Ѵ�.
			System.out.println(str000); // '���� �׸�'�� ���� ������ Iterator�� ArrayList ���� ���ҵ��� ��� �����´�. Iterator�� ���� ����Ű�� ���� �ƴ϶� �Ѵ�... p 410 ����.
		}
			
		String str0 = strArray.get(0); // ��) ó���� ������ �� <String>�̶�� String�� ��� ArrayList�� ����������, String str0�� ��ƾ� �Ѵ�.
		System.out.println("get()�Լ��� �ϳ��� ���� �� �־�. " + str0); // �츮�� ArrayList ������ �� abc��� Ŭ������ ������� <abc>��� ������ abc�� �����ؼ� strArray.get(0)�� �޾Ҿ����. ����?
		
	}
}




























