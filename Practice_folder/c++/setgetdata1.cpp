
#include<iostream>
using namespace std;

class student {
    string Name;
    int Age;
    long int Phone;
    string Address;
    string Gmail;
    float Graduationper;

public:
    void setName(string n);
    void setAge(int age);
    void setPhone(long int ph);
    void setAddress(string add);
    void setGmail(string mail);
    void setGraduationper(float per);
    void getData();
};

void student::setName(string n) {
    Name = n;
}

void student::setAge(int a) {
    Age = a;
}

void student::setPhone(long int ph) {
    Phone = ph;
}

void student::setAddress(string add) {
    Address = add;
}

void student::setGmail(string mail) {
    Gmail = mail;
}


void student::setGraduationper(float per) {
    Graduationper = per;
}

void student::getData() {
    cout << "Name: " << Name << endl;
    cout << "Age: " << Age << endl;
    cout << "Phone: " << Phone << endl;
    cout << "Address: " << Address << endl;
    cout << "Gmail: " << Gmail << endl;
    cout << "Graduation Percentage: " << Graduationper << endl;
}

int main() {
    student arr[6];  
    string n;
    int a;
    long int ph;
    string add;
    string mail;
    float per;

    
    for (int i = 0; i < 6; i++) {
        cout << "Enter details for student " << i <<endl ;
        cout << "Enter Name ";
        cin >> n;
        arr[i].setName(n);

        cout << "Enter Age ";
        cin >> a;
        arr[i].setAge(a);

        cout << "Enter Phone Number ";
        cin >> ph;
        arr[i].setPhone(ph);

        cout << "Enter Address ";
        cin >> add;
        arr[i].setAddress(add);

        cout << "Enter Gmail ";
        cin >> mail;
        arr[i].setGmail(mail);

        cout << "Enter Graduation Percentage ";
        cin >> per;
        arr[i].setGraduationper(per);
    }


    for (int i = 0; i < 6; i++) {
        cout << "\nDetails of student " << i + 1 << endl;
        arr[i].getData();
    }

    return 0;
}
