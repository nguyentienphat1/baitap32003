import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,y;
        int demsnt=0;
        int demshh=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap x");
        x= scanner.nextInt();
        System.out.println("nhap y");
        y= scanner.nextInt();
        for (int i=x;i<=y;i++){
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    demsnt++;
                }
            }
            if (demsnt==2){
                System.out.println("cac so nguyen to la: "+i);
                demsnt=0;
            }else {
                demsnt=0;
            }
        }
        for (int i=x;i<=y;i++){
            double j=Math.sqrt(i);
            if (i==Math.pow(j,2)){
                System.out.println("la so chinh phuong: "+i);
            }
        }
        for (int i=x;i<=y;i++){
            for (int j=1;j<i;j++){
                if (i%j==0){
                    demshh=demshh+j;
                }
            }
            if (demshh==i){
                System.out.println("cac so hoan hao la: "+i);
                demshh=0;
            }else {
                demshh=0;
            }
        }
    }
}