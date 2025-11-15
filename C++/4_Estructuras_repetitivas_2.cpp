//4. Estructuras Repetitivas
/*La sentencia do while

    do{
        conjunto de indtrucciones;
    }while(expresión lógica);

*/

#include <iostream>
#include <stdlib.h>

using namespace std;

int main(){
    int i;

    i = 1;

    do{
        cout<<i<<endl;
        i++;//aumentar el iterador de uno en uno
    }while(i<=10);

    system("pause");
    return 0;
}