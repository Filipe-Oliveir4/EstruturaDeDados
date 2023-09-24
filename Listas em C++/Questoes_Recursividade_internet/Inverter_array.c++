#include <iostream>
using namespace std;


int inverte(int v[], int esq, int dir){
int t;
   if (esq >= dir){   
    return 0;
    }else{
    t = v[esq];
    v[esq] = v[dir];
    v[dir] = t;
    return inverte(v, esq+1, dir + 1);
    };
}
 
int main() {
    int  array[5] ={1,2,3,4,5};
    inverte(array,0,4);
    for (int  i = 0; i < 5; i++)
    {
        cout << array[i];
    }
     
    
  return 0;
}