package Anytown; // 声明包名为Anytown

import java.io.File; // 引入File类
import java.util.Scanner; // 引入Scanner类

public class LinkedBagTest { // 声明一个名为LinkedBagTest的类
    public static void main(String[] args) throws Exception { // 主方法，抛出异常

        LinkedBag buildings = new LinkedBag(); // 创建一个LinkedBag的对象
        File fileIn = new File("Anytown/buildings.txt"); // 创建一个File对象，指定文件路径为Anytown/buildings.txt
        Scanner fileInput = new Scanner(fileIn); // 创建一个Scanner对象，用于读取文件内容
        String buildingData; // 声明一个字符串变量buildingData，用于存储文件中的每一行数据
        int marker1 = 2, marker2, marker3, marker4, marker5; // 声明整型变量marker1, marker2, marker3, marker4, marker5                     
        String address, owner; // 声明字符串变量address和owner，用于存储地址和所有者信息
        int numberOfBedrooms, numberOfEmplyees, avgTurnover; // 声明整型变量numberOfBedrooms, numberOfEmplyees, avgTurnover
        boolean hasGarage; // 声明布尔型变量hasGarage，表示是否有车库
      
        while (fileInput.hasNextLine()) { // 当文件还有下一行数据时执行循环
            buildingData = fileInput.nextLine(); // 读取文件中的下一行数据
            marker2 = buildingData.indexOf("|", marker1); // 找到地址和所有者信息之间的分隔符的位置
            marker3 = buildingData.indexOf("|", marker2 + 1); // 找到所有者信息和卧室数量之间的分隔符的位置
            marker4 = buildingData.indexOf("|", marker3 + 1); // 找到卧室数量和是否有车库之间的分隔符的位置
            marker5 = buildingData.indexOf("|", marker4 + 1); // 找到是否有车库和平均营业额之间的分隔符的位置

            address = buildingData.substring(marker1, marker2); // 根据分隔符的位置提取地址信息
            owner = buildingData.substring(marker2 + 1, marker3); // 根据分隔符的位置提取所有者信息

            switch (buildingData.substring(0,1)) { // 根据数据的第一个字符进行分支判断
                case "B" :
                System.out.println("Building"); // 输出"Building"
                if (buildings.addNewEntry(new Building(address, owner))) { // 如果添加建筑成功
                    System.out.println("Building added"); // 输出"Building added"
                }
                else {
                    System.out.println("Building not added"); // 输出"Building not added"
                }
                break;

                case "H" :
                System.out.println("House"); // 输出"House"
                numberOfBedrooms = Integer.parseInt(buildingData.substring(marker3 + 1, marker4)); // 将卧室数量转换为整型
                hasGarage = Boolean.parseBoolean(buildingData.substring(marker4 + 1, marker5)); // 将是否有车库转换为布尔型
                if (buildings.addNewEntry(new House(address, owner, numberOfBedrooms, hasGarage))) { // 如果添加房屋成功
                    System.out.println("House added"); // 输出"House added"
                }
                else {
                    System.out.println("House not added"); // 输出"House not added"
                }
                break;

                case "S" :
                System.out.println("Shop"); // 输出"Shop"
                numberOfEmplyees = Integer.parseInt(buildingData.substring(marker3 + 1, marker4)); // 将员工数量转换为整型
                avgTurnover = Integer.parseInt(buildingData.substring(marker4 + 1, marker5)); // 将平均营业额转换为整型
                if (buildings.addNewEntry(new Shop(address, owner, numberOfEmplyees, avgTurnover))) { // 如果添加商店成功
                    System.out.println("Shop added"); // 输出"Shop added"
                }
                else {
                    System.out.println("Shop not added"); // 输出"Shop not added"
                }
                break;
            }
        }
        System.out.println(buildings); // 输出buildings对象的内容

        if (buildings.addNewEntry(new Building("201 Main Street", "Mr X"))) { // 如果添加建筑成功
            System.out.println("Building added"); // 输出"Building added"
        }
        else {
            System.out.println("Building not added"); // 输出"Building not added"
        }
        if (buildings.addNewEntry(new Building("301 Main Street", "Mr X"))) { // 如果添加建筑成功
            System.out.println("Building added"); // 输出"Building added"
        }
        else {
            System.out.println("Building not added"); // 输出"Building not added"
        }
        if (buildings.addNewEntry(new Building("401 Main Street", "Mr X"))) { // 如果添加建筑成功
            System.out.println("Building added"); // 输出"Building added"
        }
        else {
            System.out.println("Building not added"); // 输出"Building not added"
        }

        System.out.println(buildings); // 输出buildings对象的内容
    }
}
