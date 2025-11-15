//6. Matrices o Tablas
//Ejercicio 2
/* 2. Realiza un programa que defina una matriz de 3x3 y escriba un ciclo para que muestre la diagonal principal de la matriz.
*/

#include <iostream>
#include <conio.h>

using namespace std;

int main(){
    int numeros[100][100], filas, columnas;

    cout << "Ingrese el numero de filas: ";
    cin >> filas;

    cout << "Ingrese el numero de colunmas: ";
    cin >> columnas;

    for (int i = 0; i < filas; i++){
        for (int j = 0; j < columnas; j++){
            cout << "Ingrese el elemento [" << i << "][" << j << "]: ";
            cin >> numeros[i][j];
        }
    }

    for (int i = 0; i < filas; i++){
        for (int j = 0; j < columnas; j++){
            if (i == j){
                cout << numeros[i][j];
            }
            else {
                cout << "0";
            }
        }
        cout << "\n";
    }

    getch();
    return 0;
}