import java.util.Scanner;
public class Pr2 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
        
        int A,B;
        
        A=sc.nextInt();
        B=sc.nextInt();
        
        if(A>B) System.out.print('>');
        else if(A<B) System.out.print('<');
        else System.out.print("==");
    }
}