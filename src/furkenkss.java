import java.util.Scanner;

public class furkenkss {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("bir sayı gir: "); int n= input.nextInt();
        double toplam=0.0;
        for (double i=1;i<=n;i++){
            toplam+=(1/i);
        }
        System.out.print(toplam);
    }
}
