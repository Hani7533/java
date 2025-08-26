public class letter_I {
    public static void main(String[] args) 
    {
        
        System.out.println("Enter any number: ");
        display9 obj2 = new display9();
        obj2.i();
    }
}

class display9{
    void i(){
        int n=5;
        for(int r=1; r<=n; r++){
            for(int c=1; c<=5; c++){
                if(r==1 ||r==5 || c==4){
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
//  *  *  *  *  * 
//        *   
//        *   
//        *   
//  *  *  *  *  * 
