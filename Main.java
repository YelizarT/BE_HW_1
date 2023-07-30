import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        // primitive data type:
        char letter = 'G';
        int number = 89;
        byte number1 = 4;
        short number2 = 56;
        float number3 = 4.7333436F;
        double number4 = 4.355453532;
        long number5 = 12121;
        boolean data = true;

        // none primitive data type:
        String text = "hasta la vista";
        int[] intArray = {1, 2, 3, 4};
        Character newLetter = 'G';
        Integer newNumber = 89;
        Byte newNumber1 = 4;
        Short newNumber2 = 56;
        Float newNumber3 = 4.7333436F;
        Double newNumber4 = 4.355453532;
        Long newNumber5 = 12121L;
        Boolean newData = true;
        {
            System.out.println("primitive data type: ");
            System.out.println("char: " + letter);
            System.out.println("int: " + number);
            System.out.println("byte: " + number1);
            System.out.println("short: " + number2);
            System.out.println("float: " + number3);
            System.out.println("double: " + number4);
            System.out.println("long: " + number5);
            System.out.println("boolean: " + data);
            System.out.println();
            System.out.println("none primitive data type: ");
            System.out.println("String: " + text);
            for (int i = 0; i < intArray.length; i ++) {
                System.out.println("intArray: " + intArray[i]);
            }
            System.out.println("Character: " + newLetter);
            System.out.println("Integer: " + newNumber);
            System.out.println("Byte: " + newNumber1);
            System.out.println("Short: " + newNumber2);
            System.out.println("Float: " + newNumber3);
            System.out.println("Double: " + newNumber4);
            System.out.println("Long: " + newNumber5);
            System.out.println("Boolean: " + newData);

        }


        }
    }