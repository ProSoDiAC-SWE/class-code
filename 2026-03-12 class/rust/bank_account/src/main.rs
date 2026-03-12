struct BankAccount {
    owner: String,
    balance: f64,
}

impl BankAccount {
    fn new(owner: String, balance: f64) -> BankAccount {

        BankAccount { owner, balance }
    }

    fn owner(&self) -> &String {
        &self.owner
    }

    fn balance(&self) -> f64 {
        self.balance
    }

    fn deposit(&mut self, amount: f64) -> bool {

        if amount > 0.0 {

            self.balance += amount;

            return true;
        } else {
            return false;
        }
    }

    // Metodo per prelevare denaro
    fn withdraw(&mut self, amount: f64) -> bool {

        if amount > 0.0 && amount <= self.balance {

            self.balance -= amount;

            return true;
        } else {
            return false;
        }
    }
}

fn main() {

    // Creiamo un oggetto.
    // 'mut' serve perché modificheremo il saldo.
    let mut acc = BankAccount::new(String::from("Alice"), 100.0);

    println!("Owner: {}", acc.owner());
    println!("Balance: {}", acc.balance());

    acc.deposit(50.0);
    acc.withdraw(30.0);

    println!("Balance after operations: {}", acc.balance());
}