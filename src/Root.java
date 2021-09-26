import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Root extends Person implements  Operate {
    public Root(String name, String sex, int age) {
        //  调用人的构造方法
        super(name, sex, age);
    }

    Scanner scanner = new Scanner(System.in);

    //  管理员操作
    @Override
    public void operate() {
        System.out.println("尊敬的管理员，请输入你的操作：");
        int i = scanner.nextInt();
        switch (i){
            case 1:
                //  增加书籍
                add(books);
                break;
            case 2:
                //  删除书籍
                delete(books);
                break;
            case 3:
                //  查找书籍
                select(books);
                break;
            case 4:
                //  书籍列表
                list(books);
                break;
            case 5:
                //  给书籍排序
                sort(books);
                break;
            default:
                System.out.println("输入有误！");
                break;
        }
    }

    /*
     *
     *   给书籍排序
     *
     * */
    private void sort(Book[] books) {
        System.out.println("按价格排序：");
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
        for (int i =0;i< books.length;i++){
            if (books[i].getPrice() !=0){
                System.out.println(
                        "书籍的名称是：" + "【" + books[i].getName() + "】" + "\n"
                                + "书籍的作者是：" + "【" + books[i].getAutuor() + "】"  + "\n"
                                + "书籍的分类是：" + "【" + books[i].getCategory() + "】"  + "\n"
                                + "书籍的价格是：" + "【" + books[i].getPrice() + "】");
            }
        }
    }

    /*
     *
     *   添加书籍
     *
     * */
    @Override
    public void add(Book[] books) {
        System.out.println("请输入书籍名称：");
        String name = scanner.next();
        System.out.println("输入书籍作者：");
        String author = scanner.next();
        System.out.println("请输入书籍类型：");
        String category = scanner.next();
        System.out.println("请输入书籍阅读量：");
        double price = scanner.nextInt();
        boolean flag = false;

        for (int i = 0;i<books.length;i++){
            if (books[i].getName() == null){
                flag = true;
                books[i].setName(name);
                books[i].setAutuor(author);
                books[i].setCategory(category);
                books[i].setPrice(price);
                books[i].setState(true);
                System.out.println("添加成功！");
                break;
            }
        }
        if (!flag){
            System.out.println("最多只能添加xx本书...");
        }
    }

    /*
     *
     *   删除书籍
     *
     * */
    @Override
    public void delete(Book[] books) {
        System.out.println("请输入需要删除的书籍的名称：");
        String str = scanner.next();
        if (str != null){
            for (int i = 0;i< books.length;i++){
                if (books[i].getName().equals(str)){
                    books[i] = null;
                    System.out.println("删除成功！");
                    break;
                }
            }
        }
    }


    /*
     *
     *   查找书籍
     *
     * */
    @Override
    public void select(Book[] books) {
        System.out.println("请输入书名进行查询：");
        String name = scanner.next();
        if (name != null){
            boolean flag = false;
            int bookNum = 0;
            for (int  i =0;i< books.length;i++){
                if (books[i].getName() !=null && name.equals(books[i].getName())){
                    flag = true;
                    bookNum = i;
                    break;
                }
            }
            if (!flag){
                System.out.println("未查询到此书籍！");
            }else {
                System.out.println("------------- 书籍的信息为 -----------");
                System.out.println(
                        "书籍的名称是：" + "【" + books[bookNum].getName() + "】" + "\n"
                      + "书籍的作者是：" + "【" + books[bookNum].getAutuor() + "】"  + "\n"
                      + "书籍的分类是：" + "【" + books[bookNum].getCategory() + "】"  + "\n"
                      + "书籍的价格是：" + "【" + books[bookNum].getPrice() + "】"
                );
            }
        }
    }


    /*
    *
    *   查询书籍列表
    *
    * */
    @Override
    public void list(Book[] books) {
        System.out.println("书籍的列表如下");
        for (int i = 0;i< books.length;i++){
            if (books[i].getName() != null){
                if (books[i].getPrice() !=0){
                    System.out.println("书籍的名称是：" + "【" + books[i].getName() + "】"
                            + "书籍的作者是：" + "【" + books[i].getAutuor() + "】"
                            + "书籍的分类是：" + "【" + books[i].getCategory() + "】"
                            + "书籍的价格是：" + "【" + books[i].getPrice() + "】");
                }
            }
        }
    }

}