public class letter_V {
    public static void main(String[] args) 
    {
        System.out.println("Enter any number: ");
        display22 obj1 = new display22();
        obj1.v();
    }
}
class display22
{
    void v(){         
        for(int r=1; r<=5; r++){
            for(int c=1; c<=9; c++){
                if(r == c || c+ r == 10){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
         }
    }
}

// Enter any number: 
//  *                * 
//    *            *   
//      *        *     
//        *    *       
//          *