package banking;

public class bank {
    public void start_banking()
    {
        Account Faria = new Account("faria" , "01778314306" , 1000, "1234");
        Faria.information();
        Faria.addmoney(1000);
        Faria.cashout(500 , "1234");
Account Maymuna = new Account("Maymuna" , "01778314506" , 500);
Maymuna.information();
Maymuna.addmoney(1000);
Maymuna.pin("4321");
Maymuna.cashout(200,"4321");
Maymuna.cashout(400,"4567");
Maymuna.cashout(4000,"4321");
}
}

