//6. Matrices o Tablas
//Ejercicio 6
/* 6. Realice un programa que calcule la suma de dos matrices cuadradas de 3x3.
*/

#include <iostream>
#include <conio.h>

using namespace std;

int main(){
    int filas , columnas;
    int matriz1[100][100];
    int matriz2[100][100];
    int matrizC[100][100];

    cout << "Introduzca las dimenciones de la matriz A: ";
    cin >> filas;

    columnas = filas;

    for (int i = 0; i < filas; i++){
        for (int j = 0; j < columnas; j++){
            cout << "Introduzca los valores: ";
            cin >> matriz1[i][j];
        }
    }

    cout << "Introduzca las dimenciones de la matriz B: ";
    cin >> filas;

    for (int i = 0; i < filas; i++){
        for (int j = 0; j < columnas; j++){
            cout << "Introduzca los valores: ";
            cin >> matriz2[i][j];
        }
    }

    for (int i = 0; i < filas; i++){
        for (int j = 0; j < columnas; j++){
            matrizC[i][j] = matriz1[i][j] + matriz2[i][j];
        }
    }

    for (int i = 0; i < filas; i++){
        for (int j = 0; j < columnas; j++){
            cout << matrizC[i][j] << " ";
        }
        cout << "\n";
    }


    getch();
    return 0;
}