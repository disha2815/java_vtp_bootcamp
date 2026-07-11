package DAY7.countcomponents;
import java.util.*;

public class Main {
    static void dfs(int node, ArrayList<ArrayList<Integer>> graph , boolean[] visited) {
        visited[node] = true; //if doesnt marked true, it creates infinite recurrsion loop 
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited);
            }
        }
    }
    public static void main(String[] args) {
        int n =6;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

}
}