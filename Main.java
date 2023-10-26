import java.util.Scanner;
class MyNumber {
    private int value;
    public MyNumber() {
        this.value = 0;
    }
    public MyNumber(int value) {
        this.value = value;
    }
    public boolean isNegative() {
        return value < 0;
    }
    public boolean isPositive() {
        return value > 0;
    }
    public boolean isZero() {
        return value == 0;
    }
    public boolean isOdd() {
        return value % 2 != 0;
    }
    public boolean isEven() {
        return value % 2 == 0;
    }
}
public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputValue = sc.nextInt();
        MyNumber myNumber = new MyNumber(inputValue);
        System.out.println("Number is negative: " + myNumber.isNegative());
        System.out.println("Number is positive: " + myNumber.isPositive());
        System.out.println("Number is zero: " + myNumber.isZero());
        System.out.println("Number is odd: " + myNumber.isOdd());
        System.out.println("Number is even: " + myNumber.isEven());
    }
}

