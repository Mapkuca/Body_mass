public class BmiService {
    public double calculate(double index, double height){
        double weight;
        double bmi = index / (height * height);
        return bmi;
    }
}
