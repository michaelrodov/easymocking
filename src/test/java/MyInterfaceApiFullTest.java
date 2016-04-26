import org.easymock.*;
import org.junit.Test;
import org.junit.runner.RunWith;



/**
 * Created by rudov on 25/04/2016.
 */

@RunWith(EasyMockRunner.class)
public class MyInterfaceApiFullTest extends EasyMockSupport {

    @TestSubject
    private MyInterfaceApi testedClass = new MyInterfaceApi(); //step 2 for runner

    /*assign mock impl ONLY for myInterface2 member of tested object*/
    @Mock(type= MockType.STRICT, name="secondMember", fieldName = "myInterface2")
    private MyInterfaceImpl myInterfaceMock; //step 1 for runner

    @Test
    public void fullMockTest(){

        /*** RECORD **/

        /**DEFINE FULL CLASS MOCK
        * Strict mode. Definition order is important!!
         * */
        EasyMock.expect(myInterfaceMock.getMeString()).andReturn("[MOCK]");
        EasyMock.expect(myInterfaceMock.getMeString(EasyMock.anyString())).andReturn("[MOCK] mocked return");
        EasyMock.expect(myInterfaceMock.getMeInt(EasyMock.anyDouble())).andReturn(3);



        /*** REPLAY **/

        //activate mocks
        replayAll();
        //run the tested function
        testedClass.doSomething("TEST1", 1.0);
        //validate that all mocks were used

        /*** VERIFY **/
        verifyAll();
        //assert results
        //TODO assert
    }

}
