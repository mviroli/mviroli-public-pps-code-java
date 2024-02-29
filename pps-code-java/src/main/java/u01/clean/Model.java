package u01.clean;

// A modelling abstraction for a DVCS
public interface Model {

    void setCmd();

    void doCopy(String path2);

    void setRepository(String repo);

    boolean check_Existence();

    void doCommit(String commento);

    String[] Log();
}
