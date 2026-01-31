package healthcheckpro;

import java.lang.reflect.Method;

public class HealthCheckPro {

    public static void main(String[] args) {

        Class<?> clazz = LabController.class;

        System.out.println("API Documentation\n");

        for (Method method : clazz.getDeclaredMethods()) {

        
            if (method.isAnnotationPresent(PublicAPI.class)) {

                PublicAPI api = method.getAnnotation(PublicAPI.class);

                System.out.println("API Name: " + method.getName());
                System.out.println("Description: " + api.description());

                if (method.isAnnotationPresent(RequiresAuth.class)) {
                    System.out.println("Security: AUTH REQUIRED");
                } else {
                    System.out.println("Security: PUBLIC");
                }
              

            } else {
                System.out.println("WARNING: Method '" + method.getName()
                        + "' missing @PublicAPI annotation");
            }
        }
    }
}
