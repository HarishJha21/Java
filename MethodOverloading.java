public class MethodOverloading {
    static void foo(){
        System.out.println("Good Morning brother!");
    }

    static void foo(int a){
        System.out.println("Good morning " + a + " brother!");
    }

    static void foo(int a, int b){
        System.out.println("Good morning " + a + " brother!");
        System.out.println("Good morning " + b + " brother!");
    }

    static void foo(int a, int b, int c){
        System.out.println("Good morning " + a + " brother!");
        System.out.println("Good morning " + b + " brother!"); 
    }

    static void change(int a){
        a = 98;
    }

    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void tellJoke(){
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }

    public static void main(String[] args) {
        // tellJoke();

        // Case 1: Changing the Integer
        //int x = 45;
        //change(x);
        //System.out.println("The value of x after running change is: " + x);

        // Case 2: Changing the Array
        // int [] marks = {52, 73, 77, 89, 98, 94};
        // change2(marks);
        // System.out.println("The value of x after running change is: " + marks[0]);

        // Method Overloading
        foo();
        foo(30);
        foo(69, 699);
        // Arguments are actual!
    }
}
