package yukhymuk;

public class Snow {


    public static void snowTree() {
            int size = 3;
            int repeat = 3;

            for (int k = 0; k < repeat; k++) {
                    for (int i = 0; i < size; i++) {
                            for (int j = 0; j < 2 * size - 1; j++) {
                                    if (j >= size - i -1 && j <= size + i - 1) {
                                            System.out.print("*");
                                    } else {
                                            System.out.print(" ");
                                    }
                            }
                            System.out.println();
                    }
            }
    }}
