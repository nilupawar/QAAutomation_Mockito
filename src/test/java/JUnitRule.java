import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

public class JUnitRule {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    private File file;

    @Before
    public void init() throws IOException {
        file = temporaryFolder.newFolder("Test");
    }

    @Test
    public void myRuleTest(){
        System.out.println("Testing for folder creation : " + file.exists());
        Assert.assertTrue(file.delete());
        System.out.println("Testing for folder creation : " + file.exists());
    }

    @Test
    public void myRuleTest1(){
        System.out.println("Testing for folder creation : " + file.exists());
        Assert.assertTrue(file.delete());
        System.out.println("Testing for folder creation : " + file.exists());
    }

    @Test
    public void myRuleTest2(){
        System.out.println("Testing for folder creation : " + file.exists());
        Assert.assertTrue(file.delete());
        System.out.println("Testing for folder creation : " + file.exists());
    }


}
