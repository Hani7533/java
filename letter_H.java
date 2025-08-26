public class letter_H 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter any number: ");
        display8 obj1 = new display8();
        obj1.h();
    }
}
class display8{
    void h(){
        for(int r = 1; r <= 5; r++)
        {
            for(int c = 1;c <=5; c++)
            {
                if (c==1 || c==5 || r==3) 
                {
                   System.out.print(" * ");
                }
                else
                   System.out.print("   ");
            }
            System.out.println();
        }
    }  
}

// Enter any number: 
//  *           * 
//  *           * 
//  *  *  *  *  * 
//  *           * 
//  *           * 