import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare the variables
        String userName, password, newPassword;
        int choice = 0;
        //Take inputs from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your username :");
        userName = input.nextLine();
        System.out.print("Please enter your password: ");
        password = input.nextLine();
        //Check if username and password are correct
        if (userName.equals("patika") && password.equals("patika123")){
            System.out.print("Logged in!");
        }else {
            System.out.println("Login failed! Would you like to reset your password?");
            System.out.print("1-Yes\n" + "2-No\n");
            choice = input.nextInt();
            if (choice==1){
                System.out.print("Please enter a new password :");
                newPassword = input.nextLine();
                input.nextLine();
                if (newPassword == password){
                    System.out.print("Password could not be created, please enter another password.");
                }else{
                    System.out.print("Password updated successfully!");
                }
            }
            else {
                System.out.print("Then you have to remember your password ;)");
            }
        }
    }
}