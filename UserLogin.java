import java.util.Scanner;

public class UserLogin {

    public static void main(String[] args){

        String password, userName;

        Scanner inp = new Scanner(System.in);
        
        System.out.println("Please login your username : ");
        userName = inp.nextLine();

        System.out.println("Please login your password : ");
        password = inp.nextLine();
        
        if (userName.equals("Patika") && password.equals("patika123") ) {
            System.out.println("Logins success");
        }
        else{
            System.out.println("Your password or username is wrong\nDo you want to set up new password?\nIf you want, type in yes");
            String answer = inp.nextLine();

            if (answer.equals("yes")) {
                System.out.println("Your new password can't be same the old one and the wrong one");
                
                String password1 = inp.nextLine();

                if (password1.equals("patika123") || password1.equals(password)) {
                    
                    System.out.println("Your new password can't be same with the old one or the wrong one\nSystem is out now");
            
                }
                else{
                    System.out.println("New password is setted up");
                }

                
            }
            
        }

    }
    
}
