#include <iostream>
using namespace std;

int main(){
    
    
    int n, num;
    
    int c = 0, c15 = 0, c50 = 0,  c_rango = 0;

    
    
    cout<<"Ingresa cantidad de humanos: ";
    cin>>n;
    
    cout <<endl;
    
    do {
        cout << c+1 <<" - ingresar numero: ";
        cin >> num;
        
        if(num < 15)
            c15++;
            
        if(num > 50)
            c50++;
            
        if(num >= 25 && num <= 45)
            c_rango++;
        
        c++; 
        
    } while (c < n);
    
        cout << endl;
        cout << "Menores a 15: " <<c15<<endl;
        cout << "Mayores a 50: " <<c50<<endl;
        cout << "Entre 25 y 45: " <<c_rango<<endl<<endl;
        cout << endl;
        system("pause"); return 0;
}