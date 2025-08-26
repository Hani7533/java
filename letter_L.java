public class letter_L {
    public static void main(String[] args) 
    {
        System.out.println("Enter any number: ");
        display12 obj1 = new display12();
        obj1.l();
    }
}
class display12
{
    void l()
    {
        for(int r=1; r<=5; r++){
            for(int c=1; c<=5; c++){
                if( r == 5 || c == 1 ){
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
//  *
//  *
//  *
//  *
//  *  *  *  *  * 
