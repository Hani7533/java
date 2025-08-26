public class letter_Z {
    public static void main(String[] args) 
    {
        System.out.println("Enter any number: ");
        display26 obj1 = new display26();
        obj1.z();
    }
}
class display26
{
    void z(){        
        for(int r=1; r<=5; r++){
            for(int c=1; c<=5; c++){
                if(r == 1 || r == 5 || r + c == 6){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
         }
    }
}

// Enter any number: 
//  *  *  *  *  * 
//           *    
//        *       
//     *
//  *  *  *  *  * 