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
		System.out.println("0���� ���� �� �����ϴ�.");
	}
	
	catch(NumberFormatException nfe){
		System.out.println("���ڸ� �Է��ϼ���");
	}
	catch(IllegalArgumentException i){
		System.out.println("���ڸ� �̾��� ���ڸ� �Է��ϼ���.");
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
