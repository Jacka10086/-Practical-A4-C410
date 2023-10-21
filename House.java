```
package Anytown;

public class House extends Building {

    private int numBedrooms; // 卧室数量
    private boolean hasGarage; // 是否有车库
    private static int numHouses = 0; // 房屋数量

    public House() { // 默认构造函数
        super(); // 调用父类的构造函数
        this.numBedrooms = 0; // 初始化卧室数量为0
        this.hasGarage = false; // 初始化是否有车库为false
        House.numHouses++; // 房屋数量加1

    }
    
    public House (String address, String owner, int numBedrooms, boolean hasGarage) { // 带参数的构造函数
        super(address, owner); // 调用父类的构造函数
        this.numBedrooms = numBedrooms; // 初始化卧室数量
        this.hasGarage = hasGarage; // 初始化是否有车库
        House.numHouses++; // 房屋数量加1
    }

    public int getNumBedrooms() { // 获取卧室数量
        return this.numBedrooms;
    }

    public void setNumBedrooms(int numBedrooms) { // 设置卧室数量
        this.numBedrooms = numBedrooms;
    }

    public boolean getHasGarage() { // 获取是否有车库
        return this.hasGarage;
    }

    public void setHasGarage(boolean hasGarage) { // 设置是否有车库
        this.hasGarage = hasGarage;
    }

    public String toString() { // 覆写toString方法
        return super.toString() + " and is a house with " + 
               this.numBedrooms + " bedrooms. ";
    }

    public static int getNumHouses() { // 获取房屋数量
        return House.numHouses;
    }
}
```
