package singleton;

public class Test {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstance();
        SingletonLazy.mensagem();

        SingletonLazy IsEqual = SingletonLazy.getInstance();
        System.out.println(lazy == IsEqual);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager == SingletonLazy.lazy);

        SingletonEager eager2 = SingletonEager.getInstance();

        System.out.println(lazy);
        System.out.println(eager);
        System.out.println(eager2);
        System.out.println(eager == eager2);;


    }


}
