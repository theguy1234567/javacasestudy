# Encrypto - AES Text Encryption and Decryption

## Overview
Encrypto is a simple Java-based encryption and decryption tool designed for secure text communication. It utilizes AES (Advanced Encryption Standard) to encrypt and decrypt text with a user-defined password.

## Objectives
- Implement a secure encryption mechanism for text data.
- Provide a simple command-line interface for user interaction.
- Ensure only authorized users can decrypt the data using the correct password.

## Features
- **Set a Secure Password** (16 characters long, required for encryption and decryption)
- **AES Encryption** to protect text data
- **AES Decryption** to retrieve original text using the correct password
- **Command-Line Interface** for user interaction

## How It Works
1. **Set Password**: The user must enter a 16-character password, which is used to generate an AES key.
2. **Encrypt Text**: Users input text, which is then encrypted using the AES algorithm and stored.
3. **Decrypt Text**: To retrieve the original text, users must enter the correct password.
4. **Exit**: The program terminates securely.

## Example Usage
```
Welcome to Encrypto!
version 2.1.0

1. Set password
2. Encrypt text
3. Decrypt text
4. Exit

Select an option: 1
Enter your password (16 characters long): mysecurepassword!
Password set

Select an option: 2
Enter text to encrypt: HelloWorld123
Encrypted text: (Encrypted output displayed)

Select an option: 3
Enter password to decrypt: mysecurepassword!
Decrypted text: HelloWorld123
```

## Technical Implementation
- **Programming Language**: Java
- **Encryption Algorithm**: AES (Advanced Encryption Standard)
- **Key Management**: Uses a user-defined 16-character password to generate the encryption key.
- **User Input Handling**: Command-line interface for input and output.

## Error Handling
- If the password is not **exactly 16 characters**, the program prompts the user to re-enter it.
- If the wrong password is entered during decryption, an error message is displayed.
- If encryption or decryption fails due to an internal error, an appropriate message is shown.

## Future Enhancements
- Implement a **GUI version** using Java Swing or JavaFX.
- Extend functionality to support **file encryption**.
- Improve error handling and logging mechanisms.

## Conclusion
Encrypto provides a basic yet effective solution for securing text using AES encryption. This case study explores its implementation, emphasizing security, usability, and potential improvements for future versions.

