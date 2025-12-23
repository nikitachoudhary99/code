#include <iostream>
#include "hospital.cpp"
using namespace std;
int main()
{
    hospital h1;
    int n;
    while (true)
    {
        cout << "enter 1 to see avaible doctor" << endl;
        cout << "enter 2 for cheakup" << endl;
        cout << "enter 3 to check details" << endl;
        cout << "enter 4 when checkup is done " << endl;
        cout << "thankyou visit again" << endl;
        cout << "enter any key for exit" << endl;
        cin >> n;
        if (n == 1)
        {
            h1.avldoq();
        }
        else if (n == 2)
        {
            string n;
            int a;
            string d;
            cout << "enter patient name" << endl;
            cin >> n;
            cout << "enter patient age" << endl;
            cin >> a;
            cout << "enter patient diease" << endl;
            cin >> d;

            h1.registration(n, a, d);
        }

        else if (n == 3)
        {

            h1.patientdetail();
        }
        else if (n == 4)
        {
            string n;
            cout << "enter patient name" << endl;
            cin >> n;
            h1.checkup(n);
        }

        else
        {

            break;
        }
    }
}