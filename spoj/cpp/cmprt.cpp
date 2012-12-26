#include<string>
#include<iostream>
#include<vector>
#include<stack>
#include<algorithm>
using namespace std;

string merge(string first,string second) {
	int i=0,j=0;
	string ans = "";
	while(i<first.length() && j<second.length()) {
		if(first[i] == second[j]) {
			ans = ans + first[i];
			i++;
			j++;

		} else {
			if(first[i] < second[j]) {
				i++;
			} else {
				j++;
			}
		}
	}
	return ans;
}
string cmprt(string first,string second) {
	sort(first.begin(),first.end());
	sort(second.begin(),second.end());
	if(first.size() < second.size()) {
		string temp = first;
		first = second;
		second = temp;
	}
	return merge(first,second);
}
int main() {
	char c;
	char dummy;
	int num = 0;
	string x,first,second;

	while(scanf("%c",&c)!=EOF) {
		if(c == '\n') {
			num = (num+1)%2;
			if(num == 0) {
				cout<<cmprt(first,second)<<endl;
				first.clear();
				second.clear();
			}
		} else {
			if(num == 0) {
				first += c;
			} else {
				second += c;
			}
		}
	}
	return 0;
	
}