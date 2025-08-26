public class letter_T {
    public static void main(String[] args) 
    {
        System.out.println("Enter any number: ");
        display20 obj1 = new display20();
        obj1.t();
    }
}
class display20
{
    void t(){         
        for(int r=1; r<=5; r++){
            for(int c=1; c<=5; c++){
                if(r == 1  || c == 3 ){
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
//        *       
//        *       
//        *       
//        *       
