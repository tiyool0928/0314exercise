import java.util.Scanner;

//if문만 사용하여서 코딩
public class ppt02_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int score=in.nextInt();
		
		if (score>=90) {
			System.out.println("A등급");
		}
		if ((score>=80)&(score<90)) {
			System.out.println("B등급");
		}
		if ((score>=70)&(score<80)) {
			System.out.println("C등급");
		}
		if ((score>=60)&(score<70)) {
			System.out.println("D등급");
		}
	}

}
