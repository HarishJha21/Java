public class Arrays {
    public static void main(String[] args) {
    // There are three main ways to create array in Java
    // 1. Declaration and memory allocation
    // int [] marks = new int[5];

    // 2. Declaration and then memory allocation
    // int [] marks;
    // marks = new int[5];

    // Initialization
    // marks[0] = 100;
    // marks[1] = 69;
    // marks[2] = 74;
    // marks[3] = 99;
    // marks[4] = 88;

    // 3. Declaration, memory allocation and then initialization together
    int [] marks = {100, 69, 74, 99, 88};
    System.out.println(marks[4]);
    }
}