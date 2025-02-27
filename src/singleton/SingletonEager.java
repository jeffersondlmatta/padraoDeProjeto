package singleton;

import org.w3c.dom.ls.LSOutput;

public class SingletonEager  {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
        System.out.println(instance);

    }
    public static SingletonEager getInstance() {
        return instance;

    }


}
