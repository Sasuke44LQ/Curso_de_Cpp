//5. Arreglos o Vectores
//Ejercicio 6
/* 6. Escribe un programa que defina un vector de numeros y calcule si existe algun numero en el vector cuyo valor equivale a la suma del resto de numeros del vector. 
*/

#include <iostream>
#include <conio.h>

using namespace std;

int main(){
    int n, numeros[n] , suma = 0;
    int mayor = 0;

    cout << "Digite la cantidad de elementos del vector: ";
    cin >> n;

    for (int i = 0; i < n; i++){
        cout << "Ingrese un numero: ";
        cin >> numeros[i];

        suma += numeros[i];

        if (numeros[i] > mayor){
            mayor = numeros[i];
        }
    }

    if (mayor == suma - mayor){
        cout << "El numero " << mayor << " es la suma de los demas";
    }
    else {
        cout << "No existe ningun numero que sea la suma de los demas";
    }

    getch();
    return 0;
}