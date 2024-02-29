package u01others.clean.post;

public interface Network<N,E> {

    interface Nodes<X> {
        boolean contains(X x);
    }

    interface Edges<X> {
        boolean contains(X x);
    }

    interface OutEdges<X,Y> {
        Edges<Y> edgesOf(X x);
        boolean connected(X x, Y y);
    }

    interface InOutEdges<X,Y> {
        Edges<Y> edges(X x1, X x2);
    }

    Nodes<N> nodes();
    Edges<E> edges();
    OutEdges<N,E> outEdges();
    InOutEdges<N,E> inoutEdges();

    /*  - this code is more self-contained
        - it requires no knowledge of libraries
        - it prevents undesired side-effect
        - bridge with java.util.* is easy
        - the boundary could be moved outside
        - what about KISS?
     */
}
