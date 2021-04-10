package week2;

public class A005 {

	public static void main(String[] args) {
		/*화씨(fahrenheit)를 섭씨(celcius)로 변환하는 코드이다. 
		 * 변화공식이 'C = 5/9 ×(F - 32)'이다.
		 * 단, 변환 결과값은 소수점 셋째자리에서 반올림해야한다.*/
		
		int fahrenheit = 100; // 화씨
		float celcius = (int)((5/9f * (fahrenheit - 32))*100 + 0.5) / 100f;
		
		System.out.println("fahrenheit : " + fahrenheit);
		System.out.println("celcius : " + celcius);
		
		/* 5/9는 이기 때문에 두 피연산자 중 어느 한 쪽을 반드시 float나 double로 해야만 
		 * 실수형태 의 결과를 얻을 수 있다. 그래서 정수형 리터럴인 9대신 float타입의 리터럴인 9f를 사용
		 * 하였다. 소수점 셋째자리에서 반올림을 하려면 다음의 과정을 거쳐야한다. */
		
		//(결과) fahrenheit : 100, celcius : 37.78

	}

}
