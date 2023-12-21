/**
 * 包含方法和操作袋子的接口
 */
package Anytown;

public interface BagInterface {
    
    /**
     * 获取当前袋子中的元素个数
     * @return 当前袋子中的元素个数
     */
    public int getCurrentSize();
    
    /**
     * 判断袋子是否为空
     * @return 如果袋子为空则返回 true，否则返回 false
     */
    public boolean isEmpty();
    
    /**
     * 向袋子中添加新的建筑物
     * @param newEntry 要添加的建筑物
     * @return 如果添加成功则返回 true，否则返回 false
     */
    public boolean addNewEntry(Building newEntry);
    
    /**
     * 移除袋子中的一个建筑物
     * @return 被移除的建筑物
     */
    public Building remove();
    
    /**
     * 移除袋子中指定的建筑物
     * @param anEntry 要移除的建筑物
     * @return 如果移除成功则返回 true，否则返回 false
     */
    public boolean remove(Building anEntry);
    
    /**
     * 清空袋子中的所有建筑物
     */
    public void clear();
    
    /**
     * 获取袋子中指定建筑物的个数
     * @param anEntry 要获取个数的建筑物
     * @return 指定建筑物的个数
     */
    public int getFrequencyOf(Building anEntry);

    
    /**
     * 判断袋子中是否包含指定的建筑物
     * @param anEntry 要判断的建筑物
     * @return 如果袋子中包含指定的建筑物则返回 true，否则返回 false
     */
    public boolean contains(Building anEntry);
    
    /**
     * 返回袋子中所有建筑物的字符串表示形式
     * @return 袋子中所有建筑物的字符串表示形式
     */
    public String toString();
}
