package factorymethod;

import factorymethod.exeption.NotFoundFarm;
import factorymethod.farm.AppleTree;
import factorymethod.farm.Farm;
import factorymethod.farm.OrangeTree;

import java.util.Scanner;

public class CashMachine {
    public static void main(String[] args) {
        Farm farm;
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        switch (product) {
            case "апельсин":
                farm = new AppleTree();
                break;
            case "яблоко":
                farm = new OrangeTree();
                break;
            default:
                throw new NotFoundFarm("Ферма не найдена");
        }
        farm.printName();
    }
}
