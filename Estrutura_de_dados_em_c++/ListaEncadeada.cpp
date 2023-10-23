#include <iostream>
using namespace std;

 struct No
    {
        int num;
        No *prox;
    };
int main(){
   
    int opcao;
    int num;
    No *inicio=NULL;
    No *fim=NULL;
    No *aux =NULL;
    do{
        cout<<"Menu de operações\n";
        cout<<"1 - Add no inicio\n";
        cout<<"2 - Add no fim\n";
        cout<<"3 - remover do inicio\n";
        cout<<"4 - remover do fim\n";
        cout<<"5 - listar\n";
        cin>>opcao;
        switch (opcao)
        {
        case 1:{
            No *novoNo = new No();
            cout<<"Qual o num para add?\n";
            cin>>novoNo->num;
            if (inicio==NULL)   
            {
                inicio = fim = novoNo;
                fim->prox=NULL;
            }else{
                novoNo->prox=inicio;
                inicio=novoNo;
            }
            cout<<"Num inserido\n";            
            }break;
        case 2:{
            No *novoNo = new No();
            cout<<"Qual o num para add?\n";
            cin>>novoNo->num;
            if(inicio==NULL){
                inicio = fim = novoNo;
                fim->prox=NULL;
            }else{
                fim->prox=novoNo;
                fim=novoNo;
            }
            cout<<"Num inserido\n";
            }break;
        case 3:{
            if(inicio==NULL){
                cout<<"Lista Vazia";
            }else{
                aux=inicio;
                inicio=inicio->prox;
                cout<<aux;
            }
            }break;
        case 4:{
            if(inicio==NULL){
                cout<<"Lista Vazia";
            }else if(inicio==fim){
                inicio=fim=NULL;
            }else{
                No *anterior=NULL;
                aux=inicio;
                do
                {
                    anterior=aux;
                    aux=aux->prox;
                } while (aux!=fim);
                anterior->prox=NULL;
                fim=anterior;
                //delete(aux);
                aux=NULL;
            }
        }break;
        case 5:{
            aux=inicio;
            if(aux!=NULL){
                do
            {
               cout<<aux->num<<"->";
               aux=aux->prox;
            } while (aux!=NULL);
            cout<<"NULL"<<endl;
            }
            aux=inicio;
        }break;
        default:
            break;
        }
        cout<<&inicio<<" "<<&fim;
        cout<<"\n\n\n\n\n\n\n";
    }while (opcao!=0);    
    return 0; 


}