public class manan {
    public static void main(String[] args) 
    {
        
        System.out.println("Enter any number: ");
       

        name1 obj1 = new name1();
        obj1.m();
        obj1.a();
        obj1.n();
        obj1.a1();
        obj1.n1();
        
    }
}

class name1
{
    void m(){
         
        for(int r=1; r<=5; r++){
            for(int c=1; c<=5; c++){
                if( c == 1 || c == 5 || r == 2 & c == 2 || r == 2 & c > 3 || r == 3 & c == 3){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
         }
         System.out.println();
    }

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
        System.out.println();
   }   
   
   void n()
   {
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
    System.out.println();
   }

   void a1(){
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
    System.out.println();
}   

void n1()
{
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
 System.out.println();
}

}


