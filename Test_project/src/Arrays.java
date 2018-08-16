class Arrays {
	public static void main (String [] args) {
		//	int [][] array = new int[3][2];
		//	print(array);

			int [][] array = {
				{22,2,66,44},
				{10,3,5,7},
				{22,7,12,8,9}
			};


		for(int i = 0; i < array.length; i++) {
				for(int  j = 0; j < array[i].length; j++){
					System.out.print(array[i][j] + " ");
				}
				System.out.println();
			}
		char[][] charArray =  toCharArray(array);
		for(int i = 0; i < charArray.length; i++) {
				for(int  j = 0; j < charArray[i].length; j++){
					System.out.print(charArray[i][j] + " ");
				}
				System.out.println();
			}
		};
		
//10.принимает 2м массив интов, возвращает 2мерный массив чаров, каждый символ в позиции массива соответствует коду символа передаваемого инта
		
		static char[][] toCharArray (int [][] array){
			char [][] arrayCH = new char [array.length][] ;
			for(int i = 0; i < array.length; i++) {
				// char[] innerArray = new char[array[i].length];
				// arrayCH[i] = innerArray;
				arrayCH[i] = new char[array[i].length];
				for(int  j = 0; j < array[i].length; j++){
					char ch = (char) array[i][j];
					//System.out.print(ch);
					arrayCH [i][j]  = ch;
				}
			}
			//for(int i = 0; i < arrayCH.length; i++) {
			//	for(int  j = 0; j < arrayCH[i].length; j++){
			//		System.out.print(arrayCH[i][j]);
			//	}
			//}
			return arrayCH;
		}

	//	11.принимает 2м массив интов, ивертирует массив интов (каждое значение в передаваемом массиве меняет знак)
		static int[][] invert (int [][] array){
			int [][] arrayInvert = new int [array.length][] ;
			for(int i = 0; i < array.length; i++) {
				//int [] innerArray = new int [array[i].length];
				//arrayInvert[i] = innerArray;
				arrayInvert[i] = new int [array[i].length];
				for(int  j = 0; j < array[i].length; j++){
					arrayInvert [i][j]  = array[i][j]*(-1);
				}
			}
			//for(int i = 0; i < arrayCH.length; i++) {
			//	for(int  j = 0; j < arrayCH[i].length; j++){
			//		System.out.print(arrayCH[i][j]);
			//	}
			//}
			return arrayInvert;
		}


}
