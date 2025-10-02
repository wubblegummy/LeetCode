#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

bool isValid(char* s) {
    int n = strlen(s);
    char *stack = (char *)malloc(n*sizeof(char));
    int top = -1;
    for (int i = 0; *(s+i) !='\0'; i++){
        char c = *(s+i);
        if (c == '(' || c=='{' || c =='['){
            if (top == n-1){
                printf("Stack Overflow!");
                 exit(0);
            }
        stack[++top] = c;
        }
        else if (c == ')' || c=='}' || c ==']'){
            if (top == -1){
                free(stack);
                return false;
            }
            char open = stack[top--];
            if ((open == '(' && c != ')') ||
                (open == '{' && c != '}') ||
                (open == '[' && c != ']')) {
                free(stack);
                return false;
        }
    }
    }
    bool balanced = (top == -1);
    free(stack);
    return balanced;
}