import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
//        int n=scn.nextInt();
//        int[] data =new int[n];
//        for (int i=0;i<n;i++){
//            data[i]=scn.nextInt();
//        }
//        for (int i=0;i<n;i++){
//            int sum=data[i];
//            for (int j=i+1;j<n;j++){
//                sum=sum+data[j];
//                if (sum==0){
//                    for (int k=i;k<=j;k++){
//                        System.out.print(data[k]+" ");
//                    }
//                    System.out.println();
//                }
//            }
//        }
        //
//        f(scn.nextInt(),scn.nextInt());
        //
//        long n=scn.nextLong();
//        m(n);
        //
//        int n=scn.nextInt();
//        String[] data=new String[n];
//        for (int i=0;i<n;i++){

//        }
        //
//        String str =scn.nextLine();
//        String[] data=str.split(" ");
//        int[] data1=new int[data.length];
//        for (int i=0;i<data.length;i++){
//            data1[i]=Integer.parseInt(data[i]);
//        }
//        square(data1);
        //
//        int n=scn.nextInt();
//        System.out.println(f1(n));
        //
        int n=scn.nextInt();
        int[][] data=new int[n][n];


    }
    public static void f(int w,int h){
        for (int i=1;i<=h;i++){
            for (int j=1;j<=w;j++){
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }
    }
    public static void m(long n){
        String str="";
        while (n>0){
            str=Long.toString(n%10)+" "+str;
            n=n/10;
        }
        System.out.println(str);
    }
    public static void square(int[] data1){
        for (int i=0;i<data1.length;i++){
            data1[i]=data1[i]*data1[i];
        }
        for (int i=0;i<data1.length;i++){
            System.out.print(data1[i]+"\t");
        }
        System.out.println();
    }
    public static int f1(int n){
        if(n==1){
           return 1+1;
        }else {
            return f1(n-1)+f1(n/2);
        }
    }
}
