/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8project4;

/**
 *
 * @author wanner
 * @param <V>
 */
public interface DFSActions<V> {
public void processVertex(V vertex);
public void descendVertex(V vertex);
public void ascendVertex(V vertex);
public void cycleDetected();
}

