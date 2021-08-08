import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {

        int [] task1 = new int[] {1, 0, 1, 1, 0, 1};
        for (int u=0; u< task1.length; u++) {
            if (task1[u] == 1) {
                task1[u] = 0;
            }
            else if (task1[u] == 0) {
                task1[u] = 1;
            }

        }
        System.out.println(Arrays.toString(task1));

int[] task2 = new int [100];
for (int i=0; i<task2.length; i++) {
   task2[i] = i+1;
}
System.out.println(Arrays.toString(task2));

       int [] task3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
       for (int num = 0; num < task3.length; num++) {
           if (task3[num] < 6) {
               task3[num] = task3[num]*2;
           }
       }
       System.out.println(Arrays.toString(task3));

        int [] [] task4 = new int [5] [5];
        for (int a = 0; a < task4.length; a++) {
            for (int b = 0; b < task4[a].length; b++) {
                if (a == b) {
                    task4 [a] [b] = 5;
                }
                System.out.print(task4[a][b]);
                System.out.print(" ");
            }
            System.out.println();
        }
        PrintMessage(81, 6);
}

    public static void PrintMessage (int initialValue, int len) {
        int [] task5 = new int [len];
        for (int i = 0; i < task5.length; i++) {
            task5[i] = initialValue;
        }

        System.out.println(Arrays.toString(task5));

    }


}
