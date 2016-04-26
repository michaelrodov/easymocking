/**
 * Created by rudov on 25/04/2016.
 */
public class MyInterfaceImpl implements MyInterface {

    @Override
    public int getMeInt(Double d) {

        return d.intValue();
    }

    @Override
    public Integer getMeInteger(Double d) {
        return new Integer(d.intValue());
    }

    @Override
    public String getMeString() {
        return "[ORIG]";
    }

    @Override
    public String getMeString(String s) {
        return "[ORIG] " + s;
    }

    @Override
    public boolean amI() {
        return true;
    }
    
    public static int staticSquare(int i){
        return i*i;
    }
}
