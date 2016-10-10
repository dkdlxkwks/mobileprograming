import java.util.Scanner;

public class BinarySearch {
	void Search(int num, int i[]){
		int low = 0;
		int high = 9;
		int count = 0;
		
		for(;;){
			
			int num1 = (low+high)/2;
			
			if(i[num1] == num){
				count++;
				System.out.print("데이터위치:");
				System.out.println(num1);
				System.out.println("Search 횟수:"+count);
				break;
			}
			
			else if(i[num1] > num){
				high = num1-1;
				count++;
			}
			
			else if(i[num1] < num){
				low = num1+1;
				count++;
			}
		}
	}
	
	public static void main(String[] args) {
		int num=0;
		System.out.print("0~9 값을 입력하세요:");
		Scanner a = new Scanner(System.in);
		
		num = a.nextInt();
		
		int b[] = new int[10];
		for(int i=0; i<10; i++){
			b[i] = i;
		}
		
		BinarySearch s = new BinarySearch();
		s.Search(num,b);
	}
}
