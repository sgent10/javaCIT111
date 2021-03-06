package components.comp3_objects.oop1_javadonuts;


public class Donut {
    
    // member variables
    private int percRemaining = 100;
    public String name;
    
    // "member" method to model the donut getting eaten
    public void simulateEating(int percentEaten){
        percRemaining = percRemaining - percentEaten;
    } // close method
    
    // accessor method for the private member variable
    public int getPercRemaining(){
        return percRemaining;
    } // close method
    
} // close class



