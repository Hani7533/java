public class letter_M {
    public static void main(String[] args) 
    {
        System.out.println("Enter any number: ");
        display13 obj1 = new display13();
        obj1.m();
    }
}
class display13
{
    void m(){
         
        for(int r=1; r<=5; r++){
            for(int c=1; c<=5; c++){
                if( c == 1 || c == 5 || r == 2 & c == 2 || r == 2 & c > 3 || r == 3 & c == 3){
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
//  *  *     *  * 
//  *     *     * 
//  *           * 
//  *           * 
