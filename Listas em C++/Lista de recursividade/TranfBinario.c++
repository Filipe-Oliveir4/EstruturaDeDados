#include <iostream>
using namespace std;

string bin(int x){
    if(x==0){
        return "";
    }else{
        if(x%2==0){
            x/=2;
            return bin(x)+"0";
        }else{
            x/=2;
            return bin(x)+"1";
        }
    }
}

int main() {
  cout << bin(2);
  return 0;
}