package will.zhang.graphBasic.EFindingAPath;

/**
 * Created by Will.Zhang on 2018/1/30 0030 15:33.
 */
public interface Graph {

    /**
     * 返回节点个数
     * @return
     */
    int V();

    /**
     * 返回边的个数
     * @return
     */
    int E();

    /**
     * 向图中添加一个边
     * @param v
     * @param w
     */
    void addEdge(int v, int w);

    /**
     * 验证图中是否有从v到w的边
     * @param v
     * @param w
     * @return
     */
    boolean hasEdge(int v, int w);

    /**
     * 控制台打印图
     */
    void show();

    /**
     * 返回图中一个顶点的所有邻边
     * @param v
     * @return
     */
    Iterable<Integer> adj(int v);
}
