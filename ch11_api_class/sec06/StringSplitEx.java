package ch11_api_class.sec06;

public class StringSplitEx {

	public static void main(String[] args) {
		// split() ����
		String text = "ȫ�浿&�̸���,������,���ڹ�-���ڹ�";
		String[] names = text.split("&|,|-");
		
		for(String name : names) {
			System.out.println(name);
		}
		String tel = "010-1234-5678";
		String[] telNums = tel.split("-");
		
		for(String num : telNums) {
			System.out.println(num);
		}
	}

}
