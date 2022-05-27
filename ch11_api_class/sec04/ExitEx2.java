package ch11_api_class.sec04;

public class ExitEx2 {

	public static void main(String[] args) {
		
		// ���� ������ ����
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				if(status != 5) {
					throw new SecurityException();
				}
			}
		});
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			
			try {
				System.exit(i);
			} catch (Exception e) {				
			}			
		}
	}
}
