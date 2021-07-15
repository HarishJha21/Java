class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }

    public int getsalary(){
        return salary;
    } 
}
public class custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee anshuman = new Employee(); //Instantiating a new Employee object
        Employee john = new Employee(); //Instantiating a new Employee object

        
        // Setting Attributes for anshuman
        anshuman.id=13;
        anshuman.salary=37;
        anshuman.name="CodewithHarry";

        // Setting Attributes for john
        john.id=69;
        john.salary=43;
        john.name="John chaurasiya";

        //Printing the Attributes
        anshuman.printdetails();
        john.printdetails();
        int salary = john.getsalary();
        System.out.println(salary);
        //System.out.println(anshuman.id);
        //System.out.println(anshuman.name);
    }
}
