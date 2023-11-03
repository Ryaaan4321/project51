import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class disjointSet {
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();

    public disjointSet(int n) {
        for (int i = 0; i <= n; i++) {
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }

    public int findUPar(int node) {
        if (node == parent.get(node))
            return node;

        int ulp = findUPar(parent.get(node));;
        parent.set(node, ulp);
        return parent.get(node);
    }

    public void unionByRank(int u, int v) {
        int ulpu = findUPar(u);
        int ulpv = findUPar(v);
        if (ulpu == ulpv)
            return;

        if (rank.get(ulpu) < rank.get(ulpv)) {
            parent.set(ulpv, ulpu);
        } else if (rank.get(ulpv) < rank.get(ulpu)) {
            parent.set(ulpv, ulpu);
        } else {
            parent.set(ulpv, ulpu);
            int rankU = rank.get(ulpu);
            rank.set(ulpu, rankU + 1);
        }
    }

    public void unionBySize(int u, int v) {
        int ulpu = findUPar(u);
        int ulpv = findUPar(v);

        if (ulpu == ulpv)
            return;

        if (size.get(u) < size.get(ulpv)) {
            parent.set(ulpu, ulpv);
            size.set(ulpv, size.get(ulpv) + size.get(ulpu));
        } else {
            parent.set(ulpv, ulpu);
            size.set(ulpu, size.get(ulpv) + size.get(ulpu));
        }
    }
}
