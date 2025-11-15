//Estructuras condicionales
//Ejercicio 4
//Comprobar si un numero digitado por el usiario es positivo o negativo

#include<iostream>

using namespace std;

int main(){
	int x;
	
	cout<<"Ingresa un numero: ";
	cin>>x;
	
	if(x > 0){
		cout<<"El numero es positivo";
	}else if(x == 0){
		cout<<"El numero es 0";
	}else {
		cout<<"El numero es negativo";
	}
	
	
	return 0;
}