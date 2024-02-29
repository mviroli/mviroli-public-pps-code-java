package u01.solid;


public class LoggerKiss {

    public static void logPrintString(final String s){
        // avoiding a tricky and less known API
        System.out.println("[Print] "+s);
    }

    public static void logPrintStrings(final String[] array){
        // using for comprehension instead of explicit indexing
        for (final String s: array){
            logPrintString(s);
        }
    }
}
