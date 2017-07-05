import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Hi hi = new Hi();
        hi.sayHi("hiEnglish");
        hi.sayHi("hiChinese");
    }
}
