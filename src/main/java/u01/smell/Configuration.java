package u01.smell;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Configuration {

    private List<String> data;

    public void loadFromFile(final String fileName){
        try{
            this.data = Files.readAllLines(Paths.get(fileName));
        } catch (IOException e){
            System.out.println(e); // Technical debt here!
        }
    }

    public List<String> getData(){
        return Collections.unmodifiableList(this.data);
    }

}