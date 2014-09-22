package no.nith.sivpal12.testing.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/*
 * source:
 * http://www.stupidplebs.com/testing-private-constructors
 */
public class ConstructorUtils {

    /**
     * Checks if constructor of class i private and adds line coverage
     */
    public static boolean isPrivate(Class<?> clazz)
            throws NoSuchMethodException, SecurityException,
            InstantiationException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        Constructor<?> constructor = clazz
                .getDeclaredConstructor((Class<?>[]) null);

        // the modifiers int can tell us metadata about the constructor
        int constructorModifiers = constructor.getModifiers();

        // constructor is private so we first have to make it accessible
        constructor.setAccessible(true);

        // now construct an instance
        constructor.newInstance((Object[]) null);

        return Modifier.isPrivate(constructorModifiers);

    }

}