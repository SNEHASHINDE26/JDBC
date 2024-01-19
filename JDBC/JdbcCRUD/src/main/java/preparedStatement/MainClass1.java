package preparedStatement;

import java.util.Scanner;

 //table bike_info
 public class MainClass1{ 

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		BusinessClass2 bc = new BusinessClass2();
		
		System.out.println("1.Add Bike\n2.Get Bike by Model\n3.Get Bike by Company\n4.Get Bike by Id\n5.Get All Bike\n");
		System.out.println("Enter choice:");
		int choice=sc1.nextInt();
		
		if(choice==1) {
			System.out.println("Enter the bike model:");
			String model=sc1.next();
			System.out.println("Enter the bike company:");
			String company=sc1.next();
			System.out.println("Enter the bike price:");
			double price=sc1.nextDouble();
			
			bc.addBike(model,company,price);
		}
		
		else if(choice==2) {
			System.out.println("Enter the bike model");
			String model = sc1.next();
			bc.getBikeBymodel(model);
		}
        
		else if(choice==3) {
			System.out.println("Enter the bike company");
			String company = sc1.next();
			bc.getBikeByCompany(company);
		}
		
		else if (choice == 4) {
		    System.out.println("Enter the id:");
		    int id = sc1.nextInt();
		    bc.getBikeById(id);
		}
		
		else if(choice==5) {
			bc.getAllBikes();
		}
		
	}
}
