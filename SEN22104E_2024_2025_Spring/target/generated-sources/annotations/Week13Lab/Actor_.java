package Week13Lab;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-05-22T12:23:29", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Actor.class)
public class Actor_ { 

    public static volatile SingularAttribute<Actor, String> firstName;
    public static volatile SingularAttribute<Actor, String> lastName;
    public static volatile SingularAttribute<Actor, Short> actorId;
    public static volatile SingularAttribute<Actor, Date> lastUpdate;

}