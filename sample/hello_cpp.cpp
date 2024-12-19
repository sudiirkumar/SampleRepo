#include <iostream>
#include <cstring>

void vulnerableFunction(const char* input) {
    char buffer[10];
    strcpy(buffer, input); // Unsafe: No bounds checking
    std::cout << "Buffer content: " << buffer << std::endl;
}

int main() {
    char input[50];
    std::cout << "Enter a string: ";
    std::cin >> input; // Unsafe input handling
    vulnerableFunction(input);
    return 0;
}
