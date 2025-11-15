//4. Estructuras Repetitivas
//Ejercicio 16
/* 16. Realice un programa que calcule la descomposicion en factores primos de un numero entero

Por ejemplo: 20 - 2*2*5 
*/

#include <iostream>
#include <conio.h>

using namespace std;

int main(){
    int num = 20;

    cout << "Ingrese un numero: ";
    cin >> num;

    for (int i = 2; i <= num ; i++){
        
        while (num % i == 0){
            cout << i << " ";
            num /= i;
        }

    }

    getch();
    return 0;
}