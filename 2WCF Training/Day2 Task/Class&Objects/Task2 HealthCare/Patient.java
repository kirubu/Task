public class Patient 
{
    String name;
    double weight,height;
    Patient(){}
    Patient(String name, double weight, double height)
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public double calculateBMI(double weight,double height)
    {
        return (weight/(height*height)*703);
    }
}
