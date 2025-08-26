public class letter_E {
    public static void main(String[] args) 
    {
        System.out.println("Enter any number: ");
        display5 obj1 = new display5();
        obj1.e();
        
    }
}

class display5
{
    void e()
    {     
        for(int r=1; r<=5; r++){
            for(int c=1; c<=5; c++){
                if(r == 1  || r == 5 || c == 1 || r == 3){
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
//  *  *  *  *  * 
//  *
//  *  *  *  *  * 