import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CalculatorLambda {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число");
        int number1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите действие");
        System.out.println("PLUS");
        System.out.println("MINUS");
        System.out.println("TIMES");
        System.out.println("DIVISION");
        String key = reader.readLine();
        System.out.println("Введите второе число");
        int number2 = Integer.parseInt(reader.readLine());
        Action.calculate(number1, key , number2);
    }


}

