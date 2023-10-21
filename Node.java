/**
 * 包名：Anytown
 */
package Anytown;

/**
 * 节点类
 */
public class Node {

    private Building data; // 数据域，存储建筑数据
    private Node next; // 指针域，指向下一个节点

    /**
     * 构造方法，初始化节点并设置数据域的值
     * @param dataValue 建筑数据
     */
    public Node(Building dataValue) {
        this.data = dataValue;
        this.next = null;
    }

    /**
     * 获取节点的数据域值
     * @return 建筑数据
     */
    public Building getData() {
        return this.data;
    }

    /**
     * 设置节点的数据域值
     * @param dataValue 建筑数据
     */
    public void setData(Building dataValue) {
        this.data = dataValue;
    }

    /**
     * 获取节点的下一个节点
     * @return 下一个节点
     */
    public Node getNext() {
        return this.next;
    }

    /**
     * 设置节点的下一个节点
     * @param nextNode 下一个节点
     */
    public void setNext(Node nextNode) {
        this.next = nextNode;
    }
}
