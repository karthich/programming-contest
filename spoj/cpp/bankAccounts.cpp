#include<stdio.h>
#include<map>
#include<algorithm>
#include<string>
#include<iostream>

using namespace std;

class compare_1 {
    public:
      bool operator()(const string x, const string y)
       {
           string str[2][6];
           for(int i=0;i<2;i++)
           {

               str[i][0] = x.substr(0,2);
               str[i][1] = x.substr(3,8);
               str[i][2] = x.substr(12,4);
               str[i][3] = x.substr(17,4);
               str[i][4] = x.substr(22,4);
               str[i][5] = x.substr(28,4);
           }

           for(int i=0;i<6;i++)
           {
               int result = str[0][i].compare(str[1][i]);

               if(result==0)
                continue;
               else if(result < 0)
                 return false;
               else if(result >0)
                 return true;
           }
      }
};

bool compareStr(string x, string y)
{
    string str[2][6];

    str[0][0] = x.substr(0,2);
    str[0][1] = x.substr(3,8);
    str[0][2] = x.substr(12,4);
    str[0][3] = x.substr(17,4);
    str[0][4] = x.substr(22,4);
    str[0][5] = x.substr(28,4);

    str[1][0] = y.substr(0,2);
    str[1][1] = y.substr(3,8);
    str[1][2] = y.substr(12,4);
    str[1][3] = y.substr(17,4);
    str[1][4] = y.substr(22,4);
    str[1][5] = y.substr(28,4);


    for(int i=0;i<6;i++)
    {
        int result = str[0][i].compare(str[1][i]);

        if(result==0)
         continue;
        else if(result < 0)
          return false;
        else if(result >0)
          return true;
    }
}

int main()
{
	int t;
	int acc;
	char r;
	cout<< compareStr("30 10103538 2222 1233 6160 0142"
			,"30 10103538 2222 1233 6160 0141");
	/*scanf("%d%c",&t,&r);



	string tempStr;
	map<string,int,compare_1> bAccDb;
	map<string,int>::iterator it;


	for(int i=0;i<t;i++)
	{
		scanf("%d%c",&acc,&r);


		while(acc--)
		{

            getline(cin, tempStr);


			it = bAccDb.find(tempStr);
			//item already exists
			if(it != bAccDb.end()){
				it->second++;
			} else {
				pair<string,int> tempPair(tempStr, 1);
				bAccDb.insert(tempPair);
			}

		}

		for(it = bAccDb.begin(); it != bAccDb.end() ; it++)
		{
			cout<<it->first<<" "<<it->second<<endl;
		}
		bAccDb.erase(bAccDb.begin(),bAccDb.end());
	}*/


}

