public class Practice9 {
    static void multiplication(int n){
        for (int i=1;i<=10;i++){
            System.out.format("%d X %d = %d\n", n, i, n*i);
        }
    }
    static void pattern1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern1_rec(int n){
        if(n>0){
            pattern1_rec(n-1);
            for(int i=0; i<n; i++){
                System.out.print("*");
            }
            System.out.println();
        }        
    }

    // sum(n) = 1 + 2 + 3... + n
    // sum(n) = 1 + 2 + 3... + n-1 + n
    // sum(n) = sum(n-1) + n
    static int sumRec(int n){
        // Base condition
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }

    static int fib(int n){
        // if(n==1){
        //     return 0;
        // }
        // else if(n==2){
        //     return 1;
        // }
        if (n==1 || n==2){
            return n-1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {
        // Problem 1: 
        //multiplication(19);

        // Problem 2:
        //pattern1(7);

        // Problem 3:
        //int c = sumRec(5);
        //System.out.println(c);

        // Problem 5:
        // fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        //int result = fib(8);
        //System.out.println(result); 

        // Problem 8:
        pattern1_rec(9);
        
    }
}
