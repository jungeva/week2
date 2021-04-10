package week2;

public class A003 {

	public static void main(String[] args) {
		/*num의 값 중에서 백의 자리 이하를 버리는 코드이다.
		 * 만일 num의 값이 456이면 400이고 num의 값이 111이면 100이 된다.*/
		
		int num1 = 456;
		System.out.println(num1 / 100 * 100);
		
		int num2 = 111;
		System.out.println(num2 / 100 * 100);

	}

}
