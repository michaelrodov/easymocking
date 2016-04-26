import org.easymock.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


/**
 * Created by rudov on 25/04/2016.
 */

@RunWith(EasyMockRunner.class)
public class MyInterfaceApiPartialTest extends EasyMockSupport {

    private MyInterfaceApi testedClass; //step 2 for runner


    /*assign mock impl ONLY for myInterface2 member of tested object*/
    private MyInterfaceImpl myInterfaceMock; //step 1 for runner

    @Before
    public void runBeforeTests() {
        myInterfaceMock = EasyMock.createMockBuilder(MyInterfaceImpl.class)
                .addMockedMethod("getMeString", String.class)//
                .createMock();

        testedClass = new MyInterfaceApi(myInterfaceMock);
    }

    @Test
    public void partialMockTest() {
        String dash = "DASH";
        /*** RECORD **/

        /**DEFINE PARTIAL CLASS MOCK
         *  1. Must use special constructor in order to inject the mock into the tested object
         *  2. Must define the test on the IMPL and not on the interface
         * */

        EasyMock.expect(myInterfaceMock.getMeString(EasyMock.anyString())).andReturn("[MOCK] Static Response").once();
        EasyMock.expect(myInterfaceMock.getMeString(dash)).andReturn("[MOCK] "+dash); //TODO doesn't work
        EasyMock.expect(myInterfaceMock.getMeString("bash")).andReturn("[MOCK] bash"); //TODO doesn't work
        //EasyMock.expect(myInterfaceMock.getMeString(EasyMock.anyString())).andReturn("[MOCK] ANY STRING").atLeastOnce();


        /*** REPLAY **/

        //activate mocks
        //this.replayAll();
        EasyMock.replay(myInterfaceMock);
        //run the tested function
        testedClass.doSomething("NORMAL", 1.0);
        //validate that all mocks were used

        /*** VERIFY **/
        verifyAll();
        //assert results
        //TODO assert
    }

}
