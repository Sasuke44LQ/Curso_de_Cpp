//Estructuras condicionales
//Ejercicio 3
//Realice un programa que lea un valor entero y determine si se trata de un numero par o impar

#include<iostream>

using namespace std;

int main(){
    int x ;
    
    cout<<"Ingrese un valor: ";
    cin>>x;
    
    if(x % 2 == 0){
    	cout<<"El numero es par";
	}else{
		cout<<"El numero es impar";
	}

    return 0;
}
