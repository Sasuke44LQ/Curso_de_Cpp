//Expresiones
//Ejercicio 8
/* Escriba un programa q lea de la entrada estandar los dos catetos de un triangulo rectangulo y escriba en la salida estandar su hipotenusa */

#include<iostream>
#include<math.h>
using namespace std;

int main(){
	float a, b, hipotenusa = 0;
	
	cout<<"Digite la longitud del cateto 1: "; cin>>a;
	cout<<"Digite la longitod del cateto 2: "; cin>>b;
	
	hipotenusa = sqrt(pow(a, 2) + pow(b, 2));
	
	
	cout.precision(3);
	cout<<"La hipotenusa es: "<<hipotenusa<<endl;
	
	
	return 0;
}