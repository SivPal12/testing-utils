package no.nith.sivpal12.testing.utils.pojos;



public class PojoUtils {

    private PojoUtils() {
    }

    public static boolean testEquals(final Object twinOne,
            final Object twinTwo, final Object outsider) {
        if (twinOne == null || twinTwo == null || outsider == null) {
            return false;
        }
        return twinTwo.equals(twinOne) && !twinOne.equals(outsider);
    }

    public static boolean testHashCode(final Object twinOne,
            final Object twinTwo) {
        if (twinOne == null || twinTwo == null) {
            return false;
        }
        return twinOne.hashCode() == twinTwo.hashCode();
    }
}
