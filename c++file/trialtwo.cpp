#include <iostream>
using namespace std;

int main()

{
 int divisor,dividend,quotient,remainder;

cout << "enter the dividend:";
cin >> dividend;

cout << "enter the divisor";
cin >> divisor;

quotient= dividend/divisor;
remainder=dividend % divisor;

cout <<"quotient=" << quotient << endl;
cout << "remiander=" << remainder;

return 0;
}
