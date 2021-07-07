package ren.vic.masterjava;

import org.junit.Test;

import ren.vic.masterjava.annotation.Apple;
import ren.vic.masterjava.annotation.FruitInfoUtil;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void fruit_provider() {
        FruitInfoUtil.getFruitInfo(Apple.class);
    }
}