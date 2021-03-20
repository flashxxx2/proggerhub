package tech.itpark.proggerhub.dl;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

// singleton -> single instance object
// singleton by Java
public class ServiceRegistry {
    private final static ServiceRegistry instance
            = new ServiceRegistry();
    // Class -> FQN -> Fully Qualified Name
    // tech.itpark.proggerhub.dl.ServiceRegistry
    private final Map<Class, Object> objects = new HashMap<>();

    private ServiceRegistry() {
    }

    public static ServiceRegistry getInstance() {
        return instance;
    }

    public void register(Object object) {
        objects.put(object.getClass(), object);
    }

    public Object lookup(Class clz) {
        return objects.get(clz); // null -> NPE
    }

    public Optional<Object> lookupOptional(Class clz) {
        // Optional.of, of* new Optional
        // Optional.empty() - пустой
        // Optional.of() - заведомо не пустой
        return Optional.ofNullable(objects.get(clz)); // null -> NPE
    }
}
