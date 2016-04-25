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
    @Mock(type= MockType.NICE, name="myInterfaceNice", fieldName = "myInterface2")
    private MyInterface myInterfaceMock; //step 1 for runner

    @Test
    public void doSomethingTest(){
        //prepare all for usage
        replayAll();
        testedClass.doSomething("TEST1", 1.0);
    }

}
