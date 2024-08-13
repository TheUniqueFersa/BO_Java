public class insertionSort{
    public static void insertionSort(int [] list){
        int n = list.length, index, j;
        for(int i=0; i<n; i++){
            index = list[i];
            j = i-1;
            while(j>=0 && list[j] > index){
                list[j+1] = list[j];
                j=j-1;
            }
            list[j+1] = index;
        }
    }
    public static void main(String[] args){
        int [] arr = {12,576,1,24,7,89,16};
        System.out.println("Arreglo antes de ordenar: ");
        stdlist.printListInt(arr);
        insertionSort(arr);
        System.out.println("Arreglo después de ordenar: ");
        stdlist.printListInt(arr);

    }
}