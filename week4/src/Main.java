//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       int a = 5;
       int b = -a;

       int c = a++ + 5 + (--b);
       int d = ++a +6 - ++b;
       float e = (float) a / c;
       int f = 9 % 4;
       int g = -9 % 4;
       float h = -9.2f %4;

       a += 5 * c;
       System.out.printf("a = %d,b = %d, c =%d, d= %d,e=%.2f,f = %d, g=%d",a, b,c,d,e,f,g);

    }
}