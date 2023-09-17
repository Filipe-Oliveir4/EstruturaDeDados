#include <iostream>
using namespace std;

int CalculaMDCRecursiva(int m, int n) {
		int r = m%n;
		m = n;
		n = r;
		if(r==0) {
			return m;
		}else {
			return CalculaMDCRecursiva(m, n);
		}
	}

 int main() {
     cout << CalculaMDCRecursiva(4,8);
     return 0;
}