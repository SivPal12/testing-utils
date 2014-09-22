package no.nith.sivpal12.testing.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ConstructorUtilsTest {

    @Test
    public void isPrivate_ConstructorIsPrivate_ReturnsTrue() throws Exception {
        assertTrue(ConstructorUtils.isPrivate(PrivateConstructor.class));
    }

    @Test
    public void isPrivate_ConstructorIsPublic_ReturnsFalse() throws Exception {
        assertFalse(ConstructorUtils.isPrivate(PublicConstructor.class));
    }

    public static class PublicConstructor {
    }

    public static class PrivateConstructor {
        private PrivateConstructor() {
            // Blank
        }
    }

    @Test
    public void constructor_IsPrivate() throws Exception {
        assertTrue(ConstructorUtils.isPrivate(ConstructorUtils.class));
    }

}
