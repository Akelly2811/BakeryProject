import java.util.Scanner;
class AccountDTO extends Account{

    public static String getName(){
        return Account.name;
    }

    public static void setName(String newName){
        Account.name = newName;
    }

    public static String getEmail(){
        return Account.email;
    }

    public static void setEmail(String newEmail){
        Account.email = newEmail;
    }

    public static String getAddress(){
        return Account.address;
    }

    public static void setAddress(String newAddress){
        Account.address = newAddress;
    }
    public static Boolean getStaffDetails(){
        return Account.is_staff;
    }

    public static String getPassword(){
        return Account.password;
    }

    public static void setPassword(String newPassword){
        Account.password = newPassword;
    } 
    
    public static String AccountDetailsToString()
    {
        String output = "Name: " + getName() + " Email: " + getEmail() + " Password: " + getPassword() + " Address: " + getAddress();
        return output;

    }

    public static boolean setAccountDetails()
    {
        boolean complete = false;
        String input;
        Scanner in = new Scanner(System.in);
        System.out.println("What details would you like to change? Name, Email, Password, Address.");
        String detail = in.nextLine().toLowerCase();
        System.out.println("Please enter the updated " + detail);
        input = in.nextLine();

        switch(detail){
            case "name":
                setName(input);
                return complete = true;
            case "address":
                setAddress(input);
                return complete = true;
            case "email":
                setEmail(input);
                return complete = true;
            case "password":
                setPassword(input);
                return complete = true;
            default:
                return complete;
            }
    }
}