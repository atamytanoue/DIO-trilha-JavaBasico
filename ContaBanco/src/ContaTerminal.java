import java.util.Scanner;

class ContaTerminal {
    public static void main(String[] args) {
        
int Numero;
String Agencia;
String Nome_Cliente;
double Saldo;

Scanner leia = new Scanner(System.in);

System.out.println("=================================");
System.out.println("Seja bem vindo ao Banco Santander");
System.out.println("=================================");

System.out.println("Por favor digite o numero da agencia:");
Agencia = leia.next();
System.out.println("Por favor digite o numero da da sua conta:");
Numero = leia.nextInt();
System.out.println("Por favor digite o nome do cliente:");
Nome_Cliente = leia.next();
System.out.println("Por favor digite o valor do saldo da conta:");
Saldo = leia.nextDouble();

System.out.println("Olá "+Nome_Cliente+", obrigado por criar uma conta em nosso banco,"+
 "sua agência é "+ Agencia+", conta "+Numero+" e seu saldo "+ Saldo+" já está disponível para saque.");


    }
}