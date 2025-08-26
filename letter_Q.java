public class letter_Q {
    public static void main(String[] args) 
    {
        System.out.println("Enter any number: ");
        display17 obj1 = new display17();
        obj1.q();
    }
}
class display17
{
    void q(){
         
        for(int r=1; r<=6; r++){
            for(int c=1; c<=6; c++){
                if(r == 1 & c <= 5 || r == 5 & c <= 5 || c == 1 & r <= 5 || c == 5 & r <= 5 || r == c & r >= 3){
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
//  *     *     *    
//  *        *  *    
//  *  *  *  *  *    
//                 * 