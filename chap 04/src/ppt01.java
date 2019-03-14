import java.util.Scanner;

public class ppt01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		
		if(number%2 !=0) {
			System.out.println("홀수 입니다.");
		} else {
			System.out.println("짝수 입니다.");
		}
	}

}
