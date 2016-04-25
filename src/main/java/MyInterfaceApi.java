/**
 * Created by rudov on 25/04/2016.
 */
public class MyInterfaceApi {
    MyInterface myInterface1;
    MyInterface myInterface2;

    MyInterfaceApi() {
        myInterface1 = new MyInterfaceImpl();
        myInterface2 = new MyInterfaceImpl();
    }

/*
    MyInterfaceApi(MyInterface myInterfaceImpl){
        myInterface1 = myInterfaceImpl;
    }
*/

    public String doSomething(String s, Double d) {
        System.out.println("[1] doSomething:"
                + "\n    myInterface1.getMeString() = " + myInterface1.getMeString()
                + "\n    myInterface1.getMeString(s) = " + myInterface1.getMeString(s)
                + "\n    myInterface1.getMeInt(d) = " + myInterface2.getMeInt(d));

        System.out.println("[2] doSomething:"
                + "\n    myInterface2.getMeString() = " + myInterface2.getMeString()
                + "\n    myInterface2.getMeString(s) = " + myInterface2.getMeString(s)
                + "\n    myInterface2.getMeInt(d) = " + myInterface2.getMeInt(d));


        return "doSomething: return String";
    }
}
