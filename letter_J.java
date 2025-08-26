public class letter_J {
    public static void main(String[] args) 
    {
        System.out.println("Enter any number: ");
        display10 obj1 = new display10();
        obj1.j();
    }
}
class display10
{
    void j()
    {      
        for(int r=1; r<=5; r++){
            for(int c=1; c<=5; c++){
                if(r == 1 || c == 4 || r == 5 & c <= 4 || r == 4 & c == 1){
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
//           *    
//  *        *    
//  *  *  *  *    
