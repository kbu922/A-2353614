//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float height;
        float standard;
        System.out.print("당신의 키 입력: ");
        height = keyboard. nextFloat();

        standard = (float)(180-height)/20;

        System.out.printf("키가 %.2f Cm 인 사람의 표준 체중은 %.2f Kg 입니다.\n",height,standard);

    }
}