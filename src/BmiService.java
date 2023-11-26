public class BmiService {
    public float calculate(double weight, double height) {
        int index;

        index = (int) (weight / (height*height));

        return (int) index;
        }
    }

