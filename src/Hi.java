import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Hi {
    public void hiEnglish() {
        System.out.println("Hello");
    }

    public void hiChinese() {
        System.out.println("ni hao");
    }

    public void sayHi(String methodName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = this.getClass().getMethod(methodName, null);
        method.invoke(this,null);
    }
}
