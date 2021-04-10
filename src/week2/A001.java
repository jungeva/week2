package week2;

public class A001 {
	public static void main(String[] args) {
		/*아래의 코드는 사과를 담는데 필요한 바구니의수를 구하는 코드이다.
		 * 하나의 바구니에는 10개의 사과를 담을 수 있고 사과의 수는 123이다
		 * 필요한 바구니의 수를 구하여라*/
		
		int apples = 123;  // 사과의 수
		int sizeOfBasket = 10;  // 하나의 바구니에 들어가는 사과의 수 = 10
		// 몫 + (나머지가 있으면 1로 아니면 0으로 ) - 조건식 ? 참 : 거짓
		int numberOfBasket = apples / sizeOfBasket + ( apples % sizeOfBasket > 0 ? 1 : 0 );
		
		System.out.println("필요한 바구니의 수 :" + numberOfBasket);
		
		
		//(결과) 필요한 바구니의 수 :13
	}

}
