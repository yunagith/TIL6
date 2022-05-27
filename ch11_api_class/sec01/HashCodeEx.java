package ch11_api_class.sec01;

import java.util.Objects;

class Student{
	int sno;
	String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	@Override
	public int hashCode() {
		// sno�� name ������ ���� ��ü�� �����ϵ���
		//Object.hash(sno, name) �޼ҵ�
		// �Ű������� ���޵� ���� �̿��ؼ� �ؽ� �ڵ� ����
		return Objects.hash(sno,name);
	}
	
}

public class HashCodeEx {

	public static void main(String[] args) {
		Student s1 = new Student(1, "ȫ�浿");
		Student s2 = new Student(1, "ȫ�浿");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//Object.hashCode(��ü) : ��ü�� �ؽ��ڵ� ����
		System.out.println(Objects.hashCode(s1));
		System.out.println(Objects.hashCode(s2));

	}

}
