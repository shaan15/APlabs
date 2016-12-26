import java.util.Scanner;

public class FindFactorial{
void fa(int a){
	int b,c,next;
	b = 1;
	c = 1;
	while(b<=a){

		next = b + c;
		System.out.println(b);
		b = c;
		c = next;
	}
}
	public static void main(String[] args){
		//System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		FindFactorial obj = new FindFactorial();
		obj.fa(i);
	}
	
}

