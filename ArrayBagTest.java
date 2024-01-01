```java
package Anytown;

import java.io.File;
import java.util.Scanner;

public class ArrayBagTest {
    
    public static void main(String[] args) throws Exception {
        // 创建一个 ArrayBag 对象
        ArrayBag buildings = new ArrayBag(13);
        // 创建一个文件对象，指向 buildings.txt 文件
        File fileIn = new File("Anytown/buildings.txt");
        // 创建一个 Scanner 对象来读取文件
        Scanner fileInput = new Scanner(fileIn);
        String buildingData;
        // 创建一些标记变量
        int marker1 = 2, marker2, marker3, marker4, marker5;                     
        String address, owner;
        int numberOfBedrooms, numberOfEmplyees, avgTurnover;
        boolean hasGarage;
       
        // 循环读取文件的每一行数据
        while (fileInput.hasNextLine()) {
            // 读取一行数据
            buildingData = fileInput.nextLine();
            // 根据特定的分隔符找到各个字段的位置
            marker2 = buildingData.indexOf("|", marker1);
            marker3 = buildingData.indexOf("|", marker2 + 1);
            marker4 = buildingData.indexOf("|", marker3 + 1);
            marker5 = buildingData.indexOf("|", marker4 + 1);

            // 根据位置提取字段的值
            address = buildingData.substring(marker1, marker2);
            owner = buildingData.substring(marker2 + 1, marker3);

            // 根据第一个字符来确定建筑类型
            switch (buildingData.substring(0,1)) {
                case "B" :
                System.out.println("Building");
                // 创建一个 Building 对象并将其添加到 buildings 中
                if (buildings.addNewEntry(new Building(address, owner))) {
                    System.out.println("Building added");
                }
                else {
                    System.out.println("Building not added");
                }
                break;

                case "H" :
                System.out.println("House");
                // 提取额外的字段值
                numberOfBedrooms = Integer.parseInt(buildingData.substring(marker3 + 1, marker4));
                hasGarage = Boolean.parseBoolean(buildingData.substring(marker4 + 1, marker5));
                // 创建一个 House 对象并将其添加到 buildings 中
                if (buildings.addNewEntry(new House(address, owner, numberOfBedrooms, hasGarage))) {
                    System.out.println("House added");
                }
                else {
                    System.out.println("House not added");
                }
                break;

                case "S" :
                System.out.println("Shop");
                // 提取额外的字段值
                numberOfEmplyees = Integer.parseInt(buildingData.substring(marker3 + 1, marker4));
                avgTurnover = Integer.parseInt(buildingData.substring(marker4 + 1, marker5));
                // 创建一个 Shop 对象并将其添加到 buildings 中
                if (buildings.addNewEntry(new Shop(address, owner, numberOfEmplyees, avgTurnover))) {
                    System.out.println("Shop added");
                }
                else {
                    System.out.println("Shop not added");
                }
                break;
            }
        }

        // 关闭文件读取器
        fileInput.close();
    }
}
```
