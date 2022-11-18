public class test20 {
    public static void main(String[] args) { 
       int a = 6;
       int b = 6;

       for(int i = 1; i <10 ; i++){


           for(int c = 1; c <= 11; c++){
               if(c >= a && c <= b){
                   System.out.print(" ");
               }
               else{
                   System.out.print("*");
               }
               
           }
            if(i < 5){
                a = a-1;
                b = b+1;
            }
            else{
                a = a+1;
                b = b-1;
            }
           System.out.println();
       }
    }
}