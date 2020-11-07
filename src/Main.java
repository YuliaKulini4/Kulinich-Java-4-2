public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 65.5;
        double height = 1.64;

        double BMI = service.calculate(weight, height);
        System.out.printf("%8.1f", BMI);


    }
}
