//4. Estructuras Repetitivas
//Ejercicio 9
/* 9. Esriba un programa que calcule el valor de: 1*2*3*...*n(factorial)*/

#include <iostream>
#include <conio.h>

using namespace std;

int main(){
    int numero, factorial = 1;

    cout << "Ingrese el valor del numero: ";
    cin >> numero;

    for(int i = 1; i <= numero; i++){
        factorial = factorial * i;
    }

    cout << "El factorial del numero es: " << factorial << endl;


    getch();
    return 0;
}