package ch11_api_class.sec04;

import java.util.concurrent.TimeUnit;

public class SystemTime {

	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		System.out.println(time1);
		
		// 시작 시점
		long time2 = System.nanoTime();
		System.out.println(time2);
		
		// 연산 작업 수행
		int sum = 0;
		for(int i=1;i<=1000000;i++) {
			sum+=i;
		}
		// 종료 시점
		long time3 = System.nanoTime();
		System.out.println(time3);
		
		System.out.println("1~1000000까지의 합 : "+ sum);
		System.out.println("계산에"+(time3-time2)+"나노초가 소요되었습니다.");
		
		// 밀리초/ 나노초 변환
		long nanoSeconds =TimeUnit.MILLISECONDS.toNanos(time1);
		System.out.println(nanoSeconds);
		
		long millliSeconds2 =TimeUnit.NANOSECONDS.toNanos(time2);
		System.out.println(millliSeconds2);
		
		long milliSeconds3 =TimeUnit.NANOSECONDS.toNanos(time3);
		System.out.println(milliSeconds3);
		
		System.out.println(milliSeconds3-millliSeconds2);
	}

}
