package Array;

public class date14 {

	public static void main(String[] args) {
		
		//find out missing number.
		
//		int[]arr= {6,7,5,9};
//		int sum=0,temp=0,min=arr[0],max=0;
//		for(int i=0;i<arr.length;i++) {
//		if(arr[i]<min) {
//			min=arr[i];
//			
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//			sum+=arr[i];
//		    }
//		    for(int i =min;i<=max;i++) {
//		 		temp +=i;
//			}
//				System.out.println("missing no : "+(temp-sum));
//			}
		
		
		//remove the element from an array.
		
		int[]arr= {6,7,5,9,3};
		int num=7,pos=0;
		boolean status=false;
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]){
				pos=i;
				status=true;
			}
		}
		if(status) {
			for(int i=pos+1;i<arr.length;i++) {
				arr[i-1]=arr[i];
			}
		}else {
			System.out.println("Element is not present in an array");
		}
		System.out.println("After removing");
		for(int i=0;i<arr.length-1;i++) {
			System.out.println(" "+arr[i]);
			
		}
		
	}

}
 








