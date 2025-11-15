//10. Funciones
//Ejercicio 1
/* 1. Escriba una funcion llamada mult() que acepte dos numeros en punto flotante como parametros, multiplique estos dos numeros y despliegue el resultado. */

#include <iostream>
#include <conio.h>

using namespace std;

//Prototipos de funciones
void pedirDatos();
void mult(float x, float y);

float num1, num2;

int main(){

    pedirDatos();
    mult(num1 , num2);

    
    getch();
    return 0;
}

void pedirDatos(){
    
    cout << "Digite 2 numeros: ";
    cin >> num1 >> num2;

}

void mult(float x, float y){
    float mult = x * y;

    cout << "La multiplicacion es: " << mult << endl;
}