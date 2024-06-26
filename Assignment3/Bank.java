public abstract class Bank {
    public abstract double getBalance();
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();
        

        System.out.println("Balance in Bank A: $" + bankA.getBalance());
        System.out.println("Balance in Bank B: $" + bankB.getBalance());
        System.out.println("Balance in Bank C: $" + bankC.getBalance());
    }
}

class BankA extends Bank {
    double balance = 100;

    @Override
    public double getBalance() {
        return balance;
    }
}

class BankB extends Bank {
    double balance = 150;

    @Override
    public double getBalance() {
        return balance;
    }
}

class BankC extends Bank {
    double balance = 200;

    @Override
    public double getBalance() {
        return balance;
    }
}


   

