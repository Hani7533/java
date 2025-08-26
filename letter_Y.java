public class letter_Y {
    public static void main(String[] args) 
    {
        System.out.println("Enter any number: ");
        display25 obj1 = new display25();
        obj1.y();
    }
}
class display25
{
    void y(){         
        for(int r=1; r<=5; r++){
            for(int c=1; c<=5; c++){
                if(r == c & r <= 3 || c == 3 & r > 3 || r + c == 6 & r <= 3){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
         }
    }
}

// Enter any number: 
//  *        * 
//    *    *   
//      *     
//      *     
//      *     
