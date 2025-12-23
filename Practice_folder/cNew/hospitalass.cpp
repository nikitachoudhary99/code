#include <iostream>
using namespace std;
class patient
{
public:
    string name;
    int age;
    string diease;
    bool active;
    string doctorname;
    int payment;
};

class doctor
{
public:
    string name;
    string spl;
    bool present;
    int fees;
};
class hospital
{
    patient regis[10];
    doctor doqinfo[5];
    int count;

public:
    hospital()
    {
        count = 0;
        for (int i = 0; i < 5; i++)
        {
            cout << "enter" << i + 1 << "doctor name" << endl;
            cin >> doqinfo[i].name;
            cout << "enter" << i + 1 << "doctor spl" << endl;
            cin >> doqinfo[i].spl;
            cout << "enter" << i + 1 << "doctor fees" << endl;
            cin >> doqinfo[i].fees;
            doqinfo[i].present = true;
        }
    }

    void avldoq();
    void registration(string n, int a, string d);
    void patientdetail();
    void checkup(string n);
};
void hospital::checkup(string n)
{
    for (int i = 0; i < count; i++)
    {
        if (regis[i].name == n)
        {
            regis[i].active = false;

            for (int j = 0; j < 5; j++)
            {
                if (doqinfo[j].name == regis[i].doctorname)
                {
                    doqinfo[j].present = true;
                    cout << "thank you visit again " << endl;
                    cout << endl;
                    cout << endl;
                    return;
                }
            }
        }
    }
    cout << "no such patient available" << endl;
}
void hospital::patientdetail()
{
    if (count == 0)
    {
        cout << "no patient is active for checkup" << endl;
        return;
    }
    cout << endl;
    cout << endl;

    for (int i = 0; i < count; i++)
    {

        cout << "patient name\t" << regis[i].name << endl;
        cout << "patient age\t" << regis[i].age << endl;
        cout << "patient diease\t" << regis[i].diease << endl;
        cout << " attandin docter name\t" << regis[i].doctorname << endl;
        cout << " attandent docter fees\t" << regis[i].payment << endl;
    }
}

void hospital::registration(string n, int a, string d)
{
    // regis[count].name=n;
    // regis[count].age=a;
    // regis[count].diease=d;
    // regis[count].active=true;
    for (int i = 0; i < 5; i++)
    {
        if (doqinfo[i].present == true && doqinfo[i].spl == d)
        {
            regis[count].name = n;
            regis[count].age = a;
            regis[count].diease = d;
            regis[count].active = true;
            regis[count].doctorname = doqinfo[i].name;
            regis[count].payment = doqinfo[i].fees;
            doqinfo[i].present = false;
            count++;
            cout << "registration sucessful please visit " << endl;
            return;
        }
    }

    cout << "doctor unavailable sorry for the inconviniance" << endl;
}
void hospital::avldoq()
{
    cout << endl;
    cout << endl;
    cout << endl;
    cout << endl;

    cout << "list of avl doc" << endl;
    cout << endl;
    cout << "name\tspeciality\t fees" << endl;
    cout << endl;

    for (int i = 0; i < 5; i++)
    {
        if (doqinfo[i].present == true)
        {
            cout << doqinfo[i].name << "\t" << doqinfo[i].spl << "\t" << doqinfo[i].fees << endl;
        }
    }
}
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
