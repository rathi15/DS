import java.rmi.*;
import java.util.Scanner;

public class Client{
		public static void main(String[] args){
				Scanner in = new Scanner(System.in);
				try{
						String serverURL = "rmi://localhost/Server";
						ServerInterface serverInterface = (ServerInterface)Naming.lookup(serverURL);
						// serverInterface is the reference of interface since we cannot create it's object

						System.out.print("Enter the First Number:" );
						double num1 = in.nextDouble();

						System.out.print("Enter the Sencond Number:" );
						double num2 = in.nextDouble();

						System.out.println("--------- Result ---------");
						System.out.println("Addition is:" + serverInterface.Addition(num1,num2));
						System.out.println("Substraction is:" + serverInterface.Subtraction(num1,num2));
						System.out.println("Multiplication is:" + serverInterface.Multiplication(num1,num2));
						System.out.println("Division is:" + serverInterface.Division(num1,num2));						
				}catch(Exception e){
						System.out.println("Exeption Occured At Client!" + e.getMessage());
				}
		}
}

