import java.util.Scanner;
//���� if���� ����Ͽ� �ڵ�
public class ppt02_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		
		if(score>=80) {
			if(score>=90) {
				System.out.println("A��� �Դϴ�.");
			} else {
				System.out.println("B��� �Դϴ�.");
			}
		} else {
			if(score>=70) {
				System.out.println("C��� �Դϴ�.");
			} else {
				System.out.println("D��� �Դϴ�.");
			}
		}
	}
}
