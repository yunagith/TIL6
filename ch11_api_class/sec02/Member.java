package ch11_api_class.sec02;

import java.util.Arrays;

public class Member implements Cloneable{
	String name;
	int age;
	int[] scores;
	Car car;
	
	public Member(String name, int age, int[] scores, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	public Member getMember() { //������ ��ü ��ȯ
		Member cloned = null;
		
		try {
			cloned = (Member)clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cloned;
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// ���� ���� ���縦 �ؼ� name, age ����
		Member cloned = (Member)super.clone();
		
		// �迭 scores ����
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
				
		//car ����
		cloned.car = new Car(this.car.model);
		
		//���� ������ Member ��ü ����
		return cloned;
	}
}







