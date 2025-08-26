public class letter_A {
    public static void main(String[] args) 
    {
        
        System.out.println("Enter any number: ");
        display1 obj1 = new display1();
        obj1.a();
       }
}

 class display1 {
    void a(){
         int n=5;

         for(int r=1; r<=n; r++){
            
            for(int c=1; c<=n; c++)
            {
                if(c==1 || c==5 || r==1 || r==3){
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
//  *  *  *  *  *
//  *           *
//  *           *