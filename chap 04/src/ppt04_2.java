import java.util.Scanner;

//while������ �ڵ�
public class ppt04_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int i = 1;
		int sum = 1;
		
		while(i<=number) {
			sum *= i;
			i++;
			System.out.println(sum);
		}

		System.out.println("�Է��� ���� factorial��:" +sum);
	}
	
}
