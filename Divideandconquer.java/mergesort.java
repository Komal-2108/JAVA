
public class mergesort {
    
        public static void mergesort(int arr[], int si, int ei) {
            if (si >= ei) {
                return;
            }
            int mid = si + (ei - si) / 2; // mid part
            mergesort(arr, si, mid); // left part
            mergesort(arr, mid + 1, ei); // right part
            merge(arr, si, ei, mid);
        }
    
        public static void merge(int arr[], int si, int ei, int mid) {
            int temp[] = new int[(ei - si) + 1];
            int i = si; // idx for left
            int j = mid + 1; // idx for right
            int k = 0; // idx for temp
    
            while (i <= mid && j <= ei) {
                if (arr[i] <= arr[j]) { // Changed < to <= for stability
                    temp[k] = arr[i];
                    i++;
                } else {
                    temp[k] = arr[j];
                    j++;
                }
                k++;
            }
    
            // Leftover elements of the left sorted part
            while (i <= mid) {
                temp[k++] = arr[i++];
            }
    
            // Leftover elements of the right sorted part
            while (j <= ei) {
                temp[k++] = arr[j++];
            }
    
            // Copy temp array into the original array
            for (int b = 0, c = si; b < temp.length; b++, c++) {
                arr[c] = temp[b];
            }
        }
    
        public static void printArr(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(); // Add a new line after printing
        }
    
        public static void main(String args[]) {
            int arr[] = {2, 8, 6, 9, 4, 7, 1};
            mergesort(arr, 0, arr.length - 1);
            printArr(arr);
        }
    }
    
    

