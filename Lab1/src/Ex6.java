/*
 * Создайте программу, вычисляющую простые числа с применением
 * алгоритма «Решето Эратосфена». Этот алгоритм находит
 * простые числа путем исключения всех чисел, кратных меньшим
 * простым.
 */

public class Ex6 {
    public static void main(String[] args) {
        erat(Integer.parseInt(args[0]));
    }

    public static void erat(int n) {
        Boolean[] arg = new Boolean[n + 1];
        for (int i = 0; i < arg.length; i++) {
            arg[i] = true;
        }

        int i = 2;
        int j = 0;

        while (i * i <= n) {
            if (arg[i]) {
                j = i * i;
                while (j <= n) {
                    arg[j] = false;
                    j += i;
                }
            }
            i++;
        }

        for (i = 2; i < arg.length; i++) {
            if (arg[i])
                System.out.print(i + " ");
        }
    }
}
