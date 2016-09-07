
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,3,4,5,6,7,8,9};
		int a = 6;
		int first = 0;
		int last = A.length;
		int mid;
		while (first<=last){
			mid = (first +last)/2;
			if(a==A[mid]){
				System.out.println(a+""); 
				break;
			}
			else{
				if(a<A[mid]){
					last = mid-1;
					
				}
				else{
					first = mid +1;
}
			}
		}

	}

}
