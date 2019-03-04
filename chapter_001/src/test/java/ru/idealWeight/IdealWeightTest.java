package ru.idealWeight;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Andrey Kovalko (kovalkoandrey1983@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class IdealWeightTest {
    /**
     * Test manWeight().
     */
    @Test
    public void whenManHeight180ThenMassNear92() {
        IdealWeight indexMass = new IdealWeight();
        double weight = indexMass.manWeight(180);
        assertThat(weight, closeTo(92.0, 0.1));
    }

    /**
     * Test womanWeight().
     */
    @Test
    public void whenWomanHeight170ThenMassNear69() {
        IdealWeight indexMass = new IdealWeight();
        double weight = indexMass.manWeight(170);
        assertThat(weight, closeTo(69.0, 0.1));
    }
 
}