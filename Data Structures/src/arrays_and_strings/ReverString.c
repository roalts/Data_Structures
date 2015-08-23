#include <stdio.h>

void reverse(char* str) {

  char* end = str;
  while(*end) {
    end++;
  }
  end--;
  char* temp;
  while(str < end) {
    *temp = *str;
    *str = *end;
    *end = *str;
    str++;
    end--;
  }
}
int main() {

  char* temp = "Raghav";
  reverse(temp);
  printf("%s", temp);
  printf("\n");

  return 0;
}
