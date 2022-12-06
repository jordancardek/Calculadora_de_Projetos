

/**
 *
 * @author Jordan
 */

public class CalculadoraProjetos {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor();
        desenvolvedor.Nome = "Joaquim";
        desenvolvedor.SalarioMensalDesejado = 3000;
        
    
    System.out.println("Nome do Profissional: " + desenvolvedor.Nome);
    System.out.println("Salario Desejado: " + desenvolvedor.SalarioMensalDesejado);
    System.out.println("Quantidade de Horas Mes: " + desenvolvedor.CalcalaHorasMensais());
    //System.out.println("Valor Hora: " + desenvolvedor.CalculaValorHora());
    System.out.printf("Valor Hora: = %.2f %n",  (desenvolvedor.CalculaValorHora()));
    
    ItemSistema itemLogin = new ItemSistema();
    itemLogin.nome = "Tela de Login";
    itemLogin.complexidade = 2;
    
    ItemSistema itemGravacao = new ItemSistema();
    itemGravacao .nome = "Gravacao de Dados";
    itemGravacao .complexidade = 3;
    
    
    double valorTotal = desenvolvedor.CalculaValorHora() * itemLogin.CalculaEsforcoHoras();
    
    //Somar a quantidade de horas de todas as horas dos itens queforem levantados;
    double horasItens = itemLogin.CalculaEsforcoHoras()+ itemGravacao.EsforcoHorasGravacao();

    System.out.println("\nItem de Sistema: " + itemLogin.nome);
    System.out.println("Complexidade do Item de Sistema: " + itemLogin.complexidade);
    System.out.println("Esforco do Item de Sistema: " + itemLogin.CalculaEsforcoHoras());
    
    System.out.println("\nItem de Sistema: " + itemGravacao.nome);
    System.out.println("Complexidade do Item de Sistema: " + itemGravacao.complexidade);
    System.out.println("Esforco do Item de Sistema: " + itemGravacao.EsforcoHorasGravacao());
    
    //System.out.println("Valor total do sistema: " + valorTotal);
    System.out.printf("\nValor total do sistema: = %.3f %n",  (valorTotal));
    
    System.out.printf("\nValor total do sistema: = %.3f %n",  (horasItens));
    }
}