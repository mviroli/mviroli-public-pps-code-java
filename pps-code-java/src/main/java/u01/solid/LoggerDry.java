package u01.solid;


public class LoggerDry {

    public static void logPrintString(final String s){
        System.out.format("[Print] %s\n",s);
    }

    public static void logPrintStrings(final String[] array){
        for (int i = 0; i < array.length; i++){
            // reusing code, no duplication
            logPrintString(array[i]);
        }
    }
}
