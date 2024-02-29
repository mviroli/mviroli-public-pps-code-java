package u01others.clean.pre;

import java.util.Map;
import java.util.Set;

public interface Network<N,E> {

    Set<N> nodes();
    Set<E> edges();
    Map<N,Set<E>> outEdges();
    Map<N,Map<N,Set<E>>> inoutEdges();

    /* Typical problems:
        - need to create defensive copies
        - the receiver may still invoke non pertinent methods
        - interface types tend not to be simple
        - java.util classes might not be what we want
     */
}
