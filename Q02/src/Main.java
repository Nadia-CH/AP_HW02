
import bank.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        String UserName;
        String Password;
        String FullName;
        String PhoneNumber;
        String Email;


        Scanner input = new Scanner(System.in);



            String[] cmnd = new String[7];
            cmnd[0] = "Register";
            cmnd[1] = "Login";

            cmnd[2] = "Show Balance";
            cmnd[3] = "Deposit";
            cmnd[4] = "Withdraw";
            cmnd[5] = "Transfer";
            cmnd[6] = "Logout";


            System.out.print("Register | Login");
            String Command = input.next();
            if (Command.equals("Register")) {
                System.out.print("Enter UserName| Password | FullName | PhoneNumber | Email");
                String info = input.nextLine();
                String[] infoArray = info.split(" ");

                // User u1 = new User(infoArray[0],infoArray[1],infoArray[2],infoArray[3],infoArray[4]);

            } else if (Command.equals("Login")) {
                System.out.print("Enter UserName| Password ");
                String info = input.nextLine();
            } else {
                System.out.println("Invalid Command");

            }


        }
    }

