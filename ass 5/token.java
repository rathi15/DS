import java.util.Scanner;

public class TokenRing{

    public static void main(String[] args) {
        

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of nodes in ring ");
        int n = sc.nextInt();

        System.out.println("Ring is as below");
        for (int i=0;i<n;i++){
            System.out.print(i+" ");
        }
        System.out.println(0);
        int choice =0;

        do{

            System.out.print("Enter the sender ");
            int sender = sc.nextInt();

            System.out.print("Enter the Receiver ");
            int receiver = sc.nextInt();
            
            System.out.print("Enter the Data ");
            int data = sc.nextInt();


            // now token is to node 0, let's move it to the sender 
            int token = 0;
            System.out.println("Toekn passing");
            for (int i = token; i<sender; i++){
                
                System.out.print(i +" -> ");

            }
            System.out.println(sender);
            System.out.println("Sender node : "+ sender +" sending data : "+ data);

            // Now send this tocken to the receiver
            System.out.println("Data is moving from");
            for (int i =sender; i!=receiver; i=(i+1)%n){
                System.out.print(i +" -> ");
            }
            System.out.println(receiver);

            System.out.println("Data : " + data + " Received by node "+ receiver);

            // Now receiver received the data, hence given token back to sender
            token = sender;
            System.out.println("To send data enter Enter 1 else Enter 0 ");
            choice = sc.nextInt();

        }while (choice ==1 );
    }

}
