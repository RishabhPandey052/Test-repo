#include<iostream>
#include<vector>
using namespace std;

void print2DVector(vector<vector<int> > &v){
    for(int i = 0; i < v.size();i++){
        for(auto &j : v[i]){
            cout<<j<<" ";
        }
        cout<<"\n";
    }
    
}
void subsetHelper(vector<int> &arr,int n ,int index,vector<int> &subset,vector<vector<int> > &ans){
    
    if(index == n){
        ans.push_back(subset);
        return;
    }

    subset.push_back(arr[index]);
    subsetHelper(arr,n,index+1,subset,ans);
    subset.pop_back();
    subsetHelper(arr,n,index+1,subset,ans);
}

void allSubset(vector<int> &arr){
    int n = arr.size();
    vector<int> subset;
    vector<vector<int> > ans;
    subsetHelper(arr,n,0,subset,ans);
    print2DVector(ans);
}

vector<vector<int> > helper(vector<int> &v,int i ){

    if(i >= v.size()) return {{}};

    vector<vector<int> > partialAns = helper(v,i+1);

    vector<vector<int > > ans;
    for(vector<int> x : partialAns){
        ans.push_back(x);
    }
    for(vector<int> x : partialAns){
        vector<int> temp;
        temp.push_back(v[i]);
        for(int y : x){
            temp.push_back(y);
        }
        ans.push_back(temp);
    }

    return ans;
}

void pwset(vector<int> v){
    vector<vector<int> > ans = helper(v,0);
    print2DVector(ans);
}
int main()
{
    vector<int> arr = {1,2,3};
    allSubset(arr);
    // pwset(arr);
}