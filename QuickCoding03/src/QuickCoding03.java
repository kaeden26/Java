import java.util.Scanner;
public class QuickCoding03 {
	public static void main(String[] args){

		
		
	Scanner scan =  new Scanner(System.in);
	
	String a,b;
	System.out.println("a: ");
	a= scan.nextLine();
	System.out.println("b: ");
	b= scan.nextLine();
	
	
	try{
		int temp_a = Integer.parseInt(a);
		int temp_b = Integer.parseInt(b);
	System.out.println(Num(temp_a, temp_b));
	}
	catch(ArithmeticException ae){
		System.out.println("0으로 나눌 수 없습니다.");
	}
	
	catch(NumberFormatException nfe){
		System.out.println("숫자를 입력하세요");
	}
	catch(IllegalArgumentException i){
		System.out.println("세자리 미안의 숫자를 입력하세요.");
	}
	scan.close();
	}
	public static int Num(int temp_a, int temp_b) throws IllegalArgumentException{
		if(temp_a>99 || temp_b>99)
			throw new IllegalArgumentException();
		int result= temp_a/temp_b;
		return result;
	}
}
