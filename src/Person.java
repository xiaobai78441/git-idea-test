abstract class Person {


    public String name;
    public String sex;
    public int age;


    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //  默认定义10本书，预留3个空位
    public static Book[] books = new Book[]{
            new Book("我的经济学思维课","张军","经济学",328.5,false),
            new Book("心态","张军","心理学",1000.5,true),
            new Book("东京传","斯蒂芬.曼斯菲尔德","历史",664,true),
            new Book(),
            new Book(),
            new Book(),
            new Book(),
            new Book(),
            new Book(),
            new Book()
    };

    //  抽象类方法中的抽象方法
    public abstract void operate();

}
