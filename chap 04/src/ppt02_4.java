import java.util.Scanner;

//Switch���� ����Ͽ� �ڵ�
public class ppt02_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		
		switch (score/10) {
		case 10:
			System.out.println("A����Դϴ�.");
			break;
		case 9:
			System.out.println("A����Դϴ�.");
			break;
		case 8:
			System.out.println("B����Դϴ�.");
			break;
		case 7:
			System.out.println("C����Դϴ�.");
			break;
		case 6:
			System.out.println("D��� �Դϴ�.");
			break;
		}
		
	}

}
