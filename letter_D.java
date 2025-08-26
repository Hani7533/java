public class letter_D {
    public static void main(String[] args) 
    {
        System.out.println("Enter any number: ");
        display4 obj1 = new display4();
        obj1.d();
        }
    }

class display4
{
    void d()
    {
         for(int r=1; r<=5; r++){
            for(int c=1; c<=5; c++){
                if(r == 1 & c <=4 || (r >=2 & r <=4) & c== 5 || c == 1 || (r == 5 & c <= 4)){
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
//  *  *  *  *    
//  *           * 
//  *           * 
//  *           * 
//  *  *  *  *    
