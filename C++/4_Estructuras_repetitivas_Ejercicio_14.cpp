//4. Estructuras Repetitivas
//Ejercicio 14
/* 14. En una clase de 5 alumnos se han realizado tres examenes y se requiere determinar el numero de: 

    Alumnos que aprobaron todo los examenes
    Alumnos que aprobaron al menos un examen 
    Alumnos que unicamente aprobaron el ultimo examen 

    Realice un programa que permita la lectura de los datos y el calculo de las estadisticas.
*/

#include <iostream>
#include <conio.h>

using namespace std;

int main(){
    int x = 0, y = 0, z = 0, est = 0;
    float nota1 = 0 , nota2 = 0 , nota3 = 0;
    float estad_aprov3 = 0 , estad_aprov1 = 0 , estad_aprov_ult = 0;

    cout << "Introduzca la cantidad de estudiantes: ";
    cin >> est;

    for (int i = 1 ; i <= est; i++){
        cout << "Ingrese la nota del estudiante " << i << " :";
        cin >> nota1;

        cout << "Ingrese la nota del estudiante " << i << " :";
        cin >> nota2;

        cout << "Ingrese la nota del estudiante " << i << " :";
        cin >> nota3;
        
        if (nota1 >= 60 && nota2 >= 60 && nota3 >= 60){
            x++;
        }else if (nota3 >= 60 && nota1 <= 60 && nota2 <= 60){
            z++;
        }else if (nota1 >= 60 || nota2 >= 60 || nota3 >= 60){
            y++;
        }else {
            
        }
    }

    estad_aprov3 = ( x * 100 ) / est;
    estad_aprov1 = ( y  * 100 ) / est;
    estad_aprov_ult =( z  * 100 )/ est;

    cout << "La cantidad de estudiantes que aprobaron las 3 asignaturas es de: " << x << endl;
    cout << "La cantidad de estudiantes que aprobaron almenos una asignatura es de: " << y  << endl;
    cout << "La cantidad de estudiantes que aprobaron solo la ultima asignatura es de: " << z << endl;

    cout << "Las estadisticas muestran que: " << endl << "El " << estad_aprov3 << "%" << " aprobo todas las asignaturas"<< endl << "El " << estad_aprov1 << "%" << " aprobo almenos una asignatura"<< endl << "El " << estad_aprov_ult << "%" << " aprobo solo la ultima asignatura"<< endl;

    getch();
    return 0;
}