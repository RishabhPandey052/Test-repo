#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
void permute(string &s,int index,int n, vector<string> &ans){

    if(index >= n){
        ans.push_back(s);
        return;
    }

    for(int i = index;i < n;i++){
        swap(s[i],s[index]);
        permute(s,index+1,n,ans);
        swap(s[i],s[index]);
    }
}

void generatePermutation(string &str){
    int n = str.length();
    vector<string> ans;
    permute(str,0,n,ans);

    sort(ans.begin(),ans.end());

    for(auto &it : ans){
        cout<<it<<"\t";
    }
    cout<<"\n";
    return;

}
int main()
{
    string str = "abc";
    generatePermutation(str);
}