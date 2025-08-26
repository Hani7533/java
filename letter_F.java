public class letter_F {
    public static void main(String[] args) 
    {
        System.out.println("Enter any number: ");
        display6 obj1 = new display6();
        obj1.f();
    }
}

class display6
{
    void f()
    {     
        for(int r=1; r<=5; r++){
            for(int c=1; c<=5; c++){
                if(r == 1 || c == 1 || r == 3 & c<= 4){
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
//  *
//  *  *  *  *    
//  *
//  *
