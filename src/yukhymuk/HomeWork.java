package yukhymuk;

import java.awt.*;
import java.util.Scanner;

import static yukhymuk.Snow.snowTree;


public class HomeWork {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть кількість секунд = ");
        int sekOrigin = sc.nextInt();
        snowTree();
        int min =  sekOrigin/60;
        int hours = min/60;
        int days = hours/24;
        System.out.println();
        System.out.println("* До Нового року залишилось * \n"+ "* " + days + " дні * " + (hours - days*24) + " годин * " + (min-hours*60)+ " хвилин * " + (sekOrigin- min*60) +" секунд *");
    }
}
