import java.net.URL;
import java.net.MalformedURLException;

class Methods {


	// пирамида из #
	//печать
	static void  Print1 (){
		for(int i = 1; i <= 5; i++){
			Methods.printStr (i);
			System.out.println();
		}
	}

	static void printStr (int n)  {
		switch (n) {
			case 1: System.out.print("    ##  ##    ");
			break;
			case 2: System.out.print("   ###  ###   ");
				break;
			case 3: System.out.print("  ####  ####  ");
				break;
			case 4: System.out.print(" #####  ##### ");
				break;
			case 5: System.out.print("######  ######");
				break;
		}
	}
//принимаем URL , и возвращаем доменное имя
	static String domain (String url){
		String temp1 = url.substring(url.indexOf("//") + 2);
		String dom_name = temp1.substring(0,temp1.indexOf('/'));
		return dom_name;
	}


	//принимаем URL , и возвращаем доменное имя - 2й метод
	public static String domain2 (String url) throws MalformedURLException {
		if(!url.startsWith("http") && !url.startsWith("https")){
			url = "http://" + url;
		}
		URL netUrl = new URL(url);
		String host = netUrl.getHost();
		if(host.startsWith("www")){
			host = host.substring("www".length()+1);
		}
		return host;
	}

	//приминает 2 инта, а и б, возвращает большее их этих 2х чисел
	static int Max (int a, int b){
		int bigone;
		if (a > b) {
			bigone = a;
		} else bigone = b;
	return bigone;
	}

	//Написать функцию, принимающую строку, и возвращающую количество раз, буква 'e' (большая и маленькая) встречается в данной строке.
	static int contE(String str){
        char[] strToArray = str.toCharArray();
        int sum = 0;
		for (int i = 0; i < strToArray.length; i++) {
			if ( strToArray[i] == 'e' || strToArray[i] == 'E') sum++;
		}
		return sum;
	}
    //Написать функцию, принимающую число, и возвращающую сумму положительных чисел меньше заданного, которые делятся на 3 или на 5.
    static int LessDiv (int a){
	    int sum = 0;
	    for (int i = a; i > 0; i--) {
	        if (i%3==0 || i%5==0 ) sum = sum + i;
        }
        return sum;
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