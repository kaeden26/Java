
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {7,4,3,9,8,2,1};
		for(int a=0; a<A.length-1;a++){
			
			for(int b=0; b<A.length-1-a;b++){
				if(A[b]>A[b+1]){
					int c = A[b];
					A[b]=A[b+1];
					A[b+1]=c;
					
				}
			}
			
		}
		for(int a=0; a<A.length;a++){
			System.out.println(A[a]+"");
			
		}
		
	}

}
