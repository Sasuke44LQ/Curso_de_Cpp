//4. Estructuras Repetitivas
//Ejercicio 10
/* 10. Escriba un programa que calcule el valor de: 1!+2!+3!+...+n!(suma de facotiales)*/

#include <iostream>
#include <conio.h>

using namespace std;

int main(){
    int cant, factorial = 1, suma = 0;

    cout << "Ingresa la cantidad de numeros de la sucecion: ";
    cin >> cant;

    for(int i = 1; i <= cant; i++){
        factorial = factorial * i;
        suma += factorial;
    }

    cout<< suma;

    getch();
    return 0;
}