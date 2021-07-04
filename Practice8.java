public class Practice8 {
    public static void main(String[] args) {
        // Practice Problem 1 :
        float [] marks = {49.8f, 69.9f, 75.4f, 99.9f, 100.6f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);

        // Practice Problem 2 :
        // float [] marks = {49.8f, 69.9f, 75.4f, 99.9f, 100.6f};
        // float num = 69.9f;
        // boolean isInArray = false;
        // for(float element:marks){
        //     if(num==element){
        //         isInArray = true;
        //         break;
        //     }
        // }
        // if(isInArray){
        //     System.out.println("The value is present in the array");
        // }
        // else{
        //     System.out.println("The value is not present in the array");
        // }

        // Practice Problem 3 :
        // float [] marks = {49.8f, 69.9f, 75.4f, 99.9f, 100.6f};
        // float sum = 0;
        // for(float element:marks){
        //     sum = sum + element;
        // }
        // System.out.println("The value of average marks is " + sum/marks.length);

        // Practice Problem 4 :
        // int [][] mat1 = {{11, 12, 13},
        //                  {14, 15, 16}};
        // int [][] mat2 = {{22, 66, 33},
        //                  {32, 76, 43}};
        // int [][] result = {{0, 0, 0},
        //                    {0, 0, 0}};

        // for (int i=0;i<mat1.length;i++){
        //     for (int j=0;j<mat1[i].length;j++) { 
        //         System.out.format(" Setting value for i=%d and j=%d\n", i, j);
        //         result[i][j] = mat1[i][j] + mat2[i][j];
        //     }
        // }

        // Printing the elements of a 2-D Array
        // for (int i=0;i<mat1.length;i++){ 
        //     for (int j=0;j<mat1[i].length;j++) { 
        //         System.out.print(result[i][j] + " ");
        //         result[i][j] = mat1[i][j] + mat2[i][j];
        //     }
        //     System.out.println(""); 
        // }

        // Practice Problem 5 :
        // int [] arr = {19, 23, 33, 47, 55, 64, 69};
        // int l = arr.length;
        // int n = Math.floorDiv(l, 2);
        // int temp;

        // for(int i=0; i<n; i++){
        //     // Swap a[i] and a[l-1-i]
        //     // a   b   temp
        //     // |4| |3| ||
        //     temp = arr[i];
        //     arr[i] = arr[l-i-1];
        //     arr[l-i-1] = temp;
        // }

        // for(int element: arr){
        //     System.out.print(element + " ");
        // }

        // Practice Problem 6 :
        // int [] arr = {10, 210, 33, 469, 7, 54, 69};
        // int max = Integer.MIN_VALUE;
        // for(int e: arr){
        //     if(e>max){
        //         max = e;
        //     }
        // }
        // System.out.println("the value of the maximum element in this array is: "+ max);

        // Practice Problem 8 :
        boolean isSorted = true;
        int [] arr = {11, 22, 33, 44, 55, 66, 69};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }
    }
}
