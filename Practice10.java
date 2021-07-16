class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callfriend(){
        System.out.println("Calling Manish...");
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
    
public class Practice10 {
    public static void main(String[] args) {
        //Problem 1: 
        Employee Harish = new Employee();
        Harish.setName("CodeWithHarish");
        Harish.salary = 239;
        System.out.println(Harish.getSalary()); 
        System.out.println(Harish.getName()); 
        
        // Problem 2:
        // Cellphone apple = new Cellphone();
        // apple.callfriend();
        // apple.vibrate();
        // apple.ring();

        // Problem 3:
        Square sq = new Square();
        sq.side = 7;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        // Problem 5:
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();
    }
}
