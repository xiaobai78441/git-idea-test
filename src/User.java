import java.util.Scanner;

public class User extends Person implements Operate{
    public User(String name, String sex, int age) {
        super(name, sex, age);
    }

    Scanner scanner = new Scanner(System.in);

    //  普通用户的操作
    @Override
    public void operate() {
        System.out.println("你是普通用户，请开始你的操作：");
        int i = scanner.nextInt();
        switch (i){
            case 1:
                //  查找书籍
                select(books);
                break;
            case 2:
                //  借书
                delete(books);
                break;
            case 3:
                //  还书
                add(books);
                break;
            case 4:
                list(books);
                break;
            default:
                System.out.println("输入有误！");
                break;
        }
    }

    @Override
    public void add(Book[] books) {

    }

    @Override
    public void delete(Book[] books) {

    }

    @Override
    public void select(Book[] books) {
        System.out.println("请输入书名进行查询：");
        String name = scanner.next();
        if (name != null){
            boolean flag = false;
            int bookNum = 0;
            for (int i=0;i<books.length;i++){
                if (books[i].getName() !=null && name.equals(books[i].getName())){
                    flag = true;
                    bookNum = i;
                    break;
                }
            }
            if (!flag){
                System.out.println("未查询到此书籍");
            }else {
                System.out.println("书籍信息为：" + "\n" + "【书名】 + 【作者】 + 【分类】 + 【价格】 + 【状态】");
                System.out.println(
                        books[bookNum].getName() +
                                books[bookNum].getAutuor() +
                                books[bookNum].getCategory() +
                                books[bookNum].getPrice() +
                                books[bookNum].isState());
            }
        }

    }

    @Override
    public void list(Book[] books) {

    }


}
