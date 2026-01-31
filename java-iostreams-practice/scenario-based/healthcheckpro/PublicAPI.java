package healthcheckpro;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
public @interface PublicAPI {
    String description();
}



@Retention(RetentionPolicy.RUNTIME)
@interface RequiresAuth {
}
