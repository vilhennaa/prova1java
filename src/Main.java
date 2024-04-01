
public class Main {

    public static void main(String[] args) {

        // Inicializando Objeto
        FolhaPagamento obj1 = new FolhaPagamento();
        // var de opção do menu
        int op;

        do {
            System.out.println("\nO que deseja fazer:\n");
            System.out.println("1: Calcular a folha de pagamento.");
            System.out.println("0: Sair.");
            op = Console.lerInt();
            if (op == 1) {
                // aplicando valores aos atributos do objeto
                System.out.println("Digite o nome do usuario:");
                obj1.setNomeF(Console.lerString());
                System.out.println("Informe o numero de horas trabalhadas:");
                obj1.setHorasT(Console.lerDouble());
                System.out.println("Informe o valor da hora trabalhada:");
                obj1.setValorHora(Console.lerDouble());
                System.out.println("");

                // mostrando salario bruto
                System.out.print("Salario bruto: ");
                System.out.print(obj1.salarioBruto());
                System.out.println("");

                // IR
                System.out.print("IR: ");
                System.out.print(obj1.ir());
                System.out.println("");

                // INSS
                System.out.print("INSS: ");
                System.out.print(obj1.inss());
                System.out.println("");

                // FGTS
                System.out.print("FGTS: ");
                System.out.print(obj1.fgts());
                System.out.println("");

                // Salario liquido
                System.out.print("Salario liquido: ");
                System.out.print(obj1.salarioLiquido());
                System.out.println("");
            }
        } while (op != 0);

    }

}
