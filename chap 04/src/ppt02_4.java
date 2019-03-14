import java.util.Scanner;

//Switch문을 사용하여 코딩
public class ppt02_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		
		switch (score/10) {
		case 10:
			System.out.println("A등급입니다.");
			break;
		case 9:
			System.out.println("A등급입니다.");
			break;
		case 8:
			System.out.println("B등급입니다.");
			break;
		case 7:
			System.out.println("C등급입니다.");
			break;
		case 6:
			System.out.println("D등급 입니다.");
			break;
		}
		
	}

}
