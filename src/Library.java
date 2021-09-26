import java.util.Scanner;

public class Library {
    Scanner scanner = new Scanner(System.in);

    //  登录页面
    public void login(){
        int count = 0;
        Person p = null;

        while(count < 2 ){
            System.out.println("请选择你的身份登录：" + "\n" +
                    "1，普通用户 " + "\n" +
                    "2，管理员 " + "\n" +
                    "3，退出系统");

            int n = scanner.nextInt();

            if (n==3){
                System.out.println("退出登录系统！");
                return;
            }

            switch (n) {
                case 1:
                    System.out.println("请输入姓名：");
                    String Uname = scanner.next();
                    System.out.println("请输入性别：");
                    String Usex = scanner.next();
                    System.out.println("请输入年龄：");
                    int Uage = scanner.nextInt();

                    p = new User(Uname, Usex, Uage);

                    System.out.println("登录成功");
                    System.out.println("当前普通用户：" + "姓名: " + p.getName() + "年龄是：" + p.getAge() + "性别：" + p.getSex());

                    while (true) {
                        System.out.println("请输入你的操作：1，查询书籍 2，借阅书籍 3，归还书籍 4，显示书籍列表 5，退出");
                        int i = scanner.nextInt();
                        if (i == 5) {
                            System.out.println("您已成功退出！");
                            break;
                        } else {
                            p.operate();
                        }
                    }
                    break;

                case 2:
                    System.out.println("请输入姓名：");
                    String Rname = scanner.next();
                    System.out.println("请输入性别：");
                    String Rsex = scanner.next();
                    System.out.println("请输入年龄：");
                    int Rage = scanner.nextInt();

                    p = new Root(Rname,Rsex,Rage);

                    System.out.println("登录成功");
                    System.out.println("管理员姓名:");
                    while(true){
                        System.out.println("请输入你的操作：1，增加书籍 2，删除书籍 3，查找书籍 4，书籍列表 5，给书籍排序 6，退出");
                        int j = scanner.nextInt();
                        if (j == 6){
                            System.out.println("您已成功退出");
                            break;
                        }else{
                            p.operate();
                        }

                    }
                    break;
            }
        }
    };
}
