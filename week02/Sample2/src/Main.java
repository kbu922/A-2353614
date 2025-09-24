import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name="";

        System.out.print("당신의 이름");
        name = keyboard.nextLine();


        System.out.printf("당신의 이름 :"  + name + "\n");

    }
}