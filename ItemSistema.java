/**
 *
 * @author Jordan
 */

public class ItemSistema {
    public String nome;
    public int complexidade;
    public int teste;

    public int CalculaEsforcoHoras() {
        switch (complexidade) {
            case 1:
                return 8;
            case 2:
                return 12;
            case 3:
                return 16;               
            default:
               return -1;
        }  
                  
    }
    public int EsforcoHorasConsultasDeDados(){
        switch (complexidade){
            case 1:
                return 4;
            case 2:
                return 6;
            case 3:
                return 8;
            default:
               return -1;
         } 
    }
    
    public int EsforcoHorasGravacao(){
        switch (complexidade){
            case 1:
                return 16;
            case 2:
                return 24;
            case 3:
                return 36;
            default:
               return -1;
         } 
    } 
     
}

