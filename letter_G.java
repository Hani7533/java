public class letter_G {
    public static void main(String[] args) 
    {
        System.out.println("Enter any number: ");
        display7 obj1 = new display7();
        obj1.g();
    }
}

class display7
{
    void g()
    {     
        for(int r=1; r<=5; r++){
            for(int c=1; c<=5; c++){
                if(r == 1  || c == 1 || r == 3 & c > 2 || r == 4 & c == 5 || r == 5){
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
//  *     *  *  * 
//  *           * 
//  *  *  *  *  * 
