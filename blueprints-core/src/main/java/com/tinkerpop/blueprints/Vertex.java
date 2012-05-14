package com.tinkerpop.blueprints;

/**
 * A vertex maintains pointers to both a set of incoming and outgoing edges.
 * The outgoing edges are those edges for which the vertex is the tail.
 * The incoming edges are those edges for which the vertex is the head.
 * Diagrammatically, ---inEdges---> vertex ---outEdges--->.
 *
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public interface Vertex extends Element {

    /**
     * The edges emanating from, or leaving, the vertex.
     *
     * @param labels the labels of the edges to return
     * @return the edges for which the vertex is the tail
     */
    public Iterable<Edge> getOutEdges(String... labels);

    /**
     * The edges incoming to, or arriving at, the vertex.
     *
     * @param labels the labels of the edges to return
     * @return the edges for which the vertex is the head
     */
    public Iterable<Edge> getInEdges(String... labels);

    /**
     * Use to query the incoming and/or outgoing edges of the vertex.
     * The returned query object can be configured to support low-level filtering of result set.
     *
     * @return a configurable query object
     */
    public Query query();
}