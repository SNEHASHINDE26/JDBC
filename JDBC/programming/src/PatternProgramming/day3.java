package PatternProgramming;

public class day3 {
	public static void main(String[]args) {

		
//P1:
		
//		int y=5;
//		for(int i=1;i<=5;i++) {
//		   int no=y-i+1;
//			for(int j=1;j<=5;j++) {
//				System.out.print(no+"\t");
//				no+=5;
//			}
//			System.out.println();
//		}
		
		
//P2 :
		
//		int y=5;
//		for(int i=1;i<=5;i++) {
//		   int x=i;
//		   int no=y-i+1;
//			for(int j=1;j<=5;j++) {
//				if(j%2==1) {
//				System.out.print(x+"\t");
//				
//			}else {
//			System.out.print(no+"\t");
//		}
//				x+=5;
//				no+=5;
//			}
//				System.out.println();
//	    }
		
		

//P3:
		
//		int y=5;
//		for(int i=1;i<=5;i++) {
//		   int x=i;
//		   int no=y-i+1;
//			for(int j=1;j<=5;j++) {
//				if(j%2==0) {
//				System.out.print(x+"\t");
//				
//			}else {
//			System.out.print(no+"\t");
//		}
//				x+=5;
//				no+=5;
//			}
//				System.out.println();
//	    }
		
//P4:
		
//		int row=5;
//		int col=5;
//		for(int i=1;i<=row;i++){
//			for(int j=1;j<=col;j++){
//				if(i==3 || j==3 )
//				  System.out.print("0"+"\t");
//			else 
//					System.out.print("*"+"\t");
//			}
//		
//		System.out.println();
//
//       }
		

//P5:
		
//		int row=4;
//		int col=4;
//		for(int i=1;i<=row;i++){
//			for(int j=1;j<=col;j++){
//				if(i==j || i+j==3 || i+j==7 )
//				  System.out.print("*"+"\t");
//			else 
//					System.out.print("0"+"\t");
//			}
//		
//		System.out.println();
//
//		}
		
//P6:
		
//		int row=5;
//		int col=5;
//		int no=2;
//		    for(int i=1;i<=row;i++){
//			for(int j=1;j<=col;j++){
//				
//			System.out.print(no+"\t");		  
//		}
//		System.out.println();
//           if(i<3) {
//        	   no--;
//           }else {
//        	   no++;
//           }
//		}
		
		
//P7:
		
		
//		int row=4;
//		int col=5;
//		
//	    for(int i=1;i<=row;i++){
//             int no=2;
//		for(int j=1;j<=col;j++){
//				
//			System.out.print(no+"\t");		  
//            if(j<3) {
//        	   no--;
//           }else {
//        	   no++;
//           }
//		    }
//		System.out.println();
//	    }
		
		
//P8:
		
//		int row=5;
//		int col=3;
//		
//	    for(int i=1;i<=row;i++){   
//		for(int j=1;j<=col;j++){
//				
//			System.out.print(j+"\t* "+"\t");		  
//		}    
//		System.out.println();
//	    }
			
//P9:
		
//		int row=5;
//		int col=5;
//		
//	    for(int i=1;i<=row;i++){   
//		for(int j=1;j<=col;j++){
//				
//			System.out.print(j+"\t* "+"\t");		  
//		}    
//		System.out.println();
//	    }
	    
	    
//P10 :
	    
//	    int row=5;
//	    int col=5;
//	    
//	    for(int i=1;i<=row;i++) {
//	    	int no =i;
//	    for(int j=1;j<=col;j++) {
//	    	System.out.print(no+"\t" );
//	    	no++;
//	    }
//	    System.out.println( );
//	    }
	    
	    
//P11 :
	    
	    
	    int row=5;
	    int col=5;
	    
	    int x=1;
	    for(int i=1;i<=row;i++) {
	    	int no =x;
	    for(int j=1;j<=col;j++) {
	    	System.out.print(no+"\t" );
	    	no+=2;
	    }
	    System.out.println( );
	    x+=2;
	    } 
	}	    
}
