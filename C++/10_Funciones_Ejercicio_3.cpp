//10. Funciones
//Ejercicio 3
/* 3. Escriba una funcion nombrada funpot() que evalue un numero entero que se le transmita a una potencia en numero entero positivo y despliegue el resultado. El numero entero positivo debera ser el segundo valor transmitido a la funcion. */

#include <iostream>
#include <conio.h>
#include <cmath>

using namespace std;

int numero , exponente;

void pedirDatos(){
    cout << "Digite un numero: ";
    cin >> numero;
    cout << "Digite el exponente de elevacion: ";
    cin >> exponente;
}

void funpot(int x, int y){
    long resultado = 1;
    for (int i = 1; i <= y ; i++){
        resultado *= x;
    }

    cout << "El resultado es: " << resultado;
}

int main(){

    pedirDatos();
    funpot(numero, exponente);



    getch();
    return 0;
}