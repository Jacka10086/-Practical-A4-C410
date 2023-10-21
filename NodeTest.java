```java
package Anytown;

// 创建一个名为 NodeTest 的类
public class NodeTest {
    
    // 主函数
    public static void main(String[] args) {

        // 创建三个 Node 对象，并分别传入 Building 对象作为参数
        Node node1 = new Node(new Building("201 Main Street",  "Mr X"));
        Node node2 = new Node(new Building("301 Main Street",  "Mr Y"));
        Node node3 = new Node(new Building("401 Main Street",  "Mr Z"));

        // 设置节点之间的连接关系
        node1.setNext(node2);
        node2.setNext(node3);

        // 打印节点的值
        System.out.printf("Node 1 value is %s/n", node1.getData());
        System.out.printf("Node 2 value is %s/n", node2.getNext().getData());
        System.out.printf("Node 3 value is %s/n", node3.getNext().getNext().getData());
    }
}
```
