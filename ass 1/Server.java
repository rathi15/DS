import java.net.*;
import java.rmi.*;

public class Server{
		public static void main(String[] args){
				try{
						ServerImplementation serverImplementation = new ServerImplementation();
						Naming.rebind("Server", serverImplementation);

						System.out.println("Server Started");
				}catch(Exception e){
						System.out.println("Exeption Occured At Server!" + e.getMessage());
				}
		}
}
