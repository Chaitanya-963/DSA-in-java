public class FunctionOverloading {
    // Function Overloading : When two or more function having the same name but having a different argument then that is known are the function overloading
    public static void main(String[] args) {
    fun(5);
    fun("Pencils");
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String s) {
        System.out.println(s);
    }
}
