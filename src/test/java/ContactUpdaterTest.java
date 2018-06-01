import org.junit.Assert;
import org.junit.Test;

public class ContactUpdaterTest {

    @Test
    public void test0162123456() {
        Assert.assertEquals("032123456", ContactUpdater.fromOldNumber("0162123456"));
    }

    @Test
    public void test0163123456() {
        Assert.assertEquals("033123456", ContactUpdater.fromOldNumber("0163123456"));
    }

    @Test
    public void test0164123456() {
        Assert.assertEquals("034123456", ContactUpdater.fromOldNumber("0164123456"));
    }

    @Test
    public void test0165123456() {
        Assert.assertEquals("035123456", ContactUpdater.fromOldNumber("0165123456"));
    }

    @Test
    public void test0166123456() {
        Assert.assertEquals("036123456", ContactUpdater.fromOldNumber("0166123456"));
    }

    @Test
    public void test0167123456() {
        Assert.assertEquals("037123456", ContactUpdater.fromOldNumber("0167123456"));
    }

    @Test
    public void test0168123456() {
        Assert.assertEquals("038123456", ContactUpdater.fromOldNumber("0168123456"));
    }

    @Test
    public void test0169123456() {
        Assert.assertEquals("039123456", ContactUpdater.fromOldNumber("0169123456"));
    }

    @Test
    public void test84162123456() {
        Assert.assertEquals("+8432123456", ContactUpdater.fromOldNumber("+84162123456"));
    }

    @Test
    public void test84163123456() {
        Assert.assertEquals("+8433123456", ContactUpdater.fromOldNumber("+84163123456"));
    }

    @Test
    public void test84164123456() {
        Assert.assertEquals("+8434123456", ContactUpdater.fromOldNumber("+84164123456"));
    }

    @Test
    public void test84165123456() {
        Assert.assertEquals("+8435123456", ContactUpdater.fromOldNumber("+84165123456"));
    }

    @Test
    public void test84166123456() {
        Assert.assertEquals("+8436123456", ContactUpdater.fromOldNumber("+84166123456"));
    }

    @Test
    public void test84167123456() {
        Assert.assertEquals("+8437123456", ContactUpdater.fromOldNumber("+84167123456"));
    }

    @Test
    public void test84168123456() {
        Assert.assertEquals("+8438123456", ContactUpdater.fromOldNumber("+84168123456"));
    }

    @Test
    public void test84169123456() {
        Assert.assertEquals("+8439123456", ContactUpdater.fromOldNumber("+84169123456"));
    }

    @Test
    public void test0123123456() {
        Assert.assertEquals("083123456", ContactUpdater.fromOldNumber("0123123456"));
    }

    @Test
    public void test0124123456() {
        Assert.assertEquals("084123456", ContactUpdater.fromOldNumber("0124123456"));
    }

    @Test
    public void test0125123456() {
        Assert.assertEquals("085123456", ContactUpdater.fromOldNumber("0125123456"));
    }

    @Test
    public void test0127123456() {
        Assert.assertEquals("081123456", ContactUpdater.fromOldNumber("0127123456"));
    }

    @Test
    public void test0129123456() {
        Assert.assertEquals("082123456", ContactUpdater.fromOldNumber("0129123456"));
    }

    @Test
    public void test84123123456() {
        Assert.assertEquals("+8483123456", ContactUpdater.fromOldNumber("+84123123456"));
    }

    @Test
    public void test84125123456() {
        Assert.assertEquals("+8485123456", ContactUpdater.fromOldNumber("+84125123456"));
    }

    @Test
    public void test84127123456() {
        Assert.assertEquals("+8481123456", ContactUpdater.fromOldNumber("+84127123456"));
    }

    @Test
    public void test84129123456() {
        Assert.assertEquals("+8482123456", ContactUpdater.fromOldNumber("+84129123456"));
    }

    @Test
    public void test0120123456() {
        Assert.assertEquals("070123456", ContactUpdater.fromOldNumber("0120123456"));
    }

    @Test
    public void test0121123456() {
        Assert.assertEquals("079123456", ContactUpdater.fromOldNumber("0121123456"));
    }

    @Test
    public void test0122123456() {
        Assert.assertEquals("077123456", ContactUpdater.fromOldNumber("0122123456"));
    }

    @Test
    public void test0126123456() {
        Assert.assertEquals("076123456", ContactUpdater.fromOldNumber("0126123456"));
    }

    @Test
    public void test0128123456() {
        Assert.assertEquals("078123456", ContactUpdater.fromOldNumber("0128123456"));
    }

    @Test
    public void test84120123456() {
        Assert.assertEquals("+8470123456", ContactUpdater.fromOldNumber("+84120123456"));
    }

    @Test
    public void test84121123456() {
        Assert.assertEquals("+8479123456", ContactUpdater.fromOldNumber("+84121123456"));
    }

    @Test
    public void test84122123456() {
        Assert.assertEquals("+8477123456", ContactUpdater.fromOldNumber("+84122123456"));
    }

    @Test
    public void test84126123456() {
        Assert.assertEquals("+8476123456", ContactUpdater.fromOldNumber("+84126123456"));
    }

    @Test
    public void test84128123456() {
        Assert.assertEquals("+8478123456", ContactUpdater.fromOldNumber("+84128123456"));
    }

    @Test
    public void test0186123456() {
        Assert.assertEquals("056123456", ContactUpdater.fromOldNumber("0186123456"));
    }

    @Test
    public void test0188123456() {
        Assert.assertEquals("058123456", ContactUpdater.fromOldNumber("0188123456"));
    }

    @Test
    public void test84186123456() {
        Assert.assertEquals("+8456123456", ContactUpdater.fromOldNumber("+84186123456"));
    }

    @Test
    public void test84188123456() {
        Assert.assertEquals("+8458123456", ContactUpdater.fromOldNumber("+84188123456"));
    }

    @Test
    public void test0199123456() {
        Assert.assertEquals("059123456", ContactUpdater.fromOldNumber("0199123456"));
    }

    @Test
    public void test84199123456() {
        Assert.assertEquals("+8459123456", ContactUpdater.fromOldNumber("+84199123456"));
    }

    @Test
    public void testNull() {
        Assert.assertEquals("", ContactUpdater.fromOldNumber(null));
    }



}
