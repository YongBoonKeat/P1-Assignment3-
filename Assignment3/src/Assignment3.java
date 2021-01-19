import java.util.Scanner;

public class Assignment3 {

		static String name; 
		static String gender;
		static String ic;
		static int age;
		static String marital;
		static String citizen;
		static String work;
		static int salary;
		static int choice;
		static int housingloan;
		static float changers;
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			ReceiveInformation();
			printToH();
			printFinalform();
			
		}
		public static void ReceiveInformation() {
			Scanner input = new Scanner (System.in);
		do {
			System.out.println("Enter your name: ");
			name=input.nextLine();
		
			System.out.println("Enter your gender: ");
			gender=input.nextLine();
		
			System.out.println("Enter your IC: ");
			ic=input.nextLine();
			
			System.out.println("Enter your age:");
			age=input.nextInt();
			
			System.out.println("Enter your marital:");
			marital=input.next();
		
			System.out.println("Enter your citizen:");
			citizen=input.next();
		
			System.out.println("Enter your work:");
			work=input.next();
			{
			System.out.println("Enter your salary: ");
			salary=input.nextInt();
			if(salary<2000) {
				System.out.println("Your salary is not met the condition ");	
			}
			else if (age<21||age>60) {
				System.out.println("Your age is not met the condition ");
			}
			else {
				System.out.println(" ");
			}
			}
		} while (salary<2000 || age<21 || age>60 );
		 
		}

		public static void printToH() {
			Scanner input = new Scanner (System.in);
			
			String banglo[] = {"Banglo","Maximum housing loan = RM500000","Payment limited: 10years ","Changers: 3% "};
			String condo[] = {"Condo","Maximum housing loan = RM200000","Payment limited: 3years ","Changers: 2% "};
			String hometown[] = {"Hometown","Maximum housing loan = RM400000","Payment limited: 5years ","Changers: 3% "};
			System.out.println("===================");
			System.out.println("== Type of house ==");
			System.out.println("===================");
			System.out.println("1: Banglo ");
			System.out.println("2: Condo ");
			System.out.println("3: Hometown ");
			System.out.println("Please enter your choice: ");
			choice = input.nextInt();
			if(choice==1) {
				Choices(banglo);
				System.out.println("Enter your Housingloan: ");
				housingloan=input.nextInt();
				changers = (housingloan*3/100);
			}
		    else if(choice==2) {
		    	Choices(condo);
				System.out.println("Enter your Housingloan: ");
				housingloan=input.nextInt();
				changers = (housingloan*2/100);
		    }
		    else if(choice==3) {
		    	Choices(hometown);
				System.out.println("Enter your Housingloan: ");
				housingloan=input.nextInt();
				changers = (housingloan*3/100);
		    }
		    else {
		    	 System.out.print("Invalid number !!!");
		}
		}
		public static void Choices(String []z) {
			int j=0;
			while (j<z.length) {
				System.out.println(z[j]);
				j++;
			}
		}
		public static void printFinalform() { 
			System.out.println("");
			System.out.println("=================");
			System.out.println("== INFORMATION ==");
			System.out.println("=================");
			System.out.println("");
			System.out.println("Name: " + name);
			System.out.println("");
			System.out.println("Gender: " + gender);
			System.out.println("");
			System.out.println("IC: " + ic);
			System.out.println("");
			System.out.println("Age: " + age);
			System.out.println("");
			System.out.println("Marital: " + marital);
			System.out.println("");
			System.out.println("Citizen: " + citizen);
			System.out.println("");
			System.out.println("Work: " + work);
			System.out.println("");
			System.out.println("Salary: RM" + salary);
			System.out.println("");
			System.out.println("Housingloan: RM" + housingloan);
			System.out.println("");
			
			String banglo[] = {"Banglo","Maximum housing loan = RM500000","Payment limited: 10 years ","Changers: 3% "};
			String condo[] = {"Condo","Maximum housing loan = RM200000","Payment limited: 3 years ","Changers: 2% "};
			String hometown[] = {"Hometown","Maximum housing loan = RM400000","Payment limited: 5 years ","Changers: 3% "};
			if(choice==1) {
				System.out.println(banglo[0]);
				System.out.println(banglo[1]);
				System.out.println(banglo[2]);
				System.out.println(banglo[3]);
				System.out.println("Total Changers = RM" + changers );
				System.out.println("Total ammount = RM" + (housingloan+changers) );
				
			}
		    else if(choice==2) {
		    	System.out.println(condo[0]);
		    	System.out.println(condo[1]);
		    	System.out.println(condo[2]);
		    	System.out.println(condo[3]);
				System.out.println("Total Changers = RM "+ changers);
				System.out.println("Total ammount = RM" + (housingloan+changers) );
		    }
		    else {
		    	System.out.println(hometown[0]);
		    	System.out.println(hometown[1]);
		    	System.out.println(hometown[2]);
		    	System.out.println(hometown[3]);
				System.out.println("Total Changers = RM"+changers);
				System.out.println("Total ammount = RM" + (housingloan+changers) );
		    }
		  }
		
	}

