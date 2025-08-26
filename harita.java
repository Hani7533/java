public class harita
{
    public static void main(String[] args) 
    {
        
        System.out.println("Enter any number: ");
       

        name2 obj1 = new name2();
        obj1.h();
        obj1.a();
        obj1.r();
        obj1.i();
        obj1.t();
        obj1.a1();
        
    }
    
}

class name2
{
    void h()
    {
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
    System.out.println();
}

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
    System.out.println();
}

void t(){
         
    for(int r=1; r<=5; r++){
        for(int c=1; c<=5; c++){
            if(r == 1  || c == 3 ){
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
}