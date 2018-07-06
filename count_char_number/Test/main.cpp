#include <iostream>
#include <string>
#include <vector>
#include <string.h>
#include <algorithm>
#include <stdio.h>
#include <stdlib.h>
#include <cstring>
#include <queue>
#include<list>
#include<vector>
#include<stdlib.h>
#include<iostream>
#include<algorithm>
#include <iomanip>
#include <sstream>

using namespace std;


int main()
{

    string str,str_res;
    str_res="";
    cin>>str;
    if(str=="")
        cout<<endl;
    else{
        int cnt=1;
        int pos=0;
        int len = str.length();
        char cmp_ch=str[0];
        pos++;
        while(pos<len)
        {
            if(str[pos]==cmp_ch)
            {
                cnt++;
                pos++;
                continue;
            }
            else
            {
                str_res+=cmp_ch;
                stringstream stream;
                string cnt_str;
                stream<<cnt;
                stream>>cnt_str;
                str_res+=cnt_str;
                cnt=1;
                cmp_ch = str[pos];
                pos++;
            }
        }
        str_res+=cmp_ch;
        stringstream stream;
        string cnt_str;
        stream<<cnt;
        stream>>cnt_str;
        str_res+=cnt_str;
        cnt=0;
        cmp_ch = str[pos];
        pos++;
        cout<<str_res<<endl;
    }

    return 0;
}
