package Array;

public class EvenOdd {
  
	public static void main(String[]args) {
		
		int marks[]= {10,20,30,40,50,60};
		int evensum=0;
		int oddsum=0;
		
		for(int i=0;i<marks.length;i++) {
			if(i%2==0) {
				evensum+=marks[i];
			}else {
				oddsum+=marks[i];
			}
		}
	}
}
