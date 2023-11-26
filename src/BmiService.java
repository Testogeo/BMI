public class BmiService {
    public float calculate(double weight, double height) {
        int index;

        index = (int) (weight / Math.pow (height, 2));

        return (int) index;
    }
}

