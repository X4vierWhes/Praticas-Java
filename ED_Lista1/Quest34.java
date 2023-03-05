public class Quest34 {
    public static void main(String[] args) {
        String texto = "Eu eu eu tu tu tu nos bota";
        String[] palavras = texto.split(" ");
        int[] contagemPalavras = new int[palavras.length];

        for (int i = 0; i < palavras.length; i++) {
            String aux = palavras[i];

            int contagem = 0;
            for (int j = 0; j < palavras.length; j++) {
                if (palavras[j].equalsIgnoreCase(aux)) {
                    contagem++;
                }
            }
            contagemPalavras[i] = contagem;
        }

        String saida = "";

        for (int i = 0; i < palavras.length; i++) {
            if (contagemPalavras[i] > 0) {
                if (!palavras[i].equals(" ")) {
                    saida += palavras[i] + " = " + contagemPalavras[i] + "\n";
                    contagemPalavras[i] = 0;
                }
                for (int j = i + 1; j < palavras.length; j++) {
                    if (palavras[j].equalsIgnoreCase(palavras[i])) {
                        palavras[j] = " ";
                    }
                }
            }
        }
        System.out.println(saida);

    }

}
