import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
/*骰子、質數判斷練習*/
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    static int dice(){//骰子的函式
        int i = (int)(Math.random()*6)+1;
        return i;
    }
    static boolean prime(int a){//檢驗是否為值數的函式
        if(a <= 1){
            System.out.println(a+"不大於1");
            return false;
        }else{
            float ans = 0;
            for(int i = 2 ; i < a ; i++){//可否除以1以外的數(是否有餘數
                ans = (a%i);
                if(ans == 0){
                    return false;
                }
                if(i == (a-1)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        /*累加1~100*/
        int sum = 0;
        for(int i = 1 ; i <= 100 ; i++) {
            sum = i + sum;
        }
        System.out.println("累加1~100的值為:"+sum);

        /*累加1~n*/
        int n = 0;
        sum = 0;
        System.out.printf("輸入數值:");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.printf("累加1~"+n+"的值為:");
        for(int i = 1 ; i <= n ; i++) {
            sum = i + sum;
        }
        System.out.println(sum);

        /*連續投10000次骰子出現1的機率*/
        int counter=0;
        for(int i = 0 ; i < 10000 ; i++){
            int a = 0;//骰子的數值
            a = dice();
            if(a == 1){
                counter++;
            }
        }
        System.out.println("擲10000次骰子中出現1的次數："+counter);

        /*判斷值數*/
        int nu=0;
        System.out.printf("輸入數值:");
        nu = input.nextInt();
        boolean p = prime(nu);
        if(p == false){
            System.out.println(nu+"不是質數");
        }else{
            System.out.println(nu+"是質數");
        }

        /*顯示1~10000中的質數*/
        boolean number[] = new boolean[10000];
        for(int i = 0 ; i < 10000 ; i++){
            number[i] = true;
        }
        for(int i = 1 ; i < 10000 ; i++){
            if(number[i] == true){
                for(int j = 2 ; j <= 5000 ; j++){
                    int mul;
                    mul=(i+1)*j;
                    if(mul <= 10000){
                        //System.out.print(mul+" ");
                        if(number[mul-1] == true)
                            number[mul-1] = false;
                    }else{
                        break;
                    }
                }
                //System.out.println(" ");
            }
        }
        System.out.printf("1~10000之間的質數:");
        int x = 1;
        for(int i = 1 ; i < 10000 ; i++){
            if(number[i] == true){
               if((x%30) == 0){
                   System.out.println(" ");
               }
               System.out.print(i+1+" ");
               x++;
            }
        }

    }
}