//4. Estructuras Repetitivas
//Ejercicio 8
/* 8. Escriba un programa que calcule el valor de: 1+3+5+...+2n-1*/

#include <iostream>
#include <conio.h>

using namespace std;

int main(){
    int n, suma = 0;

    cout << "Ingrese un numero: ";
    cin >> n;

    for(int i = 1; i <= n; i++){
        suma += (2*i - 1);
        cout << suma << endl;
    }

    
    getch();
    return 0;
}