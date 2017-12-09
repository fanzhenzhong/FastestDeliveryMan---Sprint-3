
package clockin;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;


public class ClockIn {

    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        String id = "",password = "",name = "Fan Zhen Zhong";
        int selection,chosen;
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("---------------- FASTEST DELIVERYMAN -------------------------");
        System.out.println("--------------------------------------------------------------");
        System.out.println("\n1. Clock In");
        System.out.println("2. Exit");
       
        do{ 
        System.out.print("\nPlaese select : ");
        selection = scan.nextInt(); 
        }while(selection != 1 && selection !=2);
        
       if(selection == 1)
        {
            System.out.println("\n---------------- FANTEST DELIVERYMAN CLOCK IN ----------------");
            System.out.println("--------------------------------------------------------------");
            System.out.print("Please enter your ID : ");
            id = scan.nextLine(); 
        }
//        else if(selection == 2)
//        {
//            System.exit(0);
//        }
//
//       if(id.equals("3434") && password.equals("1111"))
//       {
//           System.out.println("\n-----------CLOCK IN STATUS----------");
//           System.out.println("----------------------------------------");
//           System.out.println("\nDATE   TIME    ID    NAME");
//           System.out.println(dateFormat.format(date) + id + name);
//       }

       
        
   
        
        
        
    }
    
   
    
}
