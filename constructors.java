class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 0;
        name = "Your-Name-Here";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class constructors {
    public static void main(String[] args) {
        //MyMainEmployee harish = new MyMainEmployee("ProgrammingWithharish", 12);
        MyMainEmployee harish = new MyMainEmployee();
        //harry.setName("CodeWithharish");
        //harry.setId(34);
        System.out.println(harish.getId());
        System.out.println(harish.getName());
    }
}
