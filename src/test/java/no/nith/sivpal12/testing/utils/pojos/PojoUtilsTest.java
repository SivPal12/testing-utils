package no.nith.sivpal12.testing.utils.pojos;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import no.nith.sivpal12.testing.utils.ConstructorUtils;

import org.junit.Test;

public class PojoUtilsTest {

    @Test
    public void testEquals_AllDifferent_ReturnsFalse() throws Exception {
        assertFalse(PojoUtils.testEquals("Hei", "123", "asd"));
    }

    @Test
    public void testEquals_Twins_ReturnsTrue() throws Exception {
        assertTrue(PojoUtils.testEquals("Hello", "Hello", "asd"));
    }

    @Test
    public void testEquals_AllSame_False() throws Exception {
        assertFalse(PojoUtils.testEquals("123", "123", "123"));
    }

    @Test
    public void testEquals_Null_False() throws Exception {
        assertFalse(PojoUtils.testEquals(null, "456", "789"));
        assertFalse(PojoUtils.testEquals("123", null, "789"));
        assertFalse(PojoUtils.testEquals("123", "456", null));
    }

    @Test
    public void testHashCode_AllDifferent_ReturnsFalse() throws Exception {
        assertFalse(PojoUtils.testHashCode("Hei", "123"));
    }

    @Test
    public void testHashCode_Twins_ReturnsTrue() throws Exception {
        assertTrue(PojoUtils.testHashCode("Hello", "Hello"));
    }

    @Test
    public void testHashCode_Null_False() throws Exception {
        assertFalse(PojoUtils.testHashCode(null, "456"));
        assertFalse(PojoUtils.testHashCode("123", null));
    }

    @Test
    public void constructor_IsPrivate() throws Exception {
        assertTrue(ConstructorUtils.isPrivate(PojoUtils.class));
    }
}
