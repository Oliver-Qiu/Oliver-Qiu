object类：对象共同特征的描述。 包含：成员变量/属性（名词）、构造函数constructor、成员方法（行为）
对象：真是存在的具体东西
在java中，必须先设计类，才能获得对象
如何使用对象？
  *访问属性：对象名.成员变量
  *访问行为：对象名.方法名（..）


 //创建类
 public class Person {
    //attributes
    private String name;
    private static int age;

    //constructor
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    //getter and setter
    public int getAge(){ //getter for age
        return this.age;
    }
    public String getName(){ //getter for name
        return this.name;
    }
    public void setAge(int age){ //设置新的数值
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }

    //method
    public void sayHello(){
        System.out.println("Hi,I'm "+name+" i'm "+age+" years old");
    }
}

//建立对象
public class Test {
    public static void main(String[] args) {
        //person1
        Person personOne=new Person("Oliver", 23);
        personOne.sayHello();

        personOne.setAge(24);
        personOne.sayHello();

        //person2
        Person personTwo=new Person("David", 25);
        System.out.println(personTwo.getName());
        System.out.println(personTwo.getAge());

    }
}

/*
Hi,I'm Oliver i'm 23 years old
Hi,I'm Oliver i'm 24 years old
David
25
 */
