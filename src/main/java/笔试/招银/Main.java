package 笔试.招银;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/9/8
 */
public class Main {

    public static void main(String[] args) {
        sumList(90);
    }

    public static void printList(int a, int b) {

        for (int i = a; i <= b; i++) {

            System.out.print(i + " ");

        }

        System.out.println();

    }

    public static void sumList(int s) {

        int start = 1;

        int end = 2;

        int half = (s + 1) / 2;

        int sum = start + end;

        while (start < half) {

            if (sum == s) {

                sum = sum - start;

                printList(start, end);

                start++;

                end++;

                sum = sum + end;

            } else if (sum < s) {

                end++;

                sum+=end;

            } else {

                sum-=start;

                start++;

            }

        }

    }

}
