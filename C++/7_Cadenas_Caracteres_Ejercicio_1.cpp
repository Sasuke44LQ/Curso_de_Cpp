//7. Cadenas de Caracteres
//Ejercicio 1
/* 1. Hacer un programa que pida al usuario que digite una cadena de caracteres, luego verificar la longitud de la cadena, y si esta supera a 10 caracteres mostrarla en pantalla, caso contrario no mostrarla. 
*/

#include <iostream>
#include <conio.h>
#include <string.h>

using namespace std;

int main(){
    char palabra[100];
    int longitud = 0;

    cout << "Ingrese una palabra: ";
    cin.getline(palabra, 100);

    longitud = strlen(palabra);

    if (longitud <= 10){
        cout << palabra;
    }
    else {

    }
    
    getch();
    return 0;
}