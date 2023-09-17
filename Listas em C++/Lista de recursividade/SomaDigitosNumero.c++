#include <iostream>
using namespace std;

int SumDigNum(int num) {
		if(num==0) {
			return 0;
		}else {
			return (num%10)+SumDigNum(num/10);
		}
	}
int main() {
     int num ;
     cin>>num;
     cout<<SumDigNum(num); 
     return 0;
}
