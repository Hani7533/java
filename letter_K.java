public class letter_K {
    public static void main(String[] args) 
    {
        System.out.println("Enter any number: ");
        display11 obj1 = new display11();
        obj1.k();
    }
}
class display11
{
    void k(){
         int k = (-1);
        for(int r=1; r<=7; r++){
            for(int c=1; c<=4; c++){
                if( c == 1 || r+ c == 5 || r > 4 & (r+ c == k)){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
            k = k+2;
         }
    }
}

// Enter any number: 
//  *        * 
//  *     *    
//  *  *       
//  *
//  *  *       
//  *     *    
//  *        * 


