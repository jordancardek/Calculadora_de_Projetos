class Desenvolvedor {
    public String Nome;
    public double SalarioMensalDesejado;
    public double FHD = 7; // 7 horas por dia
    public double diasUteisMensaisPadrao = 20; // 20 dias do mês

    public double CalcalaHorasMensais() {
         return FHD * diasUteisMensaisPadrao;
     }

     public double CalculaValorHora() {
         return (SalarioMensalDesejado * 2) / CalcalaHorasMensais();
    }
}
