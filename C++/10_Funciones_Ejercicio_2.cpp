//10. Funciones
//Ejercicio 2
/* 2. Escriba una funcion llamada al_cuadrado() que calcule el cuadrado del valor que se le transmite y despliegue el resultado. La funcion debera de ser capaz de elevar al cuadrado numeros flotantes. */

#include <iostream>
#include <conio.h>
#include <cmath>

using namespace std;

float al_cuadrado(float x){
    int cuadrado;

    cuadrado = pow(x ,2);

    return cuadrado;
}

int main(){
    float x = 0;

    cout << "Ingrese un numero: " ;
    cin >> x;

    cout << al_cuadrado(x);
    

    getch();
    return 0;
}