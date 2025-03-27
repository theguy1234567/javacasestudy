# AES Encryption Tool

## 🔐 About the Project
This is a simple **AES Encryption & Decryption Tool** built in Java using the **AES (Advanced Encryption Standard)** algorithm. The application allows users to:
- Set a **16-character password** (AES-128 bit encryption).
- Encrypt text using the set password.
- Decrypt the encrypted text using the correct password.

## 📌 Features
✅ Secure **AES-based encryption**
✅ Password-protected encryption & decryption
✅ Base64 encoding for easy storage & transfer
✅ Exception handling for better error management

## 🛠️ Technologies Used
- **Java (JDK 8+)**
- **AES Encryption (Java Cryptography API)**
- **Base64 Encoding & Decoding**

## 🚀 How to Use
### 1️⃣ Clone the Repository
```bash
git clone https://github.com/yourusername/AES-Encryption-Tool.git
cd AES-Encryption-Tool
```

### 2️⃣ Compile & Run the Project
```bash
javac -d . encryption/*.java ui/*.java
java ui.Main
```

### 3️⃣ Application Workflow
1. Set a **16-character password**.
2. Choose to **Encrypt** or **Decrypt** text.
3. Enter the **correct password** for decryption.

## 📂 Project Structure
```
AES-Encryption-Tool/
│── encryption/
│   ├── AESEncryption.java  # Handles AES Encryption & Decryption
│   ├── KeyManager.java      # Manages key generation
│
│── ui/
│   ├── Main.java           # CLI-based user interface
│
│── README.md               # Project documentation
```

## 📝 Code Overview
### **AESEncryption.java** (Handles Encryption & Decryption)
```java
public static String encrypt(String text, SecretKey password) throws Exception {
    try {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Text cannot be empty.");
        }
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, password);
        byte[] encryptedBytes = cipher.doFinal(text.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    } catch (Exception e) {
        throw new Exception("Encryption failed: " + e.getMessage());
    }
}
```

### **KeyManager.java** (Generates AES SecretKey)
```java
public static SecretKey genKey(String userKey) {
    return new SecretKeySpec(userKey.getBytes(), "AES");
}
```

## 🛡️ Security Considerations
⚠️ **Do not use weak passwords. Always use a secure key storage method in real applications.**

## 📌 Future Enhancements
- Implement AES-256 encryption support.
- Create a GUI using **JavaFX/Swing**.
- Add **file encryption & decryption** functionality.

## 🏆 Contributing
Contributions are welcome! Feel free to fork this repo, make improvements, and submit a pull request. 🚀

## 📜 License
This project is open-source and available under the **MIT License**.

---
📌 **Author:** Your Name
📌 **GitHub:** [theguy1234567]

