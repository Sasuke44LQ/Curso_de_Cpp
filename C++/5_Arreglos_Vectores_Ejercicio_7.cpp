//5. Arreglos o Vectores
//Ejercicio 7
/* 7. Realiza un programa que defina dos vectores de caracteres y despues almacene el contenido de ambos vectores en un nuevo vector, situando en primer lugar los elementos del primer vector seguido por los elementos del segundo vector. Muestre el contenido del nuevo vector en la salida estandar. 
*/

#include <iostream>
#include <conio.h>

using namespace std;

int main(){
    int n1, n2;
    char letras[100], letras2[100];

    cout << "Ingrese la cantidad de letras del arreglo: ";
    cin >> n1;

    for (int i = 1; i <= n1; i++){
        cout << "Ingrese una letra: ";
        cin >> letras[i];
    }

    cout << "Ingrese la cantidad de letras del segundo arreglo: ";
    cin >> n2;

    for (int i = 1; i <= n2; i++){
        cout << "Ingrese una letra: ";
        cin >> letras2[i];
    }

    for (int i = 1; i <= n1; i++){
        cout << letras[i];
    }
    for (int i = 1; i <= n2; i++){
        cout << letras2[i];
    }

    getch();
    return 0;
}