/*1. Escribe un programa q lea de la entrada estandar dos numeros y muestre
 en la salida estandar su suma, resta, multiplicacion y divicion*/
 
 #include<iostream>
 
 using namespace std;
 
 int main(){
	int n1, n2, suma = 0, resta = 0, multiplicacion = 0, divicion = 0;
	
	cout<<"digite un numero: "; cin>>n1;
	cout<<"digite otro numero: "; cin>>n2;
	
	suma = n1 + n2;
	resta = n1 - n2;
	multiplicacion = n1 * n2;
	divicion = n1 / n2;
	
	cout<<"\nLa suma es: "<<suma<<endl;
	cout<<"La resta es: "<<resta<<endl;
	cout<<"La multiplicacion es: "<<multiplicacion<<endl;
	cout<<"La divicion  es: "<<divicion<<endl;
 	
	return 0;
 }