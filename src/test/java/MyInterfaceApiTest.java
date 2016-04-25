import org.easymock.*;
import org.junit.Test;
import org.junit.runner.RunWith;



/**
 * Created by rudov on 25/04/2016.
 */

@RunWith(EasyMockRunner.class)
public class MyInterfaceApiTest extends EasyMockSupport {

    @TestSubject
    private MyInterfaceApi testedClass = new MyInterfaceApi(); //step 2 for runner

    /*assign mock impl ONLY for myInterface2 member of tested object*/
    @Mock(type= MockType.STRICT, name="myInterfaceNice", fieldName = "myInterface2")
    private MyInterfaceImpl myInterfaceMock; //step 1 for runner

    @Test
    public void doSomethingTest(){
        //prepare all for usage

        /**define full class mock*/
        //EasyMock.expect(myInterfaceMock.getMeString()).andReturn("[MOCK]");

        /**define partial class mock*/
        myInterfaceMock = EasyMock.createMockBuilder(MyInterfaceImpl.class).addMockedMethod("getMeInt",Double.class).createMock();
        EasyMock.expect(myInterfaceMock.getMeInt(EasyMock.anyDouble())).andReturn(3333);

        //activate mocks
        replayAll();
        //run the tested function
        testedClass.doSomething("TEST1", 1.0);
        //validate that all mocks were used
        verifyAll();
        //assert results
        //TODO assert
    }

}
