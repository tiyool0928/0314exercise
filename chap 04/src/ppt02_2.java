import java.util.Scanner;

//if else ���� ����Ͽ� �ڵ�
public class ppt02_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		
		if(score>=90) {
			System.out.println("A��� �Դϴ�.");
		} else if(score>=80) {
			System.out.println("B��� �Դϴ�.");
		} else if(score>=70) {
			System.out.println("C��� �Դϴ�.");
		} else if(score>=60) {
			System.out.println("D��� �Դϴ�.");
		}
	}

}
