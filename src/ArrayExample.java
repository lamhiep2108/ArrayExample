import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[]createRandom(){
        Random random=new Random();
        Integer[]arr=new Integer[100];
        System.out.println("ds phan tu mang");
        for (int i = 0; i < 100; i++) {
            arr[i]=random.nextInt(100);
            System.out.println(arr[i]+"");
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayExample arrayExample=new ArrayExample();
        Integer[]arr=arrayExample.createRandom();
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x=scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("chi so vuot qua gioi han mang");
        }
    }

}
