package bank;

public class User
{



    private String __UserName;
    private String __Password;
    private String __FullName ;
    private String __phoneNumber;
    private String __email;

    User(String UserName, String Password, String FullName, String phoneNumber, String email)
    {

        __UserName = UserName;
        __FullName = FullName;

        if (checkPassword(Password)){
        __Password = Password;}

        if (checkPhoneNumber(phoneNumber)){
        __phoneNumber = phoneNumber;}

        if (checkEmail(email)){
        __email = email;}
    }



    public boolean checkUserName(String UserName)
    {
        return __UserName.equals(UserName); //later
    }

    public boolean checkPassword(String Password)
    {
    String special_char = "@!&$?";

        if(Password.length()<8){
            System.out.println("Password too short");}

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasSpecial = false;
        boolean hasDigit = false;

            for (int i = 0; i<Password.length(); i++){
                char c = Password.charAt(i);

                if(Character.isUpperCase(c)){ hasUpper = true;}
                else if(Character.isLowerCase(c)){ hasLower = true;}
                else if(Character.isDigit(c)){ hasDigit = true;}
                else if(special_char.indexOf(c) != -1){
                    hasSpecial = true;
                }
            }
        if(hasUpper && hasLower && hasDigit && hasSpecial){
            return true;
        }

        System.out.println("Password is not valid");
        return false;
    }




    public boolean checkEmail(String email)
    {
        if(!email.endsWith("@aut.ac.ir")){
        System.out.println("Invalid Email");
        }

        if (!email.contains("@")){
            System.out.println("Invalid Email");
        }

        if(email.startsWith("") || email.startsWith(".")){
            System.out.println("Invalid Email");
        }


        return true;
    }

    public boolean checkPhoneNumber(String phoneNumber)
    {
        // phone number validation
        if (!phoneNumber.startsWith("09"))
        {
            System.out.println("Invalid Phone Number");
        }
        if (phoneNumber.length()!=11){
            System.out.println("Invalid Phone Number");
        }
        for (int i = 0 ; i <phoneNumber.length(); i++){
            char c = phoneNumber.charAt(i);
            if (!Character.isDigit(c))
            {
                System.out.println("Invalid Phone Number");
            }

        }
        return true;
    }

    public void AllIsOK(){
        if(checkUserName(__UserName) && checkPassword(__Password) && checkPhoneNumber(__phoneNumber)){
            System.out.println("Account "+__UserName+ " Created Successfully");
        }
    }









    public String get__email() {
        return __email;
    }
    public void set__email(String __email) {}
    /// ////
    public String get__FullName() {
        return __FullName;
    }
    public void set__FullName(String __FullName) {}
    /// ///
    public String get__phoneNumber() {
        return __phoneNumber;
    }
    public void set__phoneNumber(String __phoneNumber) {}
    /// ///
    public String get__UserName() {
        return __UserName;
    }
    public void set__UserName(String __UserName) {}
    /// ///
    public String get__Password() {
        return __Password;

    }
    public void set__Password(String __Password) {
        this.__Password = __Password;
    }


}
