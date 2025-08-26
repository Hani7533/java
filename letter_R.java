public class letter_R {
    public static void main(String[] args) 
    {
        System.out.println("Enter any number: ");
        display18 obj1 = new display18();
        obj1.r();
    }
}
class display18
{
    void r(){
         int k=1; 
        for(int r=1; r<=6; r++){
            for(int c=1; c<=5; c++){
                if(r == 1  || c == 5 & r <= 3 || c == 1 || r == 3 || r+ c == k){
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
//  *  *  *  *  * 
//  *           * 
//  *  *  *  *  * 
//  *     *       
//  *        *    
//  *           * 
