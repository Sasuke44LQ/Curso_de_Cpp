//4. Estructuras Repetitivas
//Ejercicio 4
/* 4. Escriba un programa que tome cada 4 horas la temperatura exterior, leyendola durante 24 horas. Es decir, debe leer 6 temperaturas. Calcule la temperatura media del dia, la temperatura mas alta y la mas baja.*/

#include <iostream>
#include <conio.h>

using namespace std;

int main(){
    float temp, mayor = 0, menor = 0;
    int cant_temp;

    cout << "Ingrese la cantidad de temperaturas tomadas: ";
    cin >> cant_temp;

    for(int i = 0; i < cant_temp; i++){

        cout << "Ingrese la temperatura: ";
        cin >> temp;

        if(temp > mayor){
            mayor = temp;
        }
        else if(temp < mayor){
            menor = temp;
        }

    }

    cout << "La mayor es: " << mayor << endl;
    cout << "La menor es: " << menor << endl;

    getch();
    return 0;
}