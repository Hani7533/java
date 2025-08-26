public class HANI {
    public static void main(String[] args) 
    {
        
        System.out.println("Enter any number: ");
       

        name obj1 = new name();
        obj1.h();
        obj1.a();
        obj1.n();
        obj1.i();
    }
}


class name
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
      

    


    void a()
    {
        for(int r=1; r<=5; r++)
        {
           for(int c=1; c<=5; c++)
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
       for(int r=1; r<=5; r++)
       {
          for(int c=1; c<=5; c++)
          {
              if(c==1 || c==5 || c==r)
               { 
                  System.out.print(" * ");
               }
               else
               {
                  System.out.print("   ");
               }
            }
            System.out.println();
        }
        System.out.println(); 
    }


    void i(){
        
        for(int r=1; r<=5; r++){
            for(int c=1; c<=5; c++){
                if(r==1 ||r==5 || c==3){
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