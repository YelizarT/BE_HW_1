public class ExtractDigits {
    public static void main(String[] args) {
        int number = 345;
        int digit1 = number % 10;
        number = number / 10;
        int digit2 = number % 10;
        number = number / 10;
        int digit3 = number;

        System.out.print("number 345 -> " );
        System.out.print(digit3 + ", ");
        System.out.print(digit2 + ", ");
        System.out.print(digit1);


    }
}
