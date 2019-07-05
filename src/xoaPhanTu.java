import java.util.Scanner;

public class xoaPhanTu {
    public static void main(String args[]) {
        int array[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao vi tri muon xoa:");
        int index = scanner.nextInt();
        array = deleteElement(array, index);
        printArray(array);
    }

    private static void printArray(int array[]) {
        for (int i = 0; i < array.length-2; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }

    private static int[] deleteElement(int oldArray[], int index) {
        int length = oldArray.length;
        int newArray[] = new int[length + 1];
        for (int i = 0; i< index; i++){
            newArray[i] = oldArray[i];
        }
        for (int i = index+1; i< length; i++){
            newArray[i-1] = oldArray[i];
        }
        return newArray;
    }
}
