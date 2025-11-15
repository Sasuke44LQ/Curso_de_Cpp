//Ejercicio 2
/*Escribe un programa q lea de la entrada estandar el precio de un producto y muestre en la salida estandar el precio del producto al aplicarle el IVA */

#include<iostream>

using namespace std;

int main(){
	float producto = 0, IVA = 0, producto_final = 0, precio_final = 0;
	
	cout<<"Digite el precio del producto: "<<endl; cin>>producto;
	cout<<"Digite el valor del IVA: "<<endl; cin>>IVA;
	
	producto_final = producto * (IVA / (100 + IVA));
	
	precio_final = producto_final + producto;
	
	cout<<"El precio del IVA es: "<<producto_final<<endl;
	cout<<"El precio final del producto es: "<<precio_final;
	
	return 0;
}