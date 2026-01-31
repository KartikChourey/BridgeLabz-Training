package eventtracker;

import org.json.JSONObject;

import java.lang.reflect.Method;
import java.time.LocalDateTime;

public class EventTracker {

    public static void main(String[] args) {

        Class<?> clazz = UserService.class;

        for (Method method : clazz.getDeclaredMethods()) {

            if (method.isAnnotationPresent(AuditTrail.class)) {

                AuditTrail audit = method.getAnnotation(AuditTrail.class);

                JSONObject log = new JSONObject();
                log.put("method", method.getName());
                log.put("action", audit.action());
                log.put("timestamp", LocalDateTime.now().toString());

                System.out.println(log.toString(2));
            }
        }
    }
}
