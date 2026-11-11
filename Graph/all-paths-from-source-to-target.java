// Leetcode - https://leetcode.com/problems/all-paths-from-source-to-target/


class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        res = new ArrayList<>();

        List<Integer> path = new ArrayList<>();
        path.add(0);

        findAllPath(0, path, graph);
        return res;
    }

    private void findAllPath(int curr, List<Integer> path, int[][] graph) {
        if(curr == graph.length-1) {
            res.add(new ArrayList<>(path));
            return;
        }

        int n = graph[curr].length;

        for(int i=0; i<n; i++) {
            int next = graph[curr][i];
            path.add(next);
            findAllPath(next, path, graph);
            path.remove(path.size()-1);
        }
    }
}
