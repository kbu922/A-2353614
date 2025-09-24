//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        float height;
        float weight;
        final float FEETUNIT = 0.0328084f;
        final float POUNDUNIT = 2.28462f;
        float feet,pound;

        System.out.printf("당신의 키 입력 : ");
        height = keyboard.nextFloat();
        System.out.printf("당신의 몸무게 입력 : ");
        weight = keyboard.nextFloat();
        feet = height/ FEETUNIT;
        weight = weight / POUNDUNIT;


        System.out.printf("당신의 키(%.2f Cm)는 %.2f 피트 입니다.\n",height,feet);
        System.out.printf("당신의 몸쿠게(%.2f Kg)는 %.2f 피운드 입니다.\n ", weight,pound);

    }
}