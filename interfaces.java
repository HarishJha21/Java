interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedup(int increment);
}
interface HornBicycle{
    int a = 45;
    void blowHornk3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");       
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");        
    }
    public void speedup(int increment){
        System.out.println("Applying Speedup");
    }
    public void blowHornk3g(){
        System.out.println("Kabhi khushi kabhi gum pii pii pii pii");        
    }
    public void blowHornmhn(){
        System.out.println("Main hoon po po po po");
    }
}
public class interfaces {
    public static void main(string[] args) {
        AvonCycle cycleHarish = new AvonCycle();
        cycleHarish.applyBrake(decrement1);    
        System.out.println("cycleHarish.a");
        cycleHarish.blowHorn3g();
        cycleHarish.blowHornmhn();

    }
}