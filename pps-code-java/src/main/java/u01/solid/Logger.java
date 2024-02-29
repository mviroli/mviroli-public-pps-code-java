package u01.solid;


public class Logger {

    public static void logPrintString(final String s){
        System.out.format("[Print] %s\n",s);
    }

    public static void logPrintStrings(final String[] array){
        for (int i = 0; i < array.length; i++){
            System.out.format("[Print] %s\n",array[i]);
        }
    }
}
