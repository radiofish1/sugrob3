import org.junit.Assert;
import org.junit.Test;

public class MainClassTest
{
    @Test
    public void testGetClassString()
    {
        MainClass a = new MainClass();
        Assert.assertTrue("getClassString doesn't contain Hello or hello", a.getClassString().contains("Hello") || a.getClassString().contains("hello"));
    }
}
