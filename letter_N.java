public class letter_N {
    public static void main(String[] args) 
    {
        System.out.println("Enter any number: ");
        display14 obj1 = new display14();
        obj1.n();
    }
}
class display14{
    void n(){
         int n=5;
         for(int r=1; r<=n; r++){
            for(int c=1; c<=n; c++){
                if(c==1 || c==5 || c==r){
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
//  *           * 
//  *  *        * 
//  *     *     * 
//  *        *  * 
//  *           * 