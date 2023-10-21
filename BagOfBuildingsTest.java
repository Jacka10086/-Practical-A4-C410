```java
package Anytown;

public class BagOfBuildingsTest {

    private static Building b1 = new Building("Address 1", "Owner 1"); // 创建一个名为b1的建筑对象，并设置地址和所有者
    private static Building b2 = new Building("Address 2", "Owner 2"); // 创建一个名为b2的建筑对象，并设置地址和所有者
    private static Building b3 = new Building("Address 3", "Owner 3"); // 创建一个名为b3的建筑对象，并设置地址和所有者
    private static Building b4 = new Building("Address 4", "Owner 4"); // 创建一个名为b4的建筑对象，并设置地址和所有者

    public static void main(String[] args) {

        ArrayListBag buildings = new ArrayListBag(); // 创建一个名为buildings的ArrayListBag对象

        System.out.println("--------------------------");
        System.out.println("BAG TEST:");
        System.out.println("Initial state of Bag:");

        // Output the current status of the bag:
        bagStatusReport(buildings); // 输出当前袋子的状态
        System.out.println("\n");

        System.out.println("Adding 8 buildings to the bag: b1, b1, b2, b2, b3, b3, b4, b4");

        // TODO (1/5): Add the following building objects to the bag in the order given
        // Note: The building objects are defined above as static variables
        
        buildings.addNewEntry(BagOfBuildingsTest.b1); // 将b1添加到袋子中
        buildings.addNewEntry(BagOfBuildingsTest.b1); // 将b1添加到袋子中
        buildings.addNewEntry(BagOfBuildingsTest.b2); // 将b2添加到袋子中
        buildings.addNewEntry(BagOfBuildingsTest.b2); // 将b2添加到袋子中
        buildings.addNewEntry(BagOfBuildingsTest.b3); // 将b3添加到袋子中
        buildings.addNewEntry(BagOfBuildingsTest.b3); // 将b3添加到袋子中
        buildings.addNewEntry(BagOfBuildingsTest.b4); // 将b4添加到袋子中
        buildings.addNewEntry(BagOfBuildingsTest.b4); // 将b4添加到袋子中


        // Output the current status of the bag:
        bagStatusReport(buildings); // 输出当前袋子的状态
        System.out.println("\n");

        System.out.println("---------------------");
        System.out.println("Remove b3 from the bag");

        // TODO (2/5): Remove b3 from the bag:
        buildings.remove(b3); // 从袋子中移除b3

        // Output the current status of the bag:
        bagStatusReport(buildings); // 输出当前袋子的状态
        System.out.println("\n");

        System.out.println("---------------------------");
        System.out.println("Remove b1 and b2 from the bag");

        // TODO (3/5): Remove b1 and b2 from the bag:
        
        buildings.remove(b1); // 从袋子中移除b1
        buildings.remove(b2); // 从袋子中移除b2

        /// Output the current status of the bag:
        bagStatusReport(buildings); // 输出当前袋子的状态
        System.out.println("\n");

        System.out.println("----------------------------------------");
        System.out.println("Remove an unspecified entry from the bag");

        // TODO (4/5): Remove an unspecified entry from the bag:
        buildings.remove(); // 从袋子中移除一个未指定的条目

        // Output the current status of the bag:
        bagStatusReport(buildings); // 输出当前袋子的状态
        System.out.println("\n");

        System.out.println("---------------------------------------------");
        System.out.println("Remove another unspecified entry from the bag");

        // TODO (5/5): Remove another unspecified entry from the bag:
        buildings.remove(); // 从袋子中移除另一个未指定的条目

        // Output the current status of the bag:
        bagStatusReport(buildings); // 输出当前袋子的状态
        System.out.println("\n");

        System.out.println("Bag test completed");
        System.out.println("-----------------------------------------------");
    }

    public static void bagStatusReport(ArrayListBag myBag) {
        System.out.println("Bag contents: " + myBag); // 输出袋子的内容
        System.out.println("Size: " + myBag.getCurrentSize()); // 输出袋子的大小
        System.out.println("Is empty: " + myBag.isEmpty()); // 输出袋子是否为空
        System.out.println("Frequency of b1: " + myBag.getFrequencyOf(BagOfBuildingsTest.b1)); // 输出b1在袋子中的频率
        System.out.println("Frequency of b2: " + myBag.getFrequencyOf(BagOfBuildingsTest.b2)); // 输出b2在袋子中的频率
        System.out.println("Frequency of b3: " + myBag.getFrequencyOf(BagOfBuildingsTest.b3)); // 输出b3在袋子中的频率
        System.out.println("Frequency of b4: " + myBag.getFrequencyOf(BagOfBuildingsTest.b4)); // 输出b4在袋子中的频率
        System.out.println("Bag contains b1: " + myBag.contains(BagOfBuildingsTest.b1)); // 输出袋子是否包含b1
        System.out.println("Bag contains b2: " + myBag.contains(BagOfBuildingsTest.b2)); // 输出袋子是否包含b2
        System.out.println("Bag contains b3: " + myBag.contains(BagOfBuildingsTest.b3)); // 输出袋子是否包含b3
        System.out.println("Bag contains b4: " + myBag.contains(BagOfBuildingsTest.b4)); // 输出袋子是否包含b4
    }

}
```
