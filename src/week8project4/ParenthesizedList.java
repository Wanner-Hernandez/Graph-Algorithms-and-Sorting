/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8project4;

/**
 *
 * @author wanner
 */
import java.util.LinkedList;
import java.util.Queue;
public class ParenthesizedList implements DFSActions<Vertex> {
// This class maintain a Queue to trace orders of the nodes and their dependent nodes with proper spacing format
// Deque<Pair<String> res = new LinkedList<>();
Queue<String> res = new LinkedList<>();
@Override
public void processVertex(Vertex vertex) {
res.add(vertex.toString());
}
@Override
public void descendVertex(Vertex vertex) {
res.add("(");
}
@Override
public void ascendVertex(Vertex vertex) {
res.add(")");
}
@Override
public void cycleDetected() {
res.add("*");
}
@Override
public String toString() {
String ans = "";
ans += "( ";
while (res.size() > 0) {
String c = res.peek();
res.remove();
if (c == "(") {
if (res.peek() == ")") {
res.remove();
continue;
} else if (res.peek() == "*") {
ans += res.peek() + " ";
res.remove();
res.remove();
continue;
}
}
ans += c + " ";
}
ans += ")\n";
return ans;

}
}

