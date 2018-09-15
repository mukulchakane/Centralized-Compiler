#include <stdio.h>
#include <iostream.h>

int main() {
 int i, j;

 asm {
   push bx;
 }
 
 for(i=0;i<10;i++) {
  j = 99 - i;
  cout << (j+1) << "\n";
 }
 return 0;
}
