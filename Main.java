// Подумать над структурой класса Ноутбук для магазина 
// техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков (Set).
// Написать метод, который будет запрашивать у пользователя
// критерий (или критерии) фильтрации и выведет ноутбуки, 
// отвечающие фильтру. Критерии фильтрации можно хранить в Map. 
// Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных 
// критериев - сохранить параметры фильтрации можно также в Map.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("ASUS", "A516JP-EJ463", "Intel Core i7 1065G7", 16, "TN", 15.6, "NVIDIA GeForce MX330", 512, "Windows 10 Home");
        Laptop laptop2 = new Laptop("ASUS", "TUF Gaming F15 FX506HC-HN374", "Intel Core i5 11400H", 16, "IPS", 15.6, "NVIDIA GeForce RTX 3050", 512, "Без ОС");
        Laptop laptop3 = new Laptop("MSI", "Pulse GL76 12UCK-051RU", "Intel Core i7 12700H", 8, "IPS", 17.3, "NVIDIA GeForce RTX 3050", 512, "Windows 11 Home");
        Laptop laptop4 = new Laptop("MSI", "GF63 Thin 11UC-216RU", "Intel Core i7 11800H", 8, "IPS", 15.6, "NVIDIA GeForce RTX 3050", 512, "Windows 11 Home");
        Laptop laptop5 = new Laptop("ASUS", "TUF Gaming F15 FX506HC-HN002", "Intel Core i5 11400H", 8, "IPS", 15.6, "NVIDIA GeForce RTX 3050", 512, "Windows 11 Home");
        Laptop laptop6 = new Laptop("Acer", "Nitro 5 AN515-58-53W9", "Intel Core i5 12500H", 16, "IPS", 15.6, "NVIDIA GeForce RTX 3060", 512, "Без ОС");
        Laptop laptop7 = new Laptop("LENOVO", "IdeaPad 3 15ITL6", "Intel Pentium Gold 7505", 4, "IPS", 15.6, "Intel UHD Graphics", 256, "Windows 10 Home");
        Laptop laptop8 = new Laptop("MSI", "Katana 17 B12VGK-425RU (MS-17L5)", "Intel Core i7 12650H", 32, "IPS", 17.3, "NVIDIA GeForce RTX 4070", 512, "Windows 11 Home");
        Laptop laptop9 = new Laptop("MSI", "ROG Zephyrus M16 GU604VI-N4037W", "Intel Core i9 13900H", 16, "IPS", 16.0, "NVIDIA GeForce RTX 4070", 1024, "Windows 11 Home");
        Laptop laptop10 = new Laptop("GIGABYTE", "AERO 16 BSF (BSF-73KZ994SO)", "Intel Core i7 13700H", 16, "IPS", 16.0, "NVIDIA GeForce RTX 4070", 1024, "Windows 11 Home");
        
        Set<Laptop> laptopSet = new HashSet<>();
        laptopSet.add(laptop1);
        laptopSet.add(laptop2);
        laptopSet.add(laptop3);
        laptopSet.add(laptop4);
        laptopSet.add(laptop5);
        laptopSet.add(laptop6);
        laptopSet.add(laptop7);
        laptopSet.add(laptop8);
        laptopSet.add(laptop9);
        laptopSet.add(laptop10);
        
        System.out.println("Доступны следующие ноутбуки в каталоге:\n");
        System.out.println(laptopSet);
        filterLaptops(laptopSet);
        
    }

    public static void filterLaptops(Set<Laptop> laptopSetToFilter) {

        Map<Integer,String> criteriaOfFiltering = new HashMap<>();
        criteriaOfFiltering.put(1, "бренд");
        criteriaOfFiltering.put(2, "модель");
        criteriaOfFiltering.put(3, "процессор");
        criteriaOfFiltering.put(4, "объем RAM");
        criteriaOfFiltering.put(5, "тип матрицы");
        criteriaOfFiltering.put(6, "диагональ экрана");
        criteriaOfFiltering.put(7, "модель видеокарты");
        criteriaOfFiltering.put(8, "объем SSD");
        criteriaOfFiltering.put(9, "Операционная система");

        System.out.println("\nХотите отфильтровать ноутбуки?\nДоступна фильтрация по следующим критериям:\n");
        System.out.println(criteriaOfFiltering);
        System.out.println("\nВведите номер критерия для осуществления поиска по указанному параметру:\n");
        Scanner scanner0 = new Scanner(System.in, "UTF-8");
        int userChoice = scanner0.nextInt();
        if (userChoice == 1) {
            System.out.println("\nВведите название бренда (например, MSI) для поиска по каталогу:");
            Scanner brandScanner = new Scanner(System.in, "UTF-8");
            String userBrand = brandScanner.nextLine();
            System.out.println("\nОзнакомьтесь с результатами поиска:\n");
            for (Laptop item : laptopSetToFilter) {
                if (item.getBrand().toLowerCase().equals(userBrand.toLowerCase())){
                    System.out.println(item);
                }
            }
        } else if (userChoice == 2) {
            System.out.println("\nВведите название модели ноутбука для поиска по каталогу:");
            Scanner modelScanner = new Scanner(System.in, "UTF-8");
            String userModel = modelScanner.nextLine();
            System.out.println("\nОзнакомьтесь с результатами поиска:\n");
            for (Laptop item : laptopSetToFilter) {
                if (item.getModel().toLowerCase().equals(userModel.toLowerCase())){
                    System.out.println(item);
                }
            }
        } else if (userChoice == 3) {
            System.out.println("\nВведите название процессора (например, Intel Core i5 11400H) для поиска по каталогу:");
            Scanner CPUScanner = new Scanner(System.in, "UTF-8");
            String userCPU = CPUScanner.nextLine();
            System.out.println("\nОзнакомьтесь с результатами поиска:\n");
            for (Laptop item : laptopSetToFilter) {
                if (item.getCPU().toLowerCase().equals(userCPU.toLowerCase())){
                    System.out.println(item);
                }
            }
        } else if (userChoice == 4) {
            System.out.println("\nВведите интересующий вас объем RAM (например, 8) для поиска по каталогу:");
            Scanner RAMScanner = new Scanner(System.in, "UTF-8");
            int userRAM = RAMScanner.nextInt();
            System.out.println("\nОзнакомьтесь с результатами поиска:\n");
            for (Laptop item : laptopSetToFilter) {
                if (item.getRAM().equals(userRAM)){
                    System.out.println(item);
                }
            }
        } else if (userChoice == 5) {
            System.out.println("\nВведите нужный тип матрицы (например, IPS) для поиска по каталогу:");
            Scanner matrixScanner = new Scanner(System.in, "UTF-8");
            String userMatrix = matrixScanner.nextLine();
            System.out.println("\nОзнакомьтесь с результатами поиска:\n");
            for (Laptop item : laptopSetToFilter) {
                if (item.getMatrix().toLowerCase().equals(userMatrix.toLowerCase())){
                    System.out.println(item);
                }
            }
        } else if (userChoice == 6) {
            System.out.println("\nВведите нужный размер диагонали (например 15.6) для поиска по каталогу:");
            Scanner diagonalScanner = new Scanner(System.in, "UTF-8");
            String userDiagonal = diagonalScanner.next();
            System.out.println("\nОзнакомьтесь с результатами поиска:\n");
            for (Laptop item : laptopSetToFilter) {
                if (item.getDiagonal().equals(Double.parseDouble(userDiagonal))){
                    System.out.println(item);
                }
            }
        } else if (userChoice == 7) {
            System.out.println("\nВведите название модели видеокарты (например NVIDIA GeForce RTX 3050) для поиска по каталогу:");
            Scanner GPUScanner = new Scanner(System.in, "UTF-8");
            String userGPU = GPUScanner.nextLine();
            System.out.println("\nОзнакомьтесь с результатами поиска:\n");
            for (Laptop item : laptopSetToFilter) {
                if (item.getGPU().toLowerCase().equals(userGPU.toLowerCase())){
                    System.out.println(item);
                }
            }
        } else if (userChoice == 8) {
            System.out.println("\nВведите интересующий вас объем SSD (например, 512) для поиска по каталогу:");
            Scanner SSDScanner = new Scanner(System.in, "UTF-8");
            int userSSD = SSDScanner.nextInt();
            System.out.println("\nОзнакомьтесь с результатами поиска:\n");
            for (Laptop item : laptopSetToFilter) {
                if (item.getSSD().equals(userSSD)){
                    System.out.println(item);
                }
            }
        } else if (userChoice == 9) {
            System.out.println("\nВведите название операционной системы (например, Windows 10 Home) для поиска по каталогу:");
            Scanner OSScanner = new Scanner(System.in, "UTF-8");
            String userOS = OSScanner.nextLine();
            System.out.println("\nОзнакомьтесь с результатами поиска:\n");
            for (Laptop item : laptopSetToFilter) {
                if (item.getOS().toLowerCase().equals(userOS.toLowerCase())){
                    System.out.println(item);
                }
            }
        } else {
            System.out.println("Ошибка ввода :(");
        }
    }
}