public class Shadowing {
    static int x = 21; // this will be shadowed at line 7 by the x variable on line 6

    public static void main(String[] args) {
        System.out.println(x); // 21
        int x = 20; // the class variable at line 2 is shadowed by this
        System.out.println(x); //20
        fun();
    }

    static void fun(){
        System.out.println("This is very amazing at age of " + x + "!..");
    }
}
