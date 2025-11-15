//6. Matrices o Tablas
//Ejercicio 8
/* 8. Realice un programa que calcule el producto de dos matrices cuadradas de 3x3. 
*/

#include <iostream>
#include <conio.h>

using namespace std;

int main(){
    int filasA, columnasA;
    int filasB, columnasB;
    int A[100][100];
    int B[100][100];
    int C[100][100];

    cout << "Ingrese la cantidad de filas de A: ";
    cin >> filasA;
    cout << "ingrese la cantidad de columnas de A: ";
    cin >> columnasA;

    for (int i = 0; i < filasA; i++){
        for (int j = 0; j < columnasA; j++){
            cout << "Ingrese el valor de [" << i << "][" << j << "]: ";
            cin >> A[i][j];
        }
    }

    cout << "Ingrese la cantidad de filas de B: ";
    cin >> filasB;
    cout << "Ingrese la cantidad de columnas de B: ";
    cin >> columnasB;

    for (int i = 0; i < filasB; i++){
        for (int j = 0; j < columnasB; j++){
            cout << "Ingrese el valor de [" << i << "][" << j << "]: ";
            cin >> B[i][j];
        }
    }

    //Mostrar matrices 
    cout << "\nMatriz A:\n";
    for (int i = 0; i < filasA; i++){
        for (int j = 0; j < columnasA; j++){
            cout << A[i][j] << " ";
        }
        cout << endl;
    }

    cout << "\nMatriz B:\n";
    for (int i = 0; i < filasB; i++){
        for (int j = 0; j < columnasB; j++){
            cout << B[i][j] << " ";
        }
        cout << endl;
    }

    if(columnasA == filasB){

    for (int i = 0; i < filasA; i++){
        for (int j = 0; j < columnasB; j++){
            for (int k = 0; k < columnasA; k++){
                C[i][j] += A[i][k] * B[k][j];
            }
        }
    }

    cout << "\nMatriz resultado:\n";
    for (int i = 0; i < columnasB; i++){
        for (int j = 0; j < filasA; j++){
            cout << C[i][j] << " ";
        }
        cout << "\n";
    }

    }
    else {
        cout << "No se puede multiplicar";
    }

    getch();
    return 0;
}