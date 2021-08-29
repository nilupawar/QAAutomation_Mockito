import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class MockitoAnnotation {


    @InjectMocks            // This will tell in which class mock objects(created by @Mock tag) to be inserted
    private MyDummyApplication myDummyApplication = new MyDummyApplication();

    @Mock
    private DummyService dummyService = new DummyService();

    @Test
    public void example1(){
        final String PARAM = "test";
        doReturn(1).when(dummyService).run(PARAM);
        Assert.assertEquals(1,myDummyApplication.run(PARAM));
        verify(dummyService).run(PARAM);                                // Verifies method is called
        verify(dummyService,times(1)).run(PARAM);  // Verifies method is called 1 time
        verify(dummyService,atLeast(1)).run(PARAM);  // Verifies method is called atleast 1 time

    }
}
