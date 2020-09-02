package b_operator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		//두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.
		
		Scanner sc = new Scanner(System.in);
		int num1 , num2;

		
		System.out.println("두개의 숫자를 계산해 주는 계산기 입니다.\n"+"첫번째 숫자를 적으세요>");
		num1 = Integer.parseInt(sc.nextLine());
		System.out.println("두개의 숫자를 계산해 주는 계산기 입니다.\n"+"두번째 숫자를 적으세요>");
		num2 = Integer.parseInt(sc.nextLine());
		System.out.println("계산 하고자 하는 연산을 고르세요.\n" + "(+ - / *)");
		String a = sc.nextLine();
		
		
		int cal = a.equals("+") ? num1 + num2 : 
				(a.equals("-")? num1 - num2 :
				(a.equals("*")? num1 * num2 : 
				(a.equals("/")? num1 / num2 : 0)));
	    System.out.println("계산된 값은 "+cal+"입니다.");
		
		

	}

}
