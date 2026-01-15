import java.lang.reflect.Method;

public class ReflectionMain {
    public static void main(String[] args) throws Exception {
        Service service = new Service();

        for (Method m : service.getClass().getDeclaredMethods()) {
            if (m.isAnnotationPresent(DeveloperInfo.class)) {
                DeveloperInfo info = m.getAnnotation(DeveloperInfo.class);
                System.out.println("Method: " + m.getName());
                System.out.println("Developer: " + info.name());
                System.out.println("Date: " + info.date());
                m.invoke(service);
                System.out.println("-------------");
            }
        }
    }
}