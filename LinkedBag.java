```java
package Anytown;

public class LinkedBag implements BagInterface{

    private Node firstNode;  // 链表的第一个节点
    private int numberOfEntries;  // 链表中元素的个数

    public LinkedBag() {
        this.firstNode = null;  // 初始化链表为空
        this.numberOfEntries = 0;  // 初始元素个数为0
    }
    

    public int getCurrentSize() {
        return this.numberOfEntries;  // 返回链表中元素的个数
    }

    public boolean isEmpty() {
        return this.numberOfEntries == 0;  // 判断链表是否为空
    }

    public boolean addNewEntry(Building newEntry) {
        Node newNode = new Node(newEntry);  // 创建一个新节点
        newNode.setNext(this.firstNode);  // 将新节点的下一个节点指向当前链表的第一个节点
        this.firstNode = newNode;  // 将新节点设为链表的第一个节点
        this.numberOfEntries++;  // 链表元素个数加一
        return true;  // 添加成功，返回true
    }

    public Building remove() { 
        if(this.firstNode != null) {
            Building result = this.firstNode.getData();  // 获取第一个节点的数据
            this.firstNode = this.firstNode.getNext();  // 将第一个节点设为下一个节点
            this.numberOfEntries--;  // 链表元素个数减一
            return result;  // 返回被移除的节点的数据
        } else {
            return null;  // 链表为空，返回null
        }

    
    }

    private Node findEntry(Building anEntry) {
        Node currentNode = this.firstNode;  // 从第一个节点开始遍历
        boolean found = false;  // 初始化found为false
        while (!found && currentNode != null) {  // 当found为false且当前节点不为空时进入循环
            if (currentNode.getData().equals(anEntry)) {  // 判断当前节点的数据是否与目标元素相等
                found = true;  // 若相等，将found置为true
            } else {
                currentNode = currentNode.getNext();  // 若不相等，将当前节点移动到下一个节点
            }
        }
        if (found) {
            return currentNode;  // 若找到目标元素，返回当前节点
        } else {
            return null;  // 若未找到目标元素，返回null
        }
    }

    public boolean remove(Building anEntry) {
        Node nodeToReomve = findEntry(anEntry);  // 查找目标元素
        if (nodeToReomve == null) return false;  // 若目标元素不存在，返回false
        else {
            nodeToReomve.setData(this.firstNode.getData());  // 将目标元素的数据替换为第一个节点的数据
            this.firstNode = this.firstNode.getNext();  // 将第一个节点设为下一个节点
            this.numberOfEntries--;  // 链表元素个数减一
            return true;  // 移除成功，返回true
        }
    
        
    }

    public void clear() {
         while (!isEmpty()) remove();  // 移除链表中的所有元素
    }

    public int getFrequencyOf(Building anEntry) {
        int count = 0;  // 计数器初始化为0
        Node currentNode = this.firstNode;  // 从第一个节点开始遍历
        while (currentNode != null) {  // 当前节点不为空时进入循环
            if (currentNode.getData().equals(anEntry)) {  // 判断当前节点的数据是否与目标元素相等
                count++;  // 若相等，计数器加一
            }
            currentNode = currentNode.getNext();  // 将当前节点移动到下一个节点
        }
        return count;  // 返回目标元素出现的次数
    }

    public boolean contains(Building anEntry) {
        Node currentNode = this.firstNode;  // 从第一个节点开始遍历
        boolean found = false;  // 初始化found为false
        while (!found && currentNode != null) {  // 当found为false且当前节点不为空时进入循环
            if (currentNode.getData().equals(anEntry)) {  // 判断当前节点的数据是否与目标元素相等
                found = true;  // 若相等，将found置为true
            } else {
                currentNode = currentNode.getNext();  // 若不相等，将当前节点移动到下一个节点
            }
        }
        return found;  // 返回是否找到目标元素
    }

    public String toString() {
        String resultStr = "Bag [ \n";  // 初始化结果字符串
        Node currentNode = this.firstNode;  // 从第一个节点开始遍历
        while (currentNode != null) {  // 当前节点不为空时进入循环
            resultStr += currentNode.getData().toString() + "\n";  // 将当前节点的数据添加到结果字符串中
            currentNode = currentNode.getNext();  // 将当前节点移动到下一个节点
        }
        resultStr += "]";  // 添加结束标记
        return resultStr;  // 返回结果字符串
    }
}
```
