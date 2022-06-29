#include<iostream>
#include<cstring>
using namespace std;


template<typename T>
class Node{
    public:

        string key;
        T value;
        Node *next;

        Node(string key, T value){
            this->key = key;
            this->value = value;
            next = NULL;
        }

        ~Node(){
            if(next != NULL){
                delete next;
            }
        }
};

template<typename T>
class HashTable{

    Node<T> **table;
    int currentSize;
    int tableSize;

    int hashFn(string key){
        
        int index = 0;
        int power = 1;
        for(auto ch : key){
            index = (index + ch * power ) % tableSize;
            power = (power * 29) % tableSize;
        }

        return index;
    }

    void rehash(){ // 52 , 73

        // save old pointer of old table;
        Node<T> **oldTable = table;

        // Increase the table size
        currentSize = 0;
        int oldTableSize = tableSize;
        tableSize = (2 * tableSize) + 1;
        table = new Node<T> *[tableSize];


        for(int i =0;i<tableSize;i++){
            table[i] = NULL;
        }

        // copy elements form old table to new table
        
        for(int i =0;i<oldTableSize;i++){

            Node<T>*temp = oldTable[i];
            
            while(temp != NULL){
                string key = temp->key;
                T value = temp->value;
                // happen to new table 
                insert(key,value);
                temp = temp->next;
               
            }

            // destroy ith linked list
            if(oldTable[i] !=NULL){
                delete oldTable[i];
            }

        }
        delete [] oldTable;
    }

    public:

    HashTable(int defaultSize = 7){
        currentSize = 0;
        tableSize = defaultSize;

        table = new Node<T>*[tableSize];

        for(int i =0;i<tableSize;i++){
            table[i] = NULL;
        }
    }

    void insert(string key, T value){

        if(isPresent(key).first){
            return;
        }

        int index = hashFn(key);

        Node<T>* n = new Node<T>(key,value);

        n->next  = table[index];
        table[index] = n;
        currentSize++;

        float loadFactor = currentSize/float(tableSize);
        if(loadFactor > 0.7){
            rehash();
        }

    }

    pair<bool,Node<T>* > isPresent( string key,int choice = 0){

        int index = hashFn(key);
        Node<T>* temp = table[index];
        
        while(temp != NULL){
            if(temp->key == key){

                if(choice == 0) return {true,NULL};
                else return {true,temp};
            }
            temp = temp->next;
        }

        return {false,NULL};

    }


    T search(string key){
        pair<bool,Node<int>* > p= isPresent(key,1);

        if(p.first){
            return p.second->value;
        }
        return -1;
        
    }

    T* searchFor(string key){
        int index = hashFn(key);

        Node<T> * temp = table[index];
        while(temp != NULL){
            if(temp-> key == key){
                return &temp->value;
            }
            temp = temp->next;
        }

        return NULL;
    }

    void erase(string key){

        if(isPresent(key).first){

            int index = hashFn(key);

            Node<T>* temp = table[index];
            Node<T>* prev = table[index];
            
            if(temp->key == key){
                table[index] = temp->next;
                temp->next = NULL;
                delete temp;
            }

            while(temp != NULL){
                
                if(temp->key == key){
                    prev->next = temp->next;
                    temp->next = NULL;
                    delete temp;
                }
                prev = temp;
                temp = temp->next;

            }

        } else{
            return;
        }


    }


    T& operator [] (string key){

        T* valueFound = searchFor(key);

        if(valueFound == NULL){
            T object;
            insert(key,object);
            valueFound = searchFor(key);
        }
        return *valueFound;

    }

    void print(){
        
        for(int i =0;i<tableSize;i++){
            if(table[i] == NULL) continue;
            cout<<"Bucket is  "<<i<<" ";

            Node<T> *temp = table[i];
            while (temp != NULL)
            {
               cout<<temp->key<<" "<<temp->value<<" ";
               temp = temp->next;
            }
            cout<<"\n";
            
        }
    }
};