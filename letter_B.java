public class letter_B {
    public static void main(String[] args) 
    {
        System.out.println("Enter any number: ");
        display2 obj1 = new display2();
        obj1.b();
        }
}

class display2
{
    void b(){
         for(int r=1; r<=5; r++){
            for(int c=1; c<=5; c++){
                // if(r == 1 || r ==3 || r == 5 || c == 1 || c == 5){
                if(r == 1 & c <=4 || (r >=2 & r <=4) & c== 5 || c == 1 || (r == 5 & c <= 4) || r == 3 ){
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
//  *  *  *  *    
//  *           * 
//  *  *  *  *  * 
//  *           * 
//  *  *  *  *    