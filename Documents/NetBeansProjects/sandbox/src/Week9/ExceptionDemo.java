package Week9;

public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            if (args.length != 3) {
                throw new IllegalArgumentException("Please enter 3 numbers as a, b, and c respectively.");
            }
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);

            double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

            System.out.println("x1: " + x1 + "\nx2: " + x2);
        } catch (NumberFormatException e) {
            System.out.println("Please input data in number format only.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
