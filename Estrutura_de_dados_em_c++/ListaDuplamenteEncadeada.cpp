#include <iostream>
using namespace std;

 struct No
    {
        int num;
        No *proximo;
        No *anterior;
    };
int main(){   
    int opcao;
    int num;
    No *inicio=NULL;
    No *fim=NULL;
    No *aux =NULL;
    do{
        cout<<"Menu de operações\n";
        cout<<"1 - Add no fim\n";
        cout<<"2 - imprimir do inicio\n";
        cout<<"3 - imprimir do fim\n";
        cout<<"4 - remover do fim\n";
        cin>>opcao;
        switch (opcao)
        {
        case 1:{
            No *novoNo = new No();
            cout<<"Qual o num para add?\n";
            cin>>novoNo->num;
            if(inicio==NULL){
                inicio = fim = novoNo;
                fim->proximo=NULL;
                fim->anterior=NULL;
            }else{
                fim->proximo=novoNo;
                novoNo->anterior=fim;
                fim=novoNo;
            }
            cout<<"Num inserido\n";
        }break;
        case 2:{
            aux=inicio;
            cout<<"NULL <-> ";
            while (aux!=NULL)
            {
                cout<<aux->num<<" <-> ";
                aux=aux->proximo;
            }
            cout<<"NULL";
        }break;
        case 3:{
            aux=fim;
            cout<<"NULL <-> ";
            while (aux!=NULL)           
            {
                cout<<aux->num<<" <-> ";
                aux=aux->anterior;
            }
            cout<<"NULL";
            }break;
        case 4:{
            if(inicio==NULL){
                cout<<"Lista Vazia";
            }else if(inicio==fim){
                delete(inicio);
                inicio=NULL;
            }else{
                aux=fim;
                fim=fim->anterior;
                fim->proximo=NULL;
                delete(aux);
                aux=NULL;
            }
        }break;
        default:
            break;
        }
        //cout<<&inicio<<" "<<&fim;
        cout<<"\n\n\n\n\n\n\n";
    }while (opcao!=0);    
    return 0; 
}   