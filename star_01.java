public class star_01 {
	public static void main(String args []) {
		for(int i=1; i<=5; i++){ //행
			for(int j=1; j<=i; j++)
				System.out.print("* "); //<-*을 넣어보면 자리를 알 수 있음
			System.out.println(" ");
		}
	}
}