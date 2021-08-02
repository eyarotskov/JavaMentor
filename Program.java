import java.util.Scanner;
import java.util.regex.MatchResult;

public class Program {

    public static void main(String[] args) {
        String number1;
        String number2;

        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] splittedString = input.split(" ");
        if (splittedString.length == 3){
            number1 = splittedString[0];
            number2 = splittedString[2];
            try {
                if (!splittedString[1].equals("+")) {
                    if (!splittedString[1].equals("-")) {
                        if (!splittedString[1].equals("*")) {
                            if (!splittedString[1].equals("/")) {
                                System.out.println("Неправильное выражение");
                        }
                    }
                }
            }
                if (number1.matches("\\d+") || number2.matches("\\d+")) {
                    ;
                    if (Integer.parseInt(number1) <=10 && Integer.parseInt(number2) <=10) {
                        Program.Arabic(number1, number2, splittedString[1]);
                    }
                    if (Integer.parseInt(number1) >10 && Integer.parseInt(number2) > 10)
                        System.out.println("Необходимо ввести цифры или число 10");
                }
                if (number1.equals("I") || number1.equals("II") || number1.equals("III") || number1.equals("IV") || number1.equals("V") || number1.equals("VI") || number1.equals("VII") || number1.equals("VIII") || number1.equals("IX") || number1.equals("X")) {
                    if (number2.equals("I") || number2.equals("II") || number2.equals("III") || number2.equals("IV") || number2.equals("V") || number2.equals("VI") || number2.equals("VII") || number2.equals("VIII") || number2.equals("IX") || number2.equals("X")) {
                        Program.Rome(number1, number2, splittedString[1]);
                }
            }
            }catch (NumberFormatException e) {
                System.out.println("Используются одновременно разные системы счисления");}}
        if (splittedString.length < 3) {
            System.out.println("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");}
        if (splittedString.length > 3) {
                System.out.println("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
    }



    public static void Arabic(String right, String left, String oper) {
        int right1 = Integer.parseInt(right);
        int left1 = Integer.parseInt(left);
                    switch (oper) {
                        case "+":
                            System.out.println(right1 + left1);
                            break;
                        case "-":
                            System.out.println(right1 - left1);
                            break;
                        case "*":
                            System.out.println(right1 * left1);
                            break;
                        case "/":
                            System.out.println(right1 / left1);
                            break;

                    }
    }

    public static void Rome(String left, String right, String oper) {
        int i = 0;
        int k = 0;
        int result = 0;
        String a = "";
        if (left.equals("I"))
            i = 1;
        if (left.equals("II"))
            i = 2;
        if (left.equals("III"))
            i = 3;
        if (left.equals("IV"))
            i = 4;
        if (left.equals("V"))
            i = 5;
        if (left.equals("VI"))
            i = 6;
        if (left.equals("VII"))
            i = 7;
        if (left.equals("VIII"))
            i = 8;
        if (left.equals("IX"))
            i = 9;
        if (left.equals("X"))
            i = 10;
        if (right.equals("I"))
            k = 1;
        if (right.equals("II"))
            k = 2;
        if (right.equals("III"))
            k = 3;
        if (right.equals("IV"))
            k = 4;
        if (right.equals("V"))
            k = 5;
        if (right.equals("VI"))
            k = 6;
        if (right.equals("VII"))
            k = 7;
        if (right.equals("VII"))
            k = 8;
        if (right.equals("IX"))
            k = 9;
        if (right.equals("X"))
            k = 10;
        if (oper.equals("+"))
            result = i + k;
        if (oper.equals("-"))
            result = i - k;
        if (oper.equals("*"))
            result = i * k;
        if (oper.equals("/"))
            result = i / k;
        String stringresult = Integer.toString(result);
        a = Program.RometoArabic(stringresult);
        System.out.println(a);

    }

    public static String RometoArabic(String n) {
        int number = Integer.parseInt(n);
        /*System.out.println("Integer: " + number);*/
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        if (number < 0){
            System.out.println("В римском исчислении нет отрицательных чисел");}
        if (number >= 0){
            for(int i=0;i<values.length;i++) {
                while(number >= values[i]) {
                    number -= values[i];
                    roman.append(romanLiterals[i]);}
            }
        }
        return(roman.toString());
    }
}