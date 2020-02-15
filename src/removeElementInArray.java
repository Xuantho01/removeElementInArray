import java.util.Scanner;
public class removeElementInArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,5,6,7,8,3,3};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to remove: ");
        int value = scanner.nextInt();
        int arrLength = array.length;
        for (int i = 0; i < arrLength; i++){
            while(array[i] == value){
                 if (i == arrLength - 1){
                     arrLength--;
                     break;
                 }
                  for(int j = i; j < arrLength-1; j++){
                      array[j] = array[j + 1];
                  }
                  arrLength--;
            }
        }
        for(int i = 0; i < arrLength; i++){
            System.out.print(array[i]+"\t");
        }
    }
}
