//Estructuras condicionales
//Ejercicio 12
/*Hacer un menu que considere las siguientes opciones:
caso 1: cubo de un numero
caso 2: par o impar 
caso 3: salir
*/

#include<iostream>
#include<cmath>

using namespace std;

int main(){
	int opc , x;
	
	cout<<"1. Calcular el cubo de un numero"<<endl;
	cout<<"2. Decir si un numero es par o impar"<<endl;
	cout<<"3. Salir"<<endl;
	cout<<"Opcion: ";
	cin>> opc;
	
	switch(opc){
		case 1:
			cout<<"Ingrese el valor de x: ";
			cin>> x;
			
			x = pow(x,3);
			
			cout<<"El cubo de x es: "<< x ; break;
			
		case 2:
			cout<<"Ingrese el valor de x: ";
			cin>> x;
			
			if(x % 2 == 0){
				cout<<"El numero es par";
			}else{
				cout<<"El numero es impar";
			}
			break;
			
	 	case 3: break;
	 	
	 	default: cout<<"Esa no es una opcion valida"; break;
	}
	
	
	return 0;
}