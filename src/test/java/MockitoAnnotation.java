import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.doReturn;


@RunWith(MockitoJUnitRunner.class)
public class MockitoAnnotation {


    @InjectMocks            // This will tell in which class mock objects(created by @Mock tag) to be inserted
    private MyDummyApplication myDummyApplication = new MyDummyApplication();

    @Mock
    private DummyService dummyService = new DummyService();

    @Test
    public void example1(){
        doReturn(1).when(dummyService).run("test");
        Assert.assertEquals(1,myDummyApplication.run("test"));
    }

}
