public class letter_X {
    public static void main(String[] args) 
    {
        System.out.println("Enter any number: ");
        display24 obj1 = new display24();
        obj1.x();
    }
}
class display24
{
    void x(){         
        for(int r=1; r<=5; r++){
            for(int c=1; c<=5; c++){
                if(r == c || r + c == 6){
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
//  *        * 
//    *    *   
//      *     
//    *    *   
//  *        * 