public class letter_P {
    public static void main(String[] args) 
    {
        System.out.println("Enter any number: ");
        display16 obj1 = new display16();
        obj1.p();
    }
}
class display16
{
    void p(){         
        for(int r=1; r<=5; r++){
            for(int c=1; c<=5; c++){
                if(c == 1  || r == 1 || c == 5 & r <=3 || r ==3 & c <= 4){
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
//  *           * 
//  *  *  *  *  * 
//  *
//  *
