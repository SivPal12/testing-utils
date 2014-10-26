package no.nith.sivpal12.testing.utils;

public class ClassUtils {

    public static boolean classIsSubClassOf(Class clazz, Class subClassOf) {
        Class superclass = subClassOf.getSuperclass();

        return superclass != null ? superclass.equals(clazz) : false;
    }

}
