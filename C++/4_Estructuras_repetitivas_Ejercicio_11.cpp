//4. Estructuras Repetitivas
//Ejercicio 11
/* 11. Escriba un programa que calcule el valor de: 2^1+2^2+2^3+...+2^2 */

#include <iostream>
#include <stdlib.h>
#include <math.h>

using namespace std;

int main(){
    int suma = 0 , elevacion = 0, n;

    cout << "Digite el numero de elementos de la suma: ";
    cin >> n;

    for(int i = 1; i <= n; i++){
        elevacion = pow(2,i);
        suma += elevacion;
    }

    cout << "\nLa suma total es: " << suma << endl;

    
    system("pause");
    return 0;
}