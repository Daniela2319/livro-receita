public class ListaLivro{

public static void main (String[] args) {

    String primeiroNomeAutor = "Caíque";
    String segundoNomeAutor = "Cardoso";
    String nomeCompleto = nomeCompleto(primeiroNomeAutor, segundoNomeAutor);

    System.out.println(nomeCompleto);
    
}

public static String nomeCompleto(String primeiroNomeAutor, String segundoNomeAutor){
    return "Resultado do Método" + primeiroNomeAutor.concat(" ").concat(segundoNomeAutor);
}

}

