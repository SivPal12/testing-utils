package no.nith.sivpal12.testing.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ClassUtilsTest {

    @Test
    public void classIsSubClassOf_InputClassIsSubclass_true() {
        assertTrue(ClassUtils.classIsSubClassOf(Object.class, String.class));
    }

    @Test
    public void classIsSubClassOf_InputClassIsNotSubclass_false() {
        assertFalse(ClassUtils.classIsSubClassOf(String.class, Object.class));
    }

}
