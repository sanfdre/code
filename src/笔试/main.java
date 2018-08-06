package 笔试;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/7/8
 */
public class main {
    private Integer i = new Integer(1);
    private final Integer a = i;

    public static void main(String[] args) {
        main main = new main();
        System.out.println(main.a);
        System.out.println(main.a);
    }
}
