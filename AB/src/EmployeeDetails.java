import java.util.Scanner;

public class EmployeeDetails {
public static void main(String arg[])
{
	System.out.println("-----MENU-----");
	System.out.println("1.Enter Data");
	System.out.println("2.Update Data");
	System.out.println("3.Display Data");
	System.out.println("4.Exit");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter ur option:");
	int o=sc.nextInt();
	switch(o)
	{
	case 1:
		System.out.println("Please enter ur Data");
		break;
	case 2:
		System.out.println("Updating the data...");
		break;
	case 3:
		System.out.println("Displaying the data..");
		break;
	case 4:
		System.out.println("Ur Exit the Application");
		break;
	}
}
}
