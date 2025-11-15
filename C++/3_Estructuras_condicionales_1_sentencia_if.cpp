//Estructuras condicionales
//La sentencia if

/* La sentencia if

	if(condicion){
		instrucciones 1;
	}
	else{
		instrucciones 2;
	}
*/

// igual( == )  diferente( != )		mayor( > )  menor( < )		menor o igual( <= )  mayor o igual( >= )

#include<iostream>

using namespace std;

int main(){
	int numero, dato = 5;
	
	cout<<"Digite un numero: "; cin>>numero;
	
	if(numero == dato){
		cout<<"Elnumero es 5";
	}
	else{
		cout<<"El numero es diferente de 5";
	}
	
	
	return 0;
}