package u01.solid;


public class LoggerDip {

    // Abstracting System.out into an interface for others..
    interface Console {
        void print(String s);
        void println(String s);
    }
    // Abstracting LogFormatter into an interface for others..
    interface Formatter {
        String message(String s);
    }

    private final Formatter formatter;
    private final Console console;

    public LoggerDip(Formatter formatter, Console console){
        this.formatter = formatter;
        this.console = console;
    }

    public void logPrintString(final String s){
        console.print(formatter.message(s));
    }

    public void logPrintStrings(final Iterable<String> strings){
        for (final String s: strings){
            logPrintString(s);
        }
    }
}