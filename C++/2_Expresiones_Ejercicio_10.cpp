//Expresiones 
//Ejercicio 10
/* Escriba un programa que calcule las soluciones de una ecuacion de segundo grado de la formula ax^2 + bx + c = 0 
teniendo en cuenta que: */

#include<iostream>
#include<math.h>
#include<cmath>

using namespace std;

int main(){
	float a, b, c, x1 = 0 , x2 = 1;
	
	cout<<"Digite el valor de a: "; 
	cin>>a;
	cout<<"Digite el valor de b: "; 
	cin>>b;
	cout<<"Digite el valor de c: "; 
	cin>>c;
	
	x1 = (-(b) + (sqrt(pow(b,2)) - (4*a*c))) / (2*a);
	x2 = (-(b) - (sqrt(pow(b,2)) - (4*a*c))) / (2*a);
	
	
	cout<< x1 <<endl;
	cout<< x2 <<endl;
	
	return 0;
}