package week2;

public class A002 {

	public static void main(String[] args) {
		/*num의 값에 따라 '양수', '음수', '0'을 출력하는 코드이다.(상항 연산자  두번 사용)*/
		
		int num = 23;
		System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "0"));

	}

}
