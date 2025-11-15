//Expresiones
//Ejercicio 6
/* Escriba un programa que lea la nota final de cuatro alomnos y calcule la nota final media de los cuatro alumnos */

#include<iostream>

using namespace std;

int main(){
	float a, b, c, d, media = 0;
	
	cout<<"Digite la nota del primer estudiante: "; cin>>a;
	cout<<"Digite la nota del segundo estudiante: "; cin>>b;
	cout<<"Digite la nota del tercer estudiante: "; cin>>c;
	cout<<"Digite la nota del cuarto estudiante: "; cin>>d;
	
	media = (a + b + c + d) / 4;
	
	cout<<"\nLa nota media de los cuatro estudiantes es: "<<media<<endl;
	
	
	
	return 0;
}