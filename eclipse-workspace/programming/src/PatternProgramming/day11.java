package PatternProgramming;

public class day11 {

	public static void main(String[] args) {
		
//pro 72 :
		
//		  int star=5;
//		 int row=5;
//		 int space=0;
//		 
//		 for(int i=1;i<=row;i++ ) {
//			 
//			 for(int k=1;k<=space;k++) {
//				  System.out.print("  ");
//			 }
//			 for(int j=1;j<=star;j++) {
//				 System.out.print("* ");
//			 }
//		 System.out.println();
//		star--;
//		space++;
//		 }

		
//pro 73 :
		
//		  int row=5;
//		 int star=5;
//		 int space=0;
//		 
//		 for(int i=1;i<=row;i++ ) {
//			 
//			 for(int k=1;k<=space;k++) {
//				  System.out.print("  ");
//			 }
//			 for(int j=1;j<=star;j++) {
//				 if(i==1||j==1|| i+j==6)
//				 System.out.print("* ");
//				 else
//					 System.out.print("  ");
//			 }
//		 System.out.println();
//		star--;
//		space++;
//		 }	
		
//pro 74 :
	      
//		int row=5;
//		 int star=5;
//		 int space=0;
//		 char ch='A';
//		 
//		 for(int i=1;i<=row;i++ ) {
//			 
//			 for(int k=1;k<=space;k++) {
//				  System.out.print("  ");
//			 }
//			 for(int j=1;j<=star;j++) {
//				 if(i==1||j==1|| i+j==6)
//				 System.out.print(star+" ");
//				 else
//					 System.out.print(ch+" ");
//			 }
//			 if(i>1)
//				ch++;
//		      System.out.println();
//		     star--;
//		     space++;
//		 }	
      
		
//pro 75 :
	
//	 int row=5;
//	 int star=5;
//     int space=0;
//     char ch='E';
//
//for(int i=1;i<=row;i++ ) {
//	 
//	 for(int k=1;k<=space;k++) {
//		  System.out.print("  ");
//	 }
//	 for(int j=1;j<=star;j++) {
//		 if(i==1||j==1|| i+j==6)
//		 System.out.print(star+" ");
//		 else
//			 System.out.print(ch+" ");
//	 }
//	 if(i>1)
//		ch++;
//     System.out.println();
//    star--;
//    space++;
//}
		
		
//pro 76 :
		
//		 int row=5;
//		 int star=5;
//	     int space=0;
//	     int no=5;
//	    int diff=4;
//
//	for(int i=1;i<=row;i++ ) {
//		int temp=no;
//		int d=diff;
//	
//		  for(int k=1;k<=space;k++) {
//			  System.out.print(" \t");
//		 }
//		 for(int j=1;j<=star;j++) {
//			 System.out.print(temp+" \t");
//			 temp+=d;
//			 d--;
//		 }
//	     System.out.println();
//	     no+=diff;
//	     diff--;
//	    star--;
//	    space++;
//	}
		
//pro 77 :
	
//		 int row=5;
//		 int star=5;
//	     int space=0;
//	     int no=5;
//	    int diff=4;
//
//	for(int i=1;i<=row;i++ ) {
//
//	
//		  for(int k=1;k<=space;k++) {
//			  System.out.print(" \t");
//		 }
//		 for(int j=1;j<=star;j++) {
//			 System.out.print(no+" \t");
//			 
//		 }
//	     System.out.println();
//	     no+=diff;
//	     diff--;
//	    star--;
//	    space++;
//	}
	
		
//pro 78 :
		
//		 int row=9;
//		 int star=3;
//	     int space=0;
//	     
//	for(int i=1;i<=row;i++ ) {
//
//	
//		  for(int k=1;k<=space;k++) {
//			  System.out.print(" ");
//		 }
//		 for(int j=1;j<=star;j++) {
//			 System.out.print("* ");
//			 
//		 }
//	     System.out.println();
//	     if(i<5)
//	    space++;
//	     else
//	    	 space--;
//	}
		
//pro 79 :
	
//	 int row=9;
//	 int star=3;
//    int space=0;
//    
//for(int i=1;i<=row;i++ ) {
//
//
//	  for(int k=1;k<=space;k++) {
//		  System.out.print(" ");
//	 }
//	 for(int j=1;j<=star;j++) {
//		 System.out.print("* ");
//		 
//	 }
//    System.out.println();
//    if(i<5)
//   space++;
//    else
//   	 space--;
//}
		
//pro 80 :
		
//		 int row=9;
//		 int star=1;
//	     int space=5;
//	     
//	for(int i=1;i<=row;i++ ) {
//       for(int k=1;k<=space;k++) {
//			  System.out.print("  ");
//		 }
//		 for(int j=1;j<=star;j++) {
//			 System.out.print("* ");
//			 
//		 }
//	     System.out.println();
//	     if(i<5) {
//	    star++;
//	    space--;
//	}
//	else {
//		space++;
//		star--;
//	}
//	}
		
//pro 81 :
		
		 int row=9;
		 int star=1;
	     int space=5;
	     
	for(int i=1;i<=row;i++ ) {
      for(int k=1;k<=space;k++) {
			  System.out.print("  ");
		 }
		 for(int j=1;j<=star;j++) {
			 if(j==1 || i==j || i+j==10 ) {
		 
			 System.out.print("* ");
			 }
			 else {
				 System.out.print("  ");
			 }
		 }
	     System.out.println();
	     if(i<5) {
	    star++;
	    space--;
	}
	else {
		space++;
		star--;
	}
		 }
	}

}
