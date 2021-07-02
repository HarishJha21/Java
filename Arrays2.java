public class Arrays2 {
    public static void main(String[] args) {

        // float [] marks = {99.6f, 57.3f, 69.7f, 100.0f, 97.9f};
        // String [] students = {"Harish","Meet", "Shashi", "Anshuman"};
        // System.out.println(students.length);
        // System.out.println(students[0]);

        int [] marks = {99, 57, 69, 100, 97};
        // System.out.println(marks.length);

        // Displaying the Array (Naive way)
        System.out.println("Printing using naive method");
         System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]); 
        
        // Displaying the Array (For loop)
        System.out.println("Printing using for loop");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        
        // Quick Quiz: Displaying the Array in Reverse order (For loop)
        System.out.println("Printing using for loop in reverse order");
        for(int i=marks.length -1;i>=0;i--){
                System.out.println(marks[i]);
        }

        // Displaying the Array (For-each loop)
        System.out.println("Printing using for-each loop");
        for(int element: marks){
            System.out.println(element);
        }
    }
}
