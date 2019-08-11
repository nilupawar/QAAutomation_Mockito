import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

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
     * should be same value during execution to get the same return value
     */
    @Test
    public void example1(){
         when(dummyService.run("test")).thenReturn(1);
         // Other way write above statement is
         doReturn(1).when(dummyService).run("test");
         Assert.assertEquals(1,myDummyApplication.run("test"));
    }

    /**
     * Example 1_1 :
     * NOw to get rid of dependency mentioned in example 1 you can use any() method
     */
    @Test
    public void example1_1(){
        doReturn(1).when(dummyService).run(any(String.class));
        Assert.assertEquals(1,myDummyApplication.run("Pass any value of type string"));
    }

    /**
     * Example 2 :
     * This example will help you to understand how make sure methods are called in desired sequence
     */
    @Test
    public void example2(){
        doReturn(1).when(dummyService).run("test");
        doNothing().when(dummyService).run();

        // If the sequence of below two methods are changed then inOrder.verify method will fail
        myDummyApplication.run();
        myDummyApplication.run("test");

        InOrder inOrder = inOrder(dummyService);
        // Below sequence of order make sure that mocked methods are called in the sequence mentioned
        inOrder.verify(dummyService).run();
        inOrder.verify(dummyService).run("test");
    }
}
