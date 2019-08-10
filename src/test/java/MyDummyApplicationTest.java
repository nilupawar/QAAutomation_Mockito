import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.OngoingStubbing;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MyDummyApplicationTest
{

    MyDummyApplication myDummyApplication = new MyDummyApplication();


    /**
     * NOTE 1 :
     * when a parameterised method is mocked for a return value then the parameter
     * should be same value during exeution to get the same return value
     *
     */
    @Test
    public void myRun(){
        DummyService dummyService = mock(DummyService.class);
        myDummyApplication.setDummyService(dummyService);
        when(dummyService.run("test")).thenReturn(1);
        Assert.assertEquals(1,myDummyApplication.run("test"));
    }
}
