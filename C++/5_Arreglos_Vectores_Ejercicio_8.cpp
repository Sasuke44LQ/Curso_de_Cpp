//5. Arreglos o Vectores
//Ejercicio 5
/* 5. Hacer un programa que lea 5 numeros en un arreglo, los copie a otro arreglo multiplicados por 2 y muestre el segundo arreglo.
*/

#include <iostream>

using namespace std;

int main(){
    int n, n2;
    int numeros[1000];
    int numeros2[1000];
    int numeros3[1000];

    cout << "Ingrese la cantidad de elementos del arreglo: ";
    cin >> n;

    for (int i = 0; i < n; i++){
        cout << "Ingrese el elemento " << i + 1 << " :";
        cin >> numeros[i];
    }

    cout << "Ingrese la cantidad de elementos del segundo arreglo: ";
    cin >> n2;

    for (int i = 0; i < n2; i++){
        cout << "Ingrese el elemento " << i + 1 << " :";
        cin >> numeros2[i];
    }

    for (int i = 0; i < n; i++){
        numeros3[i] = numeros[i];
    }

    for (int i = n; i < (n + n2); i++){
        numeros3[i] = numeros2[i - n];
    }

    for (int i = 0; i < (n + n2); i++){
        cout << numeros3[i];
    }
    

    return 0;
}