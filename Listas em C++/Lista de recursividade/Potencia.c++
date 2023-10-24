#include <iostream>
using namespace std;

int pot(int base, int expoente){
    if (expoente==0)
    {
        return 1;
    }else{
        return base *pot(base,expoente-1);
    }// 5 * 5 * 5 * 1
};

int main() {
     cout << pot(5,3);
     return 0;
}