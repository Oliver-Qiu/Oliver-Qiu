public class Array {
    public static void main(String[] args) {
        //静态初始化
        //格式：数据类型[] 数组名=new 数据类型[]{元素1，元素2，元素3}    简化格式：数据类型[] 数组名={元素1，元素2，元素3}
        int[] array={11, 22,33};

        //定义数组：存储三名学生的年龄
        int[] arr1= new int[]{11,12,13};
        //定义数组：存储三名学生的姓名
        String[] arr2=new String[]{"Sam","Oliver","Amy"};

        //1.获取数组的元素：数组[索引] 从0开始
        //格式1: System.out.println(arr[1])
        System.out.println(arr1[0]);

        //格式2: int number=arr[1]
        int number=arr1[1];
        System.out.println(number);

        //2.把数据存到数组当中
        //格式：数组名[索引]=数值/变量     注意！覆盖后，愿数据不再存在
        arr2[0]="August";
        System.out.println(arr2[0]);

        //3.用循环的方式遍历数组：for(数组类型[0], i<数组名.length, i++){}
        //idea快捷方式：数组名.fori
        int[] arr3={2,3,5,12,4,54,6,74,13,3,9,8,0,12,4,54,6,74,77,8,4,7};
        for (int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }

        //练习：定义一个数组，然后求数组里能够被3整除的个数
        //思路：
        // 1.定义数组
        int[] arr4={1,2,3,4,5,6,7,8,9};
        // 2.定义变量，统计个数
        int sum=0;
        // 3.遍历数组，累加求和
        for (int i = 0; i < arr4.length; i++) {
            //条件语句
            if (arr4[i] % 3 == 0) {
                sum+=1;
            }
        }
        System.out.println("数组中能被3整除的个数有"+sum+"个");



         

        //数组的动态初始化格式：数组类型[] 数组名称=new 数组类型[数组的长度]；
        String[] name= new String[20];
        //添加信息；
        name[0]="Oliver";
        name[1]="Rose";
        //获取
        System.out.println(name[0]);
        System.out.println(name[1]);

    }
}
