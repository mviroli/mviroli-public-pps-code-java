package u01.solid;

public class LoggerSrp {

    public static void logPrintString(final String s){
        // pushing the Prefix content responsibility out
        System.out.println(PrefixFormatter.printPrefix()+" "+s);
    }

    public static void logPrintStrings(final String[] array){
        for (final String s: array){
            logPrintString(s);
        }
    }
}

class PrefixFormatter {
    static String printPrefix() {
        return "[Print]";
    }
}
