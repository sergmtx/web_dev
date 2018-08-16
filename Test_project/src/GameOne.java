import java.util.*;

class GameOne {

	public static void main(String [] args) {
		Scanner scanner  = new Scanner(System.in);
		String s = "Welcome message";
		System.out.println(s);
		
		Random random = new Random();
		
		/*for(int i = 0; i < 5; i++) {
			String intValueStr = scanner.nextLine();
			int value = Integer.parseInt(intValueStr);
			System.out.println("value = "  + value);		
		}*/
		//int randomValue =  random.nextInt(101);	
		/*while(true) {
			//int randomValue =  random.nextInt(101);
			System.out.println("Enter value" );
			String intValueStr = scanner.nextLine();
			int value = Integer.parseInt(intValueStr);
			if (value > randomValue) {
				System.out.println("randomValue " + randomValue + "is less than" + value );
			} else if (value < randomValue) {
				System.out.println("randomValue " + randomValue + "is larger than" + value );
			}else {
				SysteSystem.out.println("randomValue " + randomValue + "is less than" + value );m.out.println("randomValue" + randomValue + "is equals" + value);	
				break;
			}
		}*/
		System.out.println("Enter value from 1 to 100");
		String intValueStr = scanner.nextLine();
		int value = Integer.parseInt(intValueStr);
		int randomValue =  50;
		while(true) {
			if (value > randomValue) {
				System.out.println("randomValue " + randomValue + "is less than" + value );
				randomValue = randomValue+1;
			} else if (value < randomValue) {
				System.out.println("randomValue " + randomValue + "is larger than" + value );
				randomValue = randomValue-1;
			} else if (value == randomValue) {
				System.out.println("randomValue" + randomValue + "is equals" + value);	
				break;
			}
		}
	}
		
}