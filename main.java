package sort_heap;

public class main {

    public static void main(String[] args) {
        int [] arr = {5,4,8,2,9,4,7,5,3,4,4,8,4,9,4,1,2,3};
        sort(arr);
        for (int i : arr) {
            System.out.print(" "+i);
        }
        
        
    }
    
    
    public static void sort (int [] array){
        int temp;    
        for (int i = array.length/2 -1; i>= 0; i-- ){
            heapChild(array, array.length, i);
        }
        for (int i = array.length -1; i>=0; i-- ){
            temp = array [0];
            array [0] = array [i];
            array [i] = temp;
            heapChild(array, i, 0);
        }
    }

    public static void heapChild (int [] array, int heapSize, int rootIndex) {
        int temp;
        int parent = rootIndex;
        int leftChild = 2*rootIndex + 1;
        int rightChild = 2* rootIndex +2;

        if ((leftChild < heapSize)&&(array[leftChild]> array[parent])){
            parent = leftChild;
        }
        if ((rightChild < heapSize)&&(array[rightChild]> array[parent])){
            parent = rightChild;
        }
        if (parent != rootIndex){
            temp = array[rootIndex];
            array[rootIndex] = array [parent];
            array[parent] = temp;

            heapChild(array, heapSize, parent);
                }

    }
}