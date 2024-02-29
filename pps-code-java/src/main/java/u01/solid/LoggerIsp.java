package u01.solid;

public final class LoggerIsp {

    private final LogFormatter logFormatter;

    public LoggerIsp(LogFormatter logFormatter){
        this.logFormatter = logFormatter;
    }

    // This method now won't be likely changed..
    public void logPrintString(final String s){
        System.out.print(logFormatter.message(s));
    }

    // Using a general iterable.. not working for arrays actually
    // can now pass: List, Set, or Arrays.asList(array)
    public final void logPrintStrings(final Iterable<String> strings){
        for (final String s: strings){
            logPrintString(s);
        }
    }
}
