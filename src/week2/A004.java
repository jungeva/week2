package week2;

public class A004 {

	public static void main(String[] args) {
		/*num의 값보다 크면서도 가장 가까운10의 배수에서 변수 num의 값을 뺀 나머지의 구하는 코드이다.
		 * 예를 들어 num이 24라면 가장 가까운 10의 배수는 30이고 30-24=6을 구하는 코드*/
		
		int num = 24;
		System.out.println(10 - num % 10);

	}

}
