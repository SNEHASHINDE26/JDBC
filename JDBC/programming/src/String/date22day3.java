package String;

public class date22day3 {

	public static void main(String[] args) {
		
//Pro 1 :
		
//   	String str="1This 3programming 2is 4batch.";
//
//   	String []arr=str.split(" ");
//   	
//   	for(int i=0;i<arr.length;i++) {
//	   for(int j=i+1;j<arr.length;j++) {
//        
//		   if(arr[i].charAt(0)>arr[j].charAt(0)) {
//			   String temp=arr[i];
//			   arr[i]=arr[j];
//			   arr[j]=temp;
//		   }
//		
//	   }
//   	}
//   	String output="";
//   	for(int i=0;i<arr.length;i++) {
//   		output=output+arr[i].substring(1)+" ";
//   	}
//	  System.out.println(output.trim()); 
	  
	 
//Pro 2 :
		
		
		String str="JA3VA";
//		String str="J1AVA";

		
		char temp=0;
		String s1="";
		char[]ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=48 && ch[i]<=57) {
		
				temp=ch[i];
				s1=s1+temp;
			}
		}
		String output=str.replace(s1,"");
//		System.out.println(output);
	    System.out.println(temp+output);
		
		
		
   	} 
}
