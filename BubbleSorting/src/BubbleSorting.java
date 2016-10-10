
public class BubbleSorting {
	void sorting(int a[]){
		int save = 0;
		
		for(int j=0; j<5; j++){
			for(int i=0; i<5; i++ ){
				if(a[i] > a[i+1]){
					save = a[i+1];
					a[i+1] = a[i];
					a[i] = save;
				}
			}
		}
		
		for(int i=0; i<6; i++){
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		int a[] = new int[6];
		a[0]=32;
		a[1]=20;
		a[2]=-2;
		a[3]=42;
		a[4]=21;
		a[5]=12;
		
		BubbleSorting b = new BubbleSorting();
		b.sorting(a);
	}
}
