package ch11_api_class.sec07;

public class StringToPrimitiveValueEx {

	public static void main(String[] args) {
		// 문자열을 기본 타입으로 변환 예제
		int intVal = Integer.parseInt("10");
		double doubleVal = Double.parseDouble("3.14");
		boolean booleanVal = Boolean.parseBoolean("true");
		
		System.out.println(intVal);
		System.out.println(doubleVal);
		System.out.println(booleanVal);


	}

}
