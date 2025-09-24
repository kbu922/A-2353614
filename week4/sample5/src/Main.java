//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int base;
        int height;
        float area;

        base = keyboard.nextInt();
        height = keyboard.nextInt();
        area = (base * height) / 2.0f;

        System.out.println("삼각형의 면적");
        System.out.printf("\t 일변: %,d Cm\n", base);
        System.out.printf("\t 높이: %,d Cm\n", height);
        System.out.printf("\t 면적: %,.2f \u33a0\n", area);

    }
}