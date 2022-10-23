import java.util.Scanner;

public class SafeInput {

    public static void main(String[] args) {
       String msg="";
       SafeInput.prettyHeader("how about this");
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high){
        int result = 0;
        boolean done = false;
        String trash = "";
        do
        {
            // Code and control logic to loop until validated
            System.out.print(prompt + "[" + low+ " - " + high + "]: ");
            if(pipe.hasNextInt())
            {
                result = pipe.nextInt();
                pipe.nextLine(); // clear input buffer
                if(result >= low && result <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value in range [" + low + " - " + high + "]: " + result);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an int [" + low + " - " + high + "]: " + trash);
            }

        }while(!done);

        return result;
    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high){
        double result = 0;
        boolean done = false;
        String trash= "";
        do {
            System.out.print(prompt + "[" + low+ " - " + high + "]: ");
            if(pipe.hasNextDouble())
            {
                result=pipe.nextDouble();
                pipe.nextLine();
                if(result >= low && result <= high)
                {
                    done=true;
                }
                else
                {
                    System.out.println("You must enter a double in range ["+ low + " -" + high+"]:" + result);
                }
            }
            else
            {
                trash=pipe.nextLine();
                System.out.println("You must enter a double in range[" + low + "-" + high+ "]:" + result);
            }




        }while(!done);
        return result;
    }
    public static String getRegexString(Scanner pipe, String prompt, String regExPattern)
    {
        String value = "";
        boolean gotAValue = false;
        do {
            //show the prompt
            System.out.print(prompt + ": ");
            //input the data
            value= pipe.nextLine();
            //test to see if it is correct
            if(value.matches(regExPattern))
            {
                //We have a match this string passes
                gotAValue = true;
            }
            else
            {
                System.out.println("\n invalid input: " + value);
            }

        }while (!gotAValue);
        return value;
    }
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString="";
        do {
            System.out.print("\n" +prompt+":");
            retString=pipe.nextLine();
        }while(retString.length()==0);
        return retString;
    }
   public static double getDouble(Scanner pipe, String prompt)
   {
       double result=0;
       String trash = "";
       boolean done = false;
       do {
           System.out.print("\n" + prompt+":");
           if (pipe.hasNextDouble()) {
               result = pipe.nextDouble();
               pipe.nextLine();
               done=true;
           }else
           {
               trash=pipe.nextLine();
               System.out.print("You must enter a valid double");
           }
       }while(!done);
       return result;
   }
   public static int getInt(Scanner pipe, String prompt)
   {
      int result=0;
       String trash = "";
       boolean done = false;
       do {
           System.out.print("\n" + prompt+":");
           if (pipe.hasNextInt()) {
               result = pipe.nextInt();
               pipe.nextLine();
              done = true;

           }else
           {
               trash=pipe.nextLine();
               System.out.print("You must enter a valid integer");
           }
       }while(!done);
       return result;
   }
public static boolean getYNConfirm(Scanner pipe, String prompt)
{
 String value ="";
 String trash ="";
 boolean confirm=false;
 boolean gotAValue=false;
 do {
     System.out.println(prompt+ ":");
     value=pipe.nextLine();

     if (value.equalsIgnoreCase("y")) {

         confirm = true;
     } else if (value.equalsIgnoreCase("n")) {
         confirm = false;
         break;
     } else {
         trash = pipe.nextLine();
         System.out.print("Enter either YyNn");
     }

 }while(!confirm);
    return confirm;
}
public static void prettyHeader(String msg) {
    Scanner in = new Scanner(System.in);
    int whiteSpace;


    System.out.println("Enter your message: ");
    msg = in.nextLine();

    if (msg.length() < 60) {

        for (int x = 0; x <= 60; x++) {
            System.out.print("*");
        }
        System.out.println("\n***");


        whiteSpace = (54 - (msg.length()) / 3);
        for (int x = 0; x <= whiteSpace; x++) {
            System.out.print(" ");
        }

        System.out.print(msg);

        for (int x = 0; x <= whiteSpace; x++) {
            System.out.print(" ");
        }

        System.out.print("\n***");


        for (int x = 0; x <= 20; x++) {
            System.out.print("*");
        }
        System.out.println("");

    }
}
}








