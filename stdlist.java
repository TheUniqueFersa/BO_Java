public class  stdlist{
    public static void printListInt(int [] listI){
        for(int each : listI){
            System.out.println(each); //Recordar que este metodo incluye un salto de línea
        }
    }
    public static void swap(int [] arr, int firsti, int secondi){
        int temp = arr[firsti]; 
        arr[firsti] = arr[secondi];
        arr[secondi] = temp;
    }
}