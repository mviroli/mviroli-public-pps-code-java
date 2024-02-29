package u01.solid;

public class LoggerLsp {

    interface Console {
        void print(String s);
        void println(String s);
    }
    //...
}
// What if the implementor messes with print/println?
// ...attempting at enforcing semantic substitutability
abstract class AbstractConsole implements LoggerLsp.Console {
    public final void println(String s) {
        this.print(s);
        this.lineFeed();
    }
    protected abstract void lineFeed();
}
class SystemOutConsole extends AbstractConsole {

    @Override
    public void print(String s) {
        System.out.print(s);
    }
    @Override
    protected void lineFeed() {
        System.out.println();
    }
}