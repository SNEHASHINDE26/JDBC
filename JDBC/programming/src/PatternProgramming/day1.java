package PatternProgramming;

public class day1 {

	public static void main(String[] args) {
		
//program 1
		
//		int row=5;
//		int col=5;
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print("* ");
//			}
//		
//		System.out.println();
//
//	}

		
//program 2
		
//		int row=5;
//		int col=5;
//		for(int i=1;i<=row;i++){
//			for(int j=1;j<=col;j++){
//				if(i==1 || j==1|| i==5 || j==5 )
//				  System.out.print("* ");
//			else 
//					System.out.print("  ");
//			}
//		
//		System.out.println();
//
//	}
		
//		program 3
		
		int row=5;
		int col=5;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++){
				if(i==1 || j==1|| i==5 || j==5 ||i==j)

		System.out.print("* ");
		else 
				System.out.print("  ");
			}		
		System.out.println();

	}	
		
	
//program 4( incomplete)

//		int row=5;
//		int col=5;
//		for(int i=1;i<=row;i++){
//			for(int j=1;j<=col;j++){
//				if(i==1 || j==1|| i==5 || j==5 ||i==j)
//
//		System.out.print(" ");
//		else 
//				System.out.print("  ");
//			}		
//		System.out.println();
//
//	}	
		
		
//		program 5
	
//		for(int i=1;i<=5;i++){
//			for(int j=1;j<=5;j++){
//				if(i==3 || j==3)
//
//		System.out.print("* ");
//		else 
//				System.out.print("  ");
//			}		
//		System.out.println();
//
//	}	

}
}