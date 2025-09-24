//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int salary, expenses;
        float saveRate;
        int save, remain, money;


        System.out.println("월급 : %,d 원\n", salary);
        salary = keyboard.nextln();
        System.out.println("저축 비율을 입력하세요:");
        saveRate = keyboard.nextFloat();
        System.out.println("월 저축 총액을 입력하세요:");
        expenses = keyboard.nextln();

        save = (int) (salary * saveRate);
        remain = salary - (salary + expenses);
        money = remain / 30;

        System.out.println("예산 계산 결과");
        System.out.printf("월급 :%,d원", salary);

    }
}