package ch11_api_class.sec04;

import java.util.concurrent.TimeUnit;

public class SystemTime {

	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		System.out.println(time1);
		
		// ���� ����
		long time2 = System.nanoTime();
		System.out.println(time2);
		
		// ���� �۾� ����
		int sum = 0;
		for(int i=1;i<=1000000;i++) {
			sum+=i;
		}
		// ���� ����
		long time3 = System.nanoTime();
		System.out.println(time3);
		
		System.out.println("1~1000000������ �� : "+ sum);
		System.out.println("��꿡"+(time3-time2)+"�����ʰ� �ҿ�Ǿ����ϴ�.");
		
		// �и���/ ������ ��ȯ
		long nanoSeconds =TimeUnit.MILLISECONDS.toNanos(time1);
		System.out.println(nanoSeconds);
		
		long millliSeconds2 =TimeUnit.NANOSECONDS.toNanos(time2);
		System.out.println(millliSeconds2);
		
		long milliSeconds3 =TimeUnit.NANOSECONDS.toNanos(time3);
		System.out.println(milliSeconds3);
		
		System.out.println(milliSeconds3-millliSeconds2);
	}

}
