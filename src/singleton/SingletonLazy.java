package singleton;

public class SingletonLazy  {
    public static SingletonEager lazy;
    private static SingletonLazy instance;

    private SingletonLazy() {
        super();
    }

    //metodo que expoe de maneira publica
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

    public static void mensagem() {
        System.out.println("Hello  from Singleton!");
    }
}
