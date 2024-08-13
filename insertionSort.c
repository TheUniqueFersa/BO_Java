#include <stdio.h>
void insertionSort(int * list, int size){
    int n = size, j=0, index =0;
    for(int i = 0; i<n; i++){
        index = *(list+i);
        j=i-1;
        while(j>=0 && *(list+j) > index){
            *(list+(j+1)) = *(list+j);
            j = j-1;
        }
        *(list+(j+1)) = index;
    }
}
void imprimeLista(int * list, int size){
    for(int i=0; i<size; i++){
        printf("%d\n", *(list+i));
    }
}
int main (){
    int size = 7;
    int lista[7] = {2,1,7,97,16,9,19};
    printf("Lista sin ordenar: \n");
    imprimeLista(lista, size);
    insertionSort(lista, size);
    printf("Lista ordenada: \n");
    imprimeLista(lista, size);
    return 0;
}