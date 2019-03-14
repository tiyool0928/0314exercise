import java.util.Scanner;

public class ppt04_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number= in.nextInt();
		int sum = 1;
		int i = 1;
		
		do {
			sum*=i;
			++i;
			System.out.println(sum);
			
		} while(i<=number);
		
		System.out.println("입력한 수의 factorial값:" +sum);
	}

}
