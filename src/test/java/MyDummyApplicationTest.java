import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MyDummyApplicationTest
{
    private MyDummyApplication myDummyApplication;
    private DummyService dummyService;

    @Before
    public void setUp(){
        myDummyApplication = new MyDummyApplication();
        dummyService = mock(DummyService.class);
        myDummyApplication.setDummyService(dummyService);
    }


    /**
     * Example 1 :
     * when a parameterised method is mocked for a return value then the parameter
     * should be same value during exeution to get the same return value
     *
     */
    @Test
    public void myRun(){

        when(dummyService.run("test")).thenReturn(1);
        Assert.assertEquals(1,myDummyApplication.run("test"));
    }
}
