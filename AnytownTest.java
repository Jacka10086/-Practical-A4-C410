```java
package Anytown;

import java.util.Scanner;
import java.io.File;

public class AnytownTest {
    public static void main(String[] args) throws Exception {

        ArrayBag buildings = new ArrayBag(13);  // 创建一个容量为13的ArrayBag对象，用于存储建筑物
        File fileIn = new File("Anytown/buildings.txt");  // 创建一个File对象，指向建筑物数据文件
        Scanner fileInput = new Scanner(fileIn);  // 创建一个Scanner对象，用于读取文件中的数据
        String buildingData;  // 存储从文件中读取的建筑物数据
        int marker1 = 2, marker2, marker3, marker4, marker5;  // 标记建筑物数据中各个字段的位置                     
        String address, owner;  // 建筑物的地址和所有者
        int numberOfBedrooms, numberOfEmplyees, avgTurnover;  // 房屋的卧室数量、商店的员工数量和平均营业额
        boolean hasGarage;  // 房屋是否有车库

        // 逐行读取建筑物数据：fileInput 是一个 Scanner 对象，它可以用来读取文件中的内容。
        //hasNextLine() 方法检查文件是否还有未读取的行，如果有则返回 true，否则返回 false。
        //nextLine() 方法读取文件中的下一行，并将其存储在 buildingData 变量中。因此，这个循环会一直读取文件中的行，直到文件中没有未读取的行为止。
        //在每次循环中，buildingData 变量都会被更新为文件中的下一行。
        while (fileInput.hasNextLine()) {
            buildingData = fileInput.nextLine();

            // 通过索引位置找到建筑物数据中各个字段的位置
            marker2 = buildingData.indexOf("|", marker1);
            marker3 = buildingData.indexOf("|", marker2 + 1);
            marker4 = buildingData.indexOf("|", marker3 + 1);
            marker5 = buildingData.indexOf("|", marker4 + 1);

            // 从建筑物数据中提取地址和所有者
            address = buildingData.substring(marker1, marker2);
            owner = buildingData.substring(marker2 + 1, marker3);

            // 根据建筑物类型进行处理
            switch (buildingData.substring(0,1)) {
                case "B" :
                System.out.println("Building");  // 打印类型为建筑物
                if (buildings.addNewEntry(new Building(address, owner))) {
                    System.out.println("Building added");  // 添加建筑物成功
                }
                else {
                    System.out.println("Building not added");  // 添加建筑物失败
                }
                break;
 
                case "H" :
                System.out.println("House");  // 打印类型为房屋
                numberOfBedrooms = Integer.parseInt(buildingData.substring(marker3 + 1, marker4));
                hasGarage = Boolean.parseBoolean(buildingData.substring(marker4 + 1, marker5));
                if (buildings.addNewEntry(new House(address, owner, numberOfBedrooms, hasGarage))) {
                    System.out.println("House added");  // 添加房屋成功
                }
                else {
                    System.out.println("House not added");  // 添加房屋失败
                }
                break;

                case "S" :
                System.out.println("Shop");  // 打印类型为商店
                numberOfEmplyees = Integer.parseInt(buildingData.substring(marker3 + 1, marker4));
                avgTurnover = Integer.parseInt(buildingData.substring(marker4 + 1, marker5));
                if (buildings.addNewEntry(new Shop(address, owner, numberOfEmplyees, avgTurnover))) {
                    System.out.println("Shop added");  // 添加商店成功
                }
                else {
                    System.out.println("Shop not added");  // 添加商店失败
                }
                break;
            }
        }

       fileInput.close();  // 关闭文件读取
    }
}
```
