//4_Estructuras Repetitivas 
//Ejercicio 2
/* 2. Realice un programa que lea de la entrada estandar numeros hasta que se introduzca un 0. En ese momento el programa debe terminar y mostrar en la salida estandar el numero de valores mayores que cero leidos.
*/

#include <iostream>
#include <stdlib.h>

using namespace std;

int main(){
    int numero;
    int mayor = 0;
    int cont = 0;

    while (numero != 0){
        cout << "Introduzca un numero: ";
        cin >> numero;

        if(numero > 0){
            cont++;
        }
        if (numero > mayor){
            mayor = numero;
        }

    } 

    cout << "El mayor es: " << mayor << endl;
    cout << "La cantidad de elementos mayores que cero son: " << cont << endl;

    system("pause");
    return 0;
}