public class letter_O {
    public static void main(String[] args) 
    {
        System.out.println("Enter any number: ");
        display15 obj1 = new display15();
        obj1.o();
    }
}
class display15
{
    void o(){         
        for(int r=1; r<=5; r++){
            for(int c=1; c<=5; c++){
                if(r == 1  & c >=2 &  c <= 4 || c == 1 & r >= 2 & r <= 4 || c == 5 & r >= 2 & r <= 4 || r == 5  & c >=2 &  c <= 4){
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
//     *  *  *    
//  *           * 
//  *           * 
//  *           * 
//     *  *  *    