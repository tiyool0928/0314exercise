import java.util.Scanner;
//for������ �ڵ�
public class ppt04_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int sum = 1;
		
		for (int i=1; i<= number; i++) {
			sum=sum*i;
			System.out.println(+sum);
		}
		System.out.println("�Է��� ������ factorial����:" +sum);
	}

}
