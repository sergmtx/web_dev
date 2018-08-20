class Triangles {

	// пирамида из #
	//печать
	private static int START_QUANTITY_OF_SYMBOLS = 2;
	private static int END_QUANTITY_OF_SYMBOLS = 6;
	private static int TOTAL_QUANTITY_OF_SYMBOLS_BEFORE_CENTER = 6;
	private static final String PYRAMID_BLOCK = "#";
	private static final String WHITESPACE = " ";

	public static void outputPyramid()
	{
		for (int i = START_QUANTITY_OF_SYMBOLS; i <= END_QUANTITY_OF_SYMBOLS; i++)
		{
			outputSymbols(TOTAL_QUANTITY_OF_SYMBOLS_BEFORE_CENTER - i, WHITESPACE);
			outputSymbols(i, PYRAMID_BLOCK);
			System.out.print(WHITESPACE+WHITESPACE);
			outputSymbols(i, PYRAMID_BLOCK);
			if (i != END_QUANTITY_OF_SYMBOLS)
			{
				System.out.println();
			}
		}
	}

	private static void outputSymbols(int quantity, String symbol)
	{
		for (int i = 0; i < quantity; i++)
		{
			System.out.print(symbol);
		}
	}



}
