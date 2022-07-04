#include<iostream>
#include<vector>
using namespace std;
void helper(vector<int> &arr,int n,int index,int freq[],vector<int> &ans){
    if(index == n){
        for(int &el : ans){
            cout<<el<<" ";
        }
        cout<<"\n";
        return;
    }

    for(int i = 0; i < n ; i++){
        if(!freq[i]){
            ans.push_back(arr[i]);
            freq[i] = 1;
            helper(arr,n,index+1,freq,ans);
            ans.pop_back();
            freq[i] = 0;  
                  
        }
    }
    
}
void genPermutation(vector<int> &arr){
    int n = arr.size();
    int freq[n] = {0};
    vector<int> ans;
   
    helper(arr,n,0,freq,ans);
    return;

}
int main()
{
    vector<int> num = {1,2,3};
    genPermutation(num);
    return 0;

} 