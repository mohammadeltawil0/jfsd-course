public class PatternFour {
    public static void main(String[] args) {
        for (int i=1; i <= 5; i++) { // represent row number
			for (int j = 1; j <= i; j++) { // represent column number
                System.out.print(j%2);				
			}
			System.out.println();
        }
    }
}
