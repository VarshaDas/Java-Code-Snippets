public class StaticMethodDemo {
    public static void main(String[] args) {
        System.out.println("main");
        StaticMethodDemo.main(2);
    }

    public static void main(int a){
        System.out.println("overloading main");
    }

    public static void main(double a ){
        System.out.println("overloading main");
    }


    public static void main(String a ){
        System.out.println("overloading main");
    }
}
