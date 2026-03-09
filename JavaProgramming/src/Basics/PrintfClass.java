package Basics;

public class PrintfClass {
    public static void main(String[] args) {

        // printf() = is a method used to format output
        // %[flags][width][.precision][specifier-character]

        // [specifier - character]
//        String name = "Chaitanya";
//        char firstLetter = 'C';
//        int age = 22;
//        double height = 5.6;
//        boolean isEmployed = true;
//
//        System.out.printf("Hello %s\n", name);
//        System.out.printf("Your name start with a %c\n", firstLetter);
//        System.out.printf("Your age is a %d\n", age);
//        System.out.printf("Your height is a %.1f\n", height);
//        System.out.printf("Your are Employed(True/False) %b\n", isEmployed);
//
//        System.out.printf("%s is %d years old", name, age);

        // [.precision]
//        double price1 = 9.99;
//        double price2 = 100.155;
//        double price3 = -54.45;
//
//        System.out.printf("%.1f\n", price1);
//        System.out.printf("%.1f\n", price2);
//        System.out.printf("%.1f\n", price3);

        // [flags]

//        + --> output a plus
//        , --> comma grouping are enclose in ()
//        ( --> negative numbers are enclosed in ()
//        space = display a minus if negative, space if positive

//        double price1 = 9.99;
//        double price2 = 100.155;
//        double price3 = -54.45;
//
//        System.out.printf("%+.1f\n", price1);
//        System.out.printf("%,.1f\n", price2);
//        System.out.printf("%(.1f\n", price3);
//        System.out.printf("% .1f\n", price3);

        //[width]

//        0 = zero padding
//        number = right justified padding
//        negative number = left justified padding

        int id1 = 1;
        int id2 = 24;
        int id3 = 524;
        int id4 = 7524;

        System.out.printf("%04d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%04d\n", id4);
        System.out.printf("%4d\n", id4);
        System.out.printf("%-4d\n", id4);
    }
}
