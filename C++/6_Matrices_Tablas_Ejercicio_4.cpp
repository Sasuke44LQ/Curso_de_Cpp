//6. Matrices o Tablas
//Ejercicio 4
/* 4. Hacer una matriz preguntando al usuario el numero de filas y columnas, llenarla de numeros aleatorios, copiar el contenido a otra matriz y por ultimo mostrarla en pantalla.
*/

#include <iostream>
#include <conio.h>

using namespace std;

int main(){
    int n, filas, columnas;
    int matriz[100][100];
    int matriz2[100][100];

    cout << "Diga la cantidad de filas: ";
    cin >> filas;

    cout << "Diga la cantidad de columnas: ";
    cin >> columnas;

    for (int i = 0; i < filas; i++){
        for (int j = 0; j < columnas; j++){
            cout << "Ingrese los elementos: ";
            cin >> matriz[i][j];
        }
    }

    for (int i = 0; i < filas; i++){
        for (int j = 0; j < columnas; j++){
            matriz2[i][j] = matriz[i][j];
        }
    }

    for (int i = 0; i < filas; i++){
        for (int j = 0; j < columnas; j++){
            cout << matriz2[i][j];
        }
        cout << "\n";
    }

    getch();
    return 0;
}