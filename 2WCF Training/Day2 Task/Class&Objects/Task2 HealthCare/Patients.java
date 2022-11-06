import java.util.Scanner;
public class Patients 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        double weight = sc.nextDouble();
        double height = sc.nextDouble();
        Patient patient = new Patient(name,weight,height);
        System.out.println(patient.calculateBMI(weight,height));
    }    
}
