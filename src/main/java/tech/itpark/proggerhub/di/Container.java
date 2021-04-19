package tech.itpark.proggerhub.di;

import java.util.*;

public class Container {

    private final Set<Class> definitions = new HashSet<>();

    private final Map<Class, Object> objects = new HashMap<>();

    public void register(Class... clz) {
        definitions.addAll(Arrays.asList(clz));
    }

    public void wire() {

    }
}
