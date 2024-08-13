public class bubbleSort{
    public static void bubbleSort(int [] list){
        int n = list.length;
        for(int i = n-1; i>=0; i--){
            for(int j = 0; j<=i-1; j++){
                if(list[j]>list[j+1])
                    stdlist.swap(list, j, j+1);
            }
        }
    }
    public static void main(String [] args){
        int [] arr = {18, 16, 14, 12, 8, 6, 4, 3, 2, 1};
        System.out.println("Arreglo antes de ordenar: ");
        stdlist.printListInt(arr);
        bubbleSort(arr);
        System.out.println("Arreglo después de ordenar: ");
        stdlist.printListInt(arr);
    }
}