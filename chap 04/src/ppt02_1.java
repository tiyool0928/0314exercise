import java.util.Scanner;

//if���� ����Ͽ��� �ڵ�
public class ppt02_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int score=in.nextInt();
		
		if (score>=90) {
			System.out.println("A���");
		}
		if ((score>=80)&(score<90)) {
			System.out.println("B���");
		}
		if ((score>=70)&(score<80)) {
			System.out.println("C���");
		}
		if ((score>=60)&(score<70)) {
			System.out.println("D���");
		}
	}

}
