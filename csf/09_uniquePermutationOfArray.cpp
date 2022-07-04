#include<iostream>
#include<vector>
#include<algorithm>
#include<unordered_map>
using namespace std;
void helper(vector<int> &arr,int n,int freq[],vector<int> &ans,unordered_map<int,int> &m){

    if(ans.size() == n){
        //Printing here ,  also ans can be stored in bigger DS
        for(int &el : ans){
            cout<<el<<" ";
        }
        cout<<"\n";
        return;
    }

    for(auto i : m){
        if(m[i.first] == 0 ) continue;
        ans.push_back(i.first);
        m[i.first]--;
        helper(arr,n,freq,ans,m);
        m[i.first]++;
        ans.pop_back();
    }
}
void genUniquePermutation(vector<int> &arr){
    int n = arr.size();
    int freq[n] = {0};
    vector<int> ans;
    unordered_map<int,int> m;
    for(int a : arr){
        m[a]++;
    }

    // cout<<"\nMAP\n";
    // for(auto i : m){
    //     cout<<i.first<<" "<<i.second<<"\n";
    // }
    // cout<<"\n";
    

    helper(arr,n,freq,ans,m);
    return;

}
int main()
{
    vector<int> num = {1,2,3};
    genUniquePermutation(num);
    return 0;

} 