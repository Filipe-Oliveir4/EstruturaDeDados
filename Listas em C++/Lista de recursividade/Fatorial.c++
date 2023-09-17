#include <iostream>
using namespace std;

 int fat(int num) {
	if(num==1) {
			return 1;
	}else {
			return num * fat(num-1);
	}
	}

 int main() {
     cout << fat(4);
     return 0;
}