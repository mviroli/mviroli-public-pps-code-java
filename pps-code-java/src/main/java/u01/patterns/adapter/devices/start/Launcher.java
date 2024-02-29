package u01.patterns.adapter.devices.start;

/**
 * Created by mirko on 3/5/17.
 */
public class Launcher {

    public static void main(String[] args) {
        Client client = new Client(null); // what to put here?
        client.prepare();
    }
}
