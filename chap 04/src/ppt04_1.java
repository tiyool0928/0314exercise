import java.util.Scanner;
//for문으로 코딩
public class ppt04_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int sum = 1;
		
		for (int i=1; i<= number; i++) {
			sum=sum*i;
			System.out.println(+sum);
		}
		System.out.println("입력한 숫자의 factorial값은:" +sum);
	}

}
