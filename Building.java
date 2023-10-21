```java
package Anytown;

public class Building {
    
    private String address; // 地址
    private String owner; // 所有者
    private static int numBuildings = 0; // 建筑物数量

    public Building() {
        this.address = "";
        this.owner = "";
        Building.numBuildings++;
    }

    public Building(String address, String owner) {
        this.address = address;
        this.owner = owner;
        Building.numBuildings++; 
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String toString() {
        return this.address + " occupied by " + this.owner;
    }

    public static int getNumBuildings() {
        return Building.numBuildings; 
    }

    public boolean equals(Building anotherBuilding) {
        return this.getAddress().equals(anotherBuilding.getAddress());
    }

    public static void main(String[] args) {
        Building b1 = new Building(); // 创建一个空的建筑物对象
        Building b2 = new Building("27 Main Street", "Rex Dog Groomer"); // 创建一个具有地址和所有者的建筑物对象
        Building b3 = new Building("18 Low Street", "Mary Jones"); // 创建一个具有地址和所有者的建筑物对象

        b1.setAddress("3 High Street"); // 设置b1的地址为"3 High Street"
        b1.setOwner("Smith's Newsagent"); // 设置b1的所有者为"Smith's Newsagent"

        System.out.println(b1); // 打印b1的信息
        System.out.println(b2); // 打印b2的信息
        System.out.println(b3); // 打印b3的信息
    }
}
```
