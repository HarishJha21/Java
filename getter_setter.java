class MyEmployee{
    private int id;
    private String name;

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
public class getter_setter {
    public static void main(String[] args) {
        MyEmployee harish = new MyEmployee();
        // harish.id =  47;
        // harish.name = "CodeWithHarry"; --> Throws an error due to private access modifier
        harish.setName("CodeWithHarry");
        System.out.println(harish.getName());
        harry.setId(233);
        System.out.println(harish.getId());
    }
}
