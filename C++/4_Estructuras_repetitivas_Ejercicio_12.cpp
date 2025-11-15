//4. Estructuras Repetitivas
//Ejercicio 12
/* 12. Hacer un programa que calcule el resultado de la siguiente expresion: 1-2+3-4+5-6...n */

#include <iostream>
#include <conio.h>

using namespace std;

int main(){
    int n , suma = 0;
    
    cout << "Ingrese el numero de elementos de la suma: " ;
    cin >> n;

    for(int i = 1; i <= n; i++){
        
        if(i % 2 == 0){
            suma -= i;
        }else{
            suma += i;
        }
    }



    cout << "\nEl resultado de la suma es: " << suma << endl;


    system("pause");
    return 0;
}