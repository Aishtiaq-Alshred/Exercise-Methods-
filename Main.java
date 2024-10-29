import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//sol-1
    public static void smallest(){
        Scanner input=new Scanner(System.in);
        System.out.print("nput the first number: ");
        double  num1=input.nextInt();
        System.out.print("nput the Second number: ");
        double num2=input.nextInt();
        System.out.print("nput the third number: ");
        double num3=input.nextInt();
        if(num1<num2 &&num1<num3){
            System.out.println("The smallest value is "+num1);
        } else if (num2<num1 &&num2<num3){
            System.out.println("The smallest value is "+num2);
        }else System.out.println("The smallest value is "+num3);

    }

//sol-2
    public static int check(int number){
        if(number>0){
            System.out.println("the number is positive "+number);
        } else if (number<0) {
            System.out.println("the number is negative "+number);
        } else System.out.println("the number is zero "+number);
        return number;
    }

     //sol-3
    //اعتقد فيه خطأ لان كلمة المرور الموجوده بالملف ماتنطبق عليها الشرط الاول اقل من 10 حروف abcd1234
    public static void validPassword() {
        Scanner input = new Scanner(System.in);
        System.out.println("1. A password must have at least eight characters.\n" +"2. A password consists of only letters and digits.\n" +  "3. A password must contain at least two digits   ");

        System.out.println("Input a password (You are agreeing to the above Terms and \n" +
                "Conditions.):  ");
        String pass = input.nextLine();


        if (pass.length() >= 10) {
            int digitCount = 0;

            for (char c : pass.toCharArray()) {

                if (Character.isDigit(c)) {
                    digitCount++;
                }
            }

            if (digitCount >= 2 && pass.matches("[a-zA-Z0-9]+")) {
                System.out.println("Password is valid: " + pass);
            } else {
                System.out.println("Password must contain at least two digits and only letters and digits.");
            }
        } else {
            System.out.println("Password must be at least 10 characters long.");
        }
    }




    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        smallest();
        check(5);
        validPassword();
    }
}