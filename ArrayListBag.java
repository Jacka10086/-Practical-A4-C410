package Anytown;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBag implements BagInterface {

    private ArrayList<Building> buildings = new ArrayList<Building>();  // 创建一个ArrayList，用于存储Building对象

    public int getCurrentSize() {
        return this.buildings.size();  // 返回ArrayList中元素的个数，即当前大小
    }

    public boolean isEmpty() {
        return this.buildings.size() == 0;  // 判断ArrayList是否为空
    }

    public boolean addNewEntry(Building newEntry) {
        this.buildings.add(newEntry);  // 向ArrayList中添加新的Building对象
        return true;    
    }
//这个方法首先使用 isEmpty() 方法检查 ArrayList 是否为空。如果 ArrayList 不为空，那么它使用 this.buildings.get(0) 获取 ArrayList 中的第一个元素，即索引为 0 的元素，
//将其赋值给一个新的 Building 类型的变量 thisBuilding。然后，它使用 this.buildings.remove(0) 删除 ArrayList 中的第一个元素，并将其返回。如果 ArrayList 为空，那么它返回 null。
    public Building remove() {
        if(!isEmpty()) {
            Building thisBuilding = this.buildings.get(0);  // 获取ArrayList中索引为0的Building对象
            this.buildings.remove(0);  // 移除ArrayList中索引为0的Building对象
            return thisBuilding;  // 返回被移除的Building对象
        } else return null;
    }

    public boolean remove(Building anEntry) {
        return this.buildings.remove(anEntry);  // 移除ArrayList中指定的Building对象
    }

    public void clear()  {
        this.buildings.clear();  // 清空ArrayList中的所有元素

    }

    public int getFrequencyOf(Building anEntry) {
       return Collections.frequency(this.buildings, anEntry);  // 返回ArrayList中指定Building对象的出现次数
    }


    public boolean contains(Building anEntry) {
        return this.buildings.contains(anEntry);  // 判断ArrayList中是否包含指定的Building对象
    }

    public String toString() {
        String resultStr = "Bag [ \n";
        for (Building building : buildings) {
            resultStr += building.toString() + "\n";  // 将ArrayList中的每个Building对象转为字符串，并添加到resultStr中
        }
        resultStr += "] \n";
        return resultStr;
    }    
}
