#include <iostream>
#include <ctime>
#include <cstdlib>
using namespace std;

int main()
{
   srand(time(0));

   int num = rand()%5;

   cout<<num;
}
