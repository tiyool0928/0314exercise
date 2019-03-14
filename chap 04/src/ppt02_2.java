import java.util.Scanner;

//if else 문을 사용하여 코딩
public class ppt02_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		
		if(score>=90) {
			System.out.println("A등급 입니다.");
		} else if(score>=80) {
			System.out.println("B등급 입니다.");
		} else if(score>=70) {
			System.out.println("C등급 입니다.");
		} else if(score>=60) {
			System.out.println("D등급 입니다.");
		}
	}

}
