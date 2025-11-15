//Estructuras Repetitivas
//Ejercicio 6
/* 6. Escriba un programa que calcule x^y, donde tanto x como y son enteros positivos, sin utilizar la funcion pow.*/

#include <iostream>
#include <conio.h>

using namespace std;

int main(){
    int x, y, valor;

    cout << "Ingrese el valor de x: ";
    cin >> x;
    cout << "Ingrese el valor de y: ";
    cin >> y;

    valor = x;

    for(int i = 1; i < y; i++){
        x = valor * x;
        cout << x << endl;
    }


    getch();
    return 0;
}