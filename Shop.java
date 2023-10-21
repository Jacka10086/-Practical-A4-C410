```
package Anytown; // 包名为 Anytown

public class Shop extends Building { // Shop 类继承自 Building 类

    private int numEmployees; // 员工数量
    private int averageTurnover; // 平均营业额
    private static int numShops = 0; // 静态变量，记录商店的数量

    public Shop() { // 无参构造方法
        super(); // 调用父类的无参构造方法
        this.numEmployees = 0; // 初始化员工数量为0
        this.averageTurnover = 0; // 初始化平均营业额为0
        Shop.numShops++; // 商店数量加1
    }

    public Shop(String address, String owner, int numEmployees, int averageTurnover) { // 带参构造方法
        super(address, owner); // 调用父类的带参构造方法
        this.numEmployees = numEmployees; // 初始化员工数量
        this.averageTurnover = averageTurnover; // 初始化平均营业额
        Shop.numShops++; // 商店数量加1
    }

    public int getNumEmployees() { // 获取员工数量
        return this.numEmployees;
    }

    public void setNumEmployees(int numEmployees) { // 设置员工数量
        this.numEmployees = numEmployees;
    }

    public int getAverageTurnover() { // 获取平均营业额
        return this.averageTurnover;
    }

    public void setAverageTurnover(int averageTurnover) { // 设置平均营业额
        this.averageTurnover = averageTurnover;
    }

    public String toString() { // 重写 toString 方法
        return super.toString() + " and is a shop with " +
               this.numEmployees + " employees "; // 返回商店信息及员工数量
    }

    public static int getNumShops() { // 获取商店数量的静态方法
        return Shop.numShops;
    }
}
```
