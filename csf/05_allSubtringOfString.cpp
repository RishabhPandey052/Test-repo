#include<iostream>
#include<cstring>
using namespace std;

void genSub(char str[],int n){

    for(int len = 1;len <= n; len++){
        for(int i =0;i<= n - len;i++){
            int j = i + len - 1;
            for(int k = i; k <=j ; k++){
                cout<<str[k];
            } 
            cout<<"\t";
        }
    }
    cout<<"\n";
}

void genSubO(char str[],int n){
    for(int i =0;i<n;i++){
        char sub[n-i+1];
        int curr = 0;

        for(int j = i;j<n;j++){
            sub[curr++] = str[j];
            sub[curr] = '\0';
            cout<<sub<<"\t";
        }
    }
}

int main()
{
    char str[] = "abcd";
    genSub(str,strlen(str));
    genSubO(str,strlen(str));
    
}