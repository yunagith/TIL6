package ch11_api_class.sec06;

public class StringSplitEx {

	public static void main(String[] args) {
		// split() ¿¹Á¦
		String text = "È«±æµ¿&ÀÌ¸ù·æ,¼ºÃáÇâ,±èÀÚ¹Ù-¹ÚÀÚ¹Ù";
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
