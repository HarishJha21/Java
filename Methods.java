public class Methods {

    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x +y) * 9;
        }
        x = 669;
        return z;
    }


    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        int c;
        // Method invocation using Object creation
        // Methods obj = new Methods();
        //c = obj.logic(a, b);
        c = logic(a, b);
        System.out.println(a + " "+ b);
        int a1 = 5;
        int b1 = 2;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
