class Methods {

	//приминает 2 инта, а и б, возвращает большее их этих 2х чисел
	static int Max (int a, int b){
		int bigone;
		if (a > b) {
			bigone = a;
		} else bigone = b;
	return bigone;
	}



	// принимает 3 инта, возвращает большее из них
	static int Max (int a, int b, int c){
		int bigone;
		int tmp = Max( a, b );
		if ( tmp > c ) {
			bigone = tmp;
		} else bigone = c;
	return bigone;
	}

	// принимает 5 инта, возвращает большее из них
	static int Max (int a, int b, int c, int d, int e){
		int[] array;
		array = new int [5];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		array[3] = d;
		array[4] = e;
		for (int i = 0; i < array.length; i++) {
        int min = array[i];
        int min_i = i; 
        for (int j = i+1; j < array.length; j++) {
             if (array[j] < min) {
                min = array[j];
                min_i = j;
            }
        }
         if (i != min_i) {
            int tmp = array[i];
            array[i] = array[min_i];
            array[min_i] = tmp;
        }
     }

	return array[4];
	}

	//метод принимает инт, и возвращает факториал от заданого инта

	static int Fact (int a){
		int result = a;
		for ( int i = a - 1; i>=1; i = i - 1 ) {
			result = result * i;
		}
	return result;
	}
	public static void hello_me () {
		System.out.println ("Hello, MTX");
	}
	static int powerOfTwo (int a) {
		//     int c = a*a;
		return a*a;
	}
	static boolean isEven (int a){
		return a % 2 == 0;
	}

	static String isEven2 (int a){
		return a % 2 == 0 ? "Even":"Odd";
	}
}