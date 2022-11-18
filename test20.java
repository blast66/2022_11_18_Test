public class test20 {
    public static void main(String[] args) { 
        for(int i = 1; i<=14; i++){
			
            for(int z=1; z<=12;z++){
                if(i>7){
                    if(z<7  ){
                        if(z<=i-7){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");	
                        }
                        
                    }
                    if(z>=6){
                        if(z<6+i){
                            System.out.print("*");	
                        }
                        else{

                            System.out.print(" ");
                        }
                    }
                    }
                
                
            }
        
            System.out.println();
        }
    }
}