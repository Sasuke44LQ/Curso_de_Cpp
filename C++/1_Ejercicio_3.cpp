//Ejercicio 3
/*3. Realice un programa q lea de la entrada estandar los siguientes datos de 
una persona:

	Edad: dato de tipo entero
	Sexo: dato de tipo caracter 
	Altura en metros: dato de tipo real
	
Tras leer los datos, el programa debe mostrarlos en la salida esrandar */

#include<iostream>

using namespace std;

int main(){
	int edad;
	char sexo[10];
	float altura;
	
	cout<<"Digite su edad: "; cin>>edad;
	cout<<"digite su sexo: "; cin>>sexo;
	cout<<"digite su altura en metros: "; cin>>altura;
	
	cout<<"\nEdad: "<<edad<<endl;
	cout<<"Sexo: "<<sexo<<endl;
	cout<<"Altura: "<<altura<<endl;
	
	
	
	return 0;
}
