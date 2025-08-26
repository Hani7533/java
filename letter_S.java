public class letter_S {
    public static void main(String[] args) 
    {
        System.out.println("Enter any number: ");
        display19 obj1 = new display19();
        obj1.s();
    }
}
class display19
{
    void s(){
        for(int r=1; r<=5; r++){
            for(int c=1; c<=5; c++){
                if(r == 1  || r == 5 || r == 3 || c == 1 & r <= 3 || c == 5 & r >= 3){
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
//              * 
//  *  *  *  *  * 