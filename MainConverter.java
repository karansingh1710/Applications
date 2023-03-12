import java.util.InputMismatchException;
import java.util.Scanner;

//The interface contains three methods enterDetails() , calculate(), show();
interface SelectType {
    void enterDetails();
    void calculate();
    void show();
}

//This class Fahrenheit implements the interface and gives the method body
class Fahrenheit implements SelectType {
    private float temp, celcius;
    Scanner sc = new Scanner(System.in);

    public void enterDetails() {
        System.out.println("Enter the Temperature in Celcius:");
        celcius = sc.nextFloat();
    }

    public void calculate() {
        temp = celcius * (9 / 5f) + 32;
    }

    public void show() {
        System.out.println("The temperature in Fahrenheit is " + (int)temp+" degree");
    }
}

//The class Celcius also implements the interface and gives the body of methods
class Celcius implements SelectType {
    private float temp, fahrenheit;
    Scanner sc = new Scanner(System.in);

    public void enterDetails() {
        System.out.println("Enter the Temperature in fahrenheit:");
        fahrenheit = sc.nextFloat();
    }

    public void calculate() {
        temp = (fahrenheit - 32) * (5 / 9f);
    }

    public void show() {
        System.out.println("The temperature in Celcius is " + (int)temp+" degree");
    }
}

//This class is used for lose-coupling
class Call {
    public void callMethod(SelectType selectType) {
        selectType.enterDetails();
        selectType.calculate();
        selectType.show();
    }
}

//This is the Main class Where we call our all functions
public class MainConverter {

    static {
        System.out.println("\nWelcome to the Temperature Converter Application\n");
        System.out.println("Press 1. To Convert Celcius To Fahrenheit\n");
        System.out.println("Press 2. To Convert Fahrenheit To Celcius\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
//        I used try catch block for handling the exception if occur in runtime
        try {
            n = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Provided input is wrong Restart the Application:");
            System.exit(0);
        }

        Call call = new Call();

        if (n == 1) {
            SelectType celciusSelectType = new Celcius();
            call.callMethod(celciusSelectType);
        } else if (n == 2) {
            SelectType fahrenheitSelectType = new Fahrenheit();
            call.callMethod(fahrenheitSelectType);
        } else {
            System.out.println("Wrong input provided");
        }
        sc.close();
    }
}
