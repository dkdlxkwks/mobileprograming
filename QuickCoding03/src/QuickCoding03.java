import java.util.Scanner;

public class QuickCoding03 {
	
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      OverNum on = new OverNum();
      
      System.out.print("1번째 숫자를 입력하세요:");
      String num1 = sc.next();
      System.out.print("2번째 숫자를 입력하세요:");
      String num2 = sc.next();
      
      try{
         System.out.print("두수의 나눗셈은 ");
         on.over(Integer.parseInt(num1), Integer.parseInt(num2));
         System.out.println(Integer.parseInt(num1)/Integer.parseInt(num2));
      }
      catch(ArithmeticException ae){
         System.out.println("0으로 나눗셈을 할 수 없습니다.");
      }
      catch(IllegalArgumentException ae){
         System.out.println("문자를 입력하셨습니다.");
      }
      catch(Exception e){
    	  e.printStackTrace();
      }
   }
}