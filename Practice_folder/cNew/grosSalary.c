/*accept basic salary from user if basic salry is between 0 and 1000 then TA is 10% of basic salary DA is 5% of basic salry if salary is above 10000 
then TA is 12% of basic salary DA is 6% of basic now calculate gross salary as gs=basic+TA+DA;

Bs<10000,pf=12% of bs,HRA=20% of bs,DA=50%of bs,netSAl=bs+hra+DA;
gs=net sal-pf;
*/
#include <stdio.h>

int main() {
    
    float basic_salary, TA, DA, HRA, PF, net_salary, gross_salary;

    printf("Enter the Basic Salary: ");
    scanf("%f", &basic_salary);

    if (basic_salary < 10000) {
        TA = 0.12 * basic_salary;
        DA = 0.06 * basic_salary;
        HRA = 0.20 * basic_salary;
        
        net_salary = basic_salary + HRA + (0.50 * basic_salary);
        PF = 0.12 * basic_salary;

        gross_salary = net_salary - PF;
        
         printf("Gross Salary %.2f\n", gross_salary);
        printf("Net Salary  %.2f\n", net_salary);
        printf(" PF %.2f\n", PF);
    }
    else if (basic_salary >= 10000 && basic_salary <= 30000) {

        TA = 0.12 * basic_salary;
        DA = 0.40 * basic_salary;
        HRA = 0.15 * basic_salary;

        net_salary = basic_salary + HRA + DA;
        PF = 0.15 * basic_salary;

        gross_salary = net_salary - PF;
        
        printf("Gross Salary %.2f\n", gross_salary);
        printf("Net Salary  %.2f\n", net_salary);
        printf(" PF %.2f\n", PF);
    }
    else if (basic_salary > 30000 && basic_salary <= 50000) {

        TA = 0.12 * basic_salary;
        DA = 0.30 * basic_salary;
        HRA = 0.12 * basic_salary;
        net_salary = basic_salary + HRA + DA;
        PF = 0.17 * basic_salary;
        
        gross_salary = net_salary - PF;
        
         printf("Gross Salary %.2f\n", gross_salary);
        printf("Net Salary  %.2f\n", net_salary);
        printf(" PF %.2f\n", PF);
    }
    else {
    
        TA = 0.12 * basic_salary;
        DA = 0.25 * basic_salary;
        HRA = 0.10 * basic_salary;
        net_salary = basic_salary + HRA + DA;
        PF = 0.20 * basic_salary;
        
        gross_salary = net_salary - PF;
        
        printf("Gross Salary %.2f\n", gross_salary);
        printf("Net Salary  %.2f\n", net_salary);
        printf(" PF %.2f\n", PF);
    }

    return 0;
}
