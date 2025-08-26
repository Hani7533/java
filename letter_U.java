public class letter_U {
    public static void main(String[] args) 
    {
        System.out.println("Enter any number: ");
        display21 obj1 = new display21();
        obj1.u();
    }
}
class display21
{
    void u(){         
        for(int r=1; r<=5; r++){
            for(int c=1; c<=5; c++){
                if(c == 1 & r <= 4 || c == 5 & r <= 4 || r == 5 & c > 1 == c <= 4){
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
//  *           * 
//  *           * 
//  *           * 
//  *           * 
//     *  *  *    
