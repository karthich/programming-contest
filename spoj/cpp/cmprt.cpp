#include "stdafx.h"
using namespace std;
int main() {
	map<char,char> first;
	map<char,char> second;
	char c;
	char dummy;
	int num = 0;
	while(scanf("%c",&c)!=EOF) {
		if(c=='\n') {
			num = (num+1)%2;
			if(num==0 && !first.empty() && !second.empty()) {
				map<char,char>::iterator it1=first.begin(),it2=second.begin();
				while(it1!=first.end() && it2!=second.end()) {
					if(it1->first == it2->first) {
						printf("%c",it1->first);
						it1++;
						it2++;
					} else if (it1->first > it2->first) {
						it2++;
					} else {
						it1++;
					}
				}
				printf("\n");
				first.clear();
				second.clear();
			}
		} else {
			if(num==0) {
				first.insert(pair<char,char>(c,c));
			} else {
				second.insert(pair<char,char>(c,c));
			}
		}
		
	}
	return 0;
	
}