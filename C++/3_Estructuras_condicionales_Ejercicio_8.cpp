//Estructuras condicionales
//Ejercicio 8
//Escribe un programa que lea de la entrada estandar tres numeros. Despues debe leer un cuarto numero e indicar si el numero coincide con alguno de los introducidos con anterioridad

#include<iostream>

using namespace std;

int main(){
	int x , y , z , w;
	
	cout<<"Digite tres valores: "<<endl;
	cin>> x >> y >> z;
	cout<<"Ingrese un cuarto valor para ser comparado: ";
	cin>> w;
	
	if(w == x){
		cout<<"La variable si coincide con una de las anteriores";
	}else if(w == y){
		cout<<"La variable si coincide con una de las anteriores";
	}else if(w == z){
		cout<<"La variable si coincide con una de las anteriores";
	}else{
		cout<<"La variable no coincide con las anteriores";
	}
	
	return 0;
}