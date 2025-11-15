//Estructuras condicionales 
//Ejercicio 2 
//Escriba un programa que lea tres numeros y diga cual de ellos es el mayor

#include<iostream>

using namespace std;

int main(){
	int x , y , z ;
	
	cout<<"Digite el valor de x: ";
	cin>>x;
	cout<<"Digite el valor de y: ";
	cin>>y;
	cout<<"Digite el valor de z: ";
	cin>>z;
	
	if (x > y && x > z){
		cout<<"El mayor es: "<<x;
	}else if (y > x && y > z){
		cout<<"El mayor es: "<<y;
	}else if (z > x && z > y){
		cout<<"El mayor es: "<<z;
	}else{
		cout<<"Su operacion no es valida";
	}
	
	
	
    return 0;
}
