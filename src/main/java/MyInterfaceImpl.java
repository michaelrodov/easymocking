/**
 * Created by rudov on 25/04/2016.
 */
public class MyInterfaceImpl implements MyInterface {

    public int getMeInt(Double d) {
        return d.intValue();
    }

    public Integer getMeInteger(Double d) {
        return new Integer(d.intValue());
    }

    public String getMeString() {
        return "[ORIG]";
    }

    public String getMeString(String s) {
        return "[ORIG] " + s;
    }

    public boolean amI() {
        return true;
    }
}
