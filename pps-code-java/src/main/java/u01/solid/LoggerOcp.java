package u01.solid;

// note final, protected, and no static elements
public final class LoggerOcp {

    private final LogFormatter logFormatter;

    public LoggerOcp(LogFormatter logFormatter){
        this.logFormatter = logFormatter;
    }

    // This method now won't be likely changed..
    public void logPrintString(final String s){
        System.out.print(logFormatter.message(s));
    }

    public void logPrintStrings(final String[] array){
        for (final String s: array){
            logPrintString(s);
        }
    }
}
// can be changed by extension, instead of modification
class LogFormatter {
    protected String printPrefix() {
        return "[Print]";
    }
    public final String message(String s) {
        return printPrefix()+" "+s;
    }
}

