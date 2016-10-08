
public class BinarySearch{

	public static boolean contains(int[] arr, int target){
		
		int low = 0;
		int high = arr.length-1;

		while(low <= high){
			int mid=(low+high)/2;
			if(arr[mid] == target){
				return true;
			}
			else if(target < arr[mid]){
				high = mid-1;
			}
			else			
				low = mid + 1;
		}
		return false;
	}
	public static void main(String[] args){
		int[] a = {4, 6, 7, 9, 10, 13, 18, 21};

		System.out.println(contains(a, 0));

	}
}