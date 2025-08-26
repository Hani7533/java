public class letter_C {
    public static void main(String[] args) 
    {
        System.out.println("Enter any number: ");
        display3 obj1 = new display3();
        obj1.c();
        
    }
}

class display3
{
    void c(){
        for(int r=1; r<=5; r++){
            for(int c=1; c<=5; c++){
                if(r == 1  || r == 5 || c == 1){
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
//  *
//  *
//  *  *  *  *  * 
