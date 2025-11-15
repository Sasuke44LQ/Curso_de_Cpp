//5. Arreglos o Vectores
//Ejercicio 4
/* 4. Escribe un programa que defina un vector de numeros y muestre en la salida estandar el vector en orden inverso del ultimo al primer elemento. 
*/

#include <iostream>
#include <conio.h>

using namespace std;

int main(){
    int n;
    int numeros[n];

    cout << "Ingrese el tamano del vector: ";
    cin >> n;

    for (int i = 0; i < n; i++){
        cout << "Ingresa los valores: ";
        cin >> numeros[i];
    }

    for (int i = n - 1; i >= 0; i--){
        cout << "Los numeros son: " << numeros[i] << endl;
    }


    getch();
    return 0;
}