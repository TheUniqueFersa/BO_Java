public class selectionSort{
    public static void selectionSort(int [] arr){
        int n = arr.length, min;
        for(int i=0; i<n-1; i++){
            min = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            stdlist.swap(arr, i, min);
        }
    }
    public static void main(String [] args){
        int [] arr = {152,61,24,85,2,24};
        System.out.println("Arreglo antes de ordenar: ");
        stdlist.printListInt(arr);
        selectionSort(arr);
        System.out.println("Arreglo después de ordenar: ");
        stdlist.printListInt(arr);
    }
}