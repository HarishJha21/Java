public class breakAndContinue {
    public static void main(String[] args) {
        // Break and continue using loops!
       for (int i=0;i<49;i++){
           System.out.println(i);
           System.out.println("Java is great");
           if(i==3){
               System.out.println("Ending the loop");
               break;
           }
       }
           int i=0;
       do{
           System.out.println(i);
           System.out.println("Java is great");
           if(i==3){
               System.out.println("Ending the loop");
               break;
           }
           i++;
       }while(i<4);
       System.out.println("Loop ends here");


           for(int k=0;k<49;k++){
           if(k==3){
               System.out.println("Ending the loop");
               continue;
           }
               System.out.println(k);
               System.out.println("Java is great");
       }
         i=0;
        do{
            i++;
            if(i==3){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");

        }while(i<4);
        System.out.println("Loop ends here");
    }
}

