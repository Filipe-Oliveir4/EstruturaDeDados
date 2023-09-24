#include <iostream>
using namespace std;

int somaArray(int array[],int tamanho){
    if(tamanho==0){ 
               return array[0];
    }else{
        return array[tamanho]+somaArray(array,tamanho-1);
    }
}

int main() {
    int  array[5] ={1,1,1,1,1};
    cout << somaArray(array, (sizeof(array)/sizeof(int))-1);

  return 0;
}