/*圣诞树*/
public class Anewone {
    public static void main(String[] args) {
        int rows=4;//圣诞树,正三角
        int spc=rows;
        for (int i=1;i<=rows;i++) {
            for (int j=spc;j>=1;j--) { //j等于行数所以第一行空几个空格
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++) {
                System.out.print("* ");
            }
            System.out.print("\n");//空一行，用法和println（）是一个意思
            spc-=1;
        }
    }
}
/*
ouput：
    * 
   * * 
  * * * 
 * * * * 
*/




import java.util.Scanner; //闰年计算
public static boolean isLeaoYear(int year){ 
        if((year%4==0&&year%100!=0) || (year%400==0)){
            return true;
        }else{
            return false;
        }
    }
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);//闰年计算
        System.out.println("Enter a year");
        int year=scanner.nextInt();
        if(isLeaoYear(year)){
            System.out.println(year+" is a leap year");
        }else{
            System.out.println(year+" is not a leap year");
        }
    }
















