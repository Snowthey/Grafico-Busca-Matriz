public class BuscaMatriz {
    public static int BuscaLinear(int[][] matriz){
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int menorElemento = matriz[0][0];

        int operacoes = 1;

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                if(matriz[i][j] < menorElemento){
                    menorElemento = matriz[i][j];
                }

                operacoes++;
            }
        }

        return operacoes;
    }

    public static int EsquinaSuperiorDireita(int[][] matriz){
        int operacoes = 0;
        int linha = 0;
        int coluna = matriz[0].length - 1;
        int menorElemento = matriz[linha][coluna];

        while(linha < matriz.length && coluna >= 0){
            if(matriz[linha][coluna] < menorElemento){
                menorElemento = matriz[linha][coluna];
            }

            if(coluna > 0 && matriz[linha][coluna - 1] < matriz[linha + 1][coluna]){
                coluna--;
            } else{
                linha++;
            }

            operacoes++;
        }
        return operacoes;
    }


}
