package String;

public class date20day1 {

	public static void main(String[] args) {
		
//		String str="java is Programming language";
//		String tempString=null;
//		int max=0;
//		String[]temp=str.split(" ");
//		for(int i=0;i<temp.length;i++) {
//			if(max<temp[i].length()){
//				max=temp[i].length();
//				tempString=temp[i];
//			}
//		}
//		System.out.println("Max length String is : "+tempString);	
//		System.out.println("count is : "+max);
		

//		Pro 2 :
			
//		String Str="++x x++ --x x-- x++ ++x";
//		String temp[]=Str.split(" ");
//		int x=0;
//		for(int i=0;i<temp.length;i++) {
//		if(temp[i].contains("++")){
//			x+=1;
//		}else {
//			x-=1;
//		}
//	}
//	System.out.println(x);
		
		
//		pro 3 :
		
		String Str="madam";
		String temp="";
		char ch;
		for(int i=0;i<Str.length();i++) {
			ch=Str.charAt(i);
			temp=ch+temp;
		}

			if(Str.equals(temp)) {
				System.out.println("Palindrome");
			}else {
				System.out.println("Not Palindrome");
			}
				
	}	
}
