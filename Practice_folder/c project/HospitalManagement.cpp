#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Hospital {
public:
    string name, city, contact, doctor;
    int beds, price;
    float rating;

    void input() {
        cout << "Enter Hospital Name: ";
        cin >> name;
        cout << "Enter City: ";
        cin >> city;
        cout<<endl;
        cout << "Enter Beds Available: ";
        cin >> beds;
        cout << "Enter Rating: ";
        cin >> rating;
        cout << "Enter Contact: ";
        cin >> contact;
        cout << "Enter Doctor Name: ";
        cin >> doctor;
        cout << "Enter Bed Price: ";
        cin >> price;
    }

    void display() {
        cout << name << " | " << city << " | Beds: " << beds
             << " | Rating: " << rating << " | Price: " << price
             << " | Doctor: " << doctor << " | Contact: " << contact << endl;
    }
};

class Patient {
public:
    string name, contact;
    int id;
    string assigned_hospital;
    int total_cost;

    void input() {
        cout << "Enter Patient Name: ";
        cin >> name;
        cout << "Enter Patient ID: ";
        cin >> id;
        cout << "Enter Contact: ";
        cin >> contact;
    }

    void display() {
        cout << name << " | ID: " << id << " | Contact: " << contact
             << " | Hospital: " << assigned_hospital
             << " | Cost: " << total_cost << endl;
    }
};

vector<Hospital> hospitals;
vector<Patient> patients;

void addHospital() {
    Hospital h;
    h.input();
    hospitals.push_back(h);
    cout << "Hospital added successfully!\n";
}

void addPatient() {
    Patient p;
    p.input();
    patients.push_back(p);
    cout << "Patient added successfully!\n";
}

void assignHospitalToPatient() {
    int pid;
    cout << "Enter Patient ID to assign hospital: ";
    cin >> pid;
    for (auto &p : patients) {
        if (p.id == pid) {
            cout << "Available Hospitals:\n";
            for (int i = 0; i < hospitals.size(); i++) {
                cout << i + 1 << ". ";
                hospitals[i].display();
            }
            int choice;
            cout << "Enter hospital number to assign: ";
            cin >> choice;
            if (choice >= 1 && choice <= hospitals.size()) {
                p.assigned_hospital = hospitals[choice - 1].name;
                p.total_cost = hospitals[choice - 1].price;
                cout << "Assigned successfully!\n";
            } else {
                cout << "Invalid choice.\n";
            }
            return;
        }
    }
    cout << "Patient not found.\n";
}

void searchHospitalByCity() {
    string city;
    cout << "Enter city to search hospitals: ";
    cin >> city;
    cout << "\nHospitals in " << city << ":\n";
    for (auto &h : hospitals) {
        if (h.city == city) h.display();
    }
}

void sortHospitalsByRating() {
    sort(hospitals.begin(), hospitals.end(), [](Hospital &a, Hospital &b) {
        return a.rating > b.rating;
    });
    cout << "Hospitals sorted by rating:\n";
    for (auto &h : hospitals) h.display();
}

void sortHospitalsByPrice() {
    sort(hospitals.begin(), hospitals.end(), [](Hospital &a, Hospital &b) {
        return a.price < b.price;
    });
    cout << "Hospitals sorted by bed price:\n";
    for (auto &h : hospitals) h.display();
}

void showAllData() {
    cout << "\n--- All Patients ---\n";
    for (auto &p : patients) p.display();
    cout << "\n--- All Hospitals ---\n";
    for (auto &h : hospitals) h.display();
}

int main() {
    int choice;
    do {
        cout << "\n--- Hospital Management Menu ---\n";
        cout << "1. Add Hospital\n2. Add Patient\n3. Assign Hospital to Patient\n";
        cout << "4. Search Hospital by City\n5. Sort Hospitals by Rating\n";
        cout << "6. Sort Hospitals by Bed Price\n7. Show All Data\n0. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1: addHospital(); break;
            case 2: addPatient(); break;
            case 3: assignHospitalToPatient(); break;
            case 4: searchHospitalByCity(); break;
            case 5: sortHospitalsByRating(); break;
            case 6: sortHospitalsByPrice(); break;
            case 7: showAllData(); break;
            case 0: cout << "Exiting...\n"; break;
            default: cout << "Invalid choice.\n";
        }
    } while (choice != 0);

    return 0;
}
