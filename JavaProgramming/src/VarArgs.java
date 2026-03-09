import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1, 5, 7, 4, 6, 2, 88, 5, 45, 1, 6, 2, 5, 5, 22, 2, 544, 21, 14);
        multiple(2, 5, "chaitanya","King","I am the best");
    }


    static void multiple(int a, int b, String... s) {
        System.out.println("Integers: " + a + ", " + b);


        System.out.print("Strings: ");
        for (String str : s) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    static void fun(int... v) {
        int sum = 0;
        for (int i : v) {
            sum += i;
        }
        System.out.println(Arrays.toString(v));
        System.out.println("The sum is: " + sum);
    }
}
