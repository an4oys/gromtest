package lesson5;

public class BankAccount {
    public static void main(String[] args) {
        String[] clients = {"Sara", "Mia", "Lika", "Miron", "Nick", "Masha"}; {
            int[] balances = {0, -18, 900, 787, 560, 977};
            System.out.println(withdraw(clients, balances, "Masha", 1000)); }
    }

    public static int withdraw (String [] clients, int [] balances, String client, int amount) {
        int clientIndex = findClient(clients, client);
        if (balances [clientIndex] < amount)
            return -1;

        balances [clientIndex] -= amount;
        return balances [clientIndex];
    }
    public static int findClient (String[] clients, String client) {
        int clientIndex = 0;
        for (String person : clients) {
            if (person == client) {
                break;
            }
            clientIndex++;
        }
        return clientIndex;
    }
}
