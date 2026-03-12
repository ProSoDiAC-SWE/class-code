# BankAccount Example

Esempio semplice della classe `BankAccount` implementata in **Java**, **Kotlin** e **Rust**.

## Java

Compilare:

```bash
javac BankAccount.java
```

Eseguire:

```bash
java BankAccount
```

## Kotlin

Compilare:

```bash
kotlinc BankAccount.kt -include-runtime -d BankAccount.jar
```

Eseguire:

```bash
java -jar BankAccount.jar
```

## Rust

### Con Cargo (consigliato)

Creare progetto:

```bash
cargo new bank_account
cd bank_account
```

Sostituire `src/main.rs` con il codice dell'esempio.

Eseguire:

```bash
cargo run
```

### Senza Cargo

Compilare:

```bash
rustc main.rs
```

Eseguire:

```bash
./main
```
