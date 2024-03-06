package demo;

public class Main {
    
    public static void main(String[] args) {
        
        Staff doctor = new Doctor();
        Staff nurse = new Nurse();
        
        doctor.work();
        nurse.work();
    }
}