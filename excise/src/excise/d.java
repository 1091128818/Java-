package excise;

import java.util.Arrays;
import java.util.Random;

public class d {
    public static void main(String[] args) {
        Random random = new Random();
        int max = 100;
        int min = 0;
        int[][] intss = new int[10][10];
        for (int i = 0; i < intss.length; i++) {
            for (int j = 0; j < intss.length; j++) {
                //��������������Ƹ�����Ԫ��
                intss[i][j] = random.nextInt(max) % (max - min + 1) + min;
            }
        }
        //foreachѭ�������������
        for (int[] x :intss){
            for (int  y:x) {
                System.out.print(y+",");
            }
        }
        System.out.println();
        System.out.println(Arrays.deepToString(intss));
    }
}