public class letter_W {
    public static void main(String[] args) 
    {
        System.out.println("Enter any number: ");
        display23 obj1 = new display23();
        obj1.w();    
    }
}
class display23
{
    void w(){         
        for(int r=1; r<=5; r++){
            for(int c=1; c<=5; c++){
                if(c == 1 || c == 5 || r == c & r > 2 || r == 4 & c == 2){
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
//  *     *     * 
//  *  *     *  * 
//  *           * 
