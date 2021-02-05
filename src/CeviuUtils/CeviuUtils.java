/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */package CeviuUtils;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import models.dadosDeExecucao;
import java.lang.Math;

/**
 *
 * @author jvcla
 */
public class CeviuUtils {

    public dadosDeExecucao handleFile(String nomeArquivo) {
        try {
            dadosDeExecucao data = new dadosDeExecucao();
            int numeroLinha = 1;
            //Lê o arquivo
            File myObj = new File(nomeArquivo);

            //Lê o que esta dentro do arquivo
            Scanner leitor = new Scanner(myObj);

            //enquanto tiver linhas ele vai ler a proxima linha
            while (leitor.hasNextLine()) {
                String linhAtual = leitor.nextLine();
                String conteudoLinha[] = linhAtual.split(" ");
                int[] valores = new int[2];
                valores[0] = Integer.parseInt(conteudoLinha[0]);
                valores[1] = Integer.parseInt(conteudoLinha[1]);

                if (numeroLinha < 4) {
                    for (int i = 0; i < valores.length; i++) {
                        if (valores[i] < 0 || valores[i] > Math.pow(10, 5)) {
                            throw new Error("Valor de posição fora de alcance");
                        }

                    }

                }

                if (numeroLinha == 1) {
                    data.setCasa(valores);
                }
                if (numeroLinha == 2) {
                    data.setMacieira(valores[0]);

                    data.setLaranjeira(valores[1]);
                }
                if (numeroLinha == 3) {
                    data.setnMaca(valores[0]);
                    data.setnLaranja(valores[1]);
                }

                if (numeroLinha > 3) {
                    int[] posicaoFruta;
                    int posicaoArvore = 0;

                    if (numeroLinha == 4) {
                        posicaoFruta = new int[data.getnMaca()];
                        posicaoArvore = data.getMacieira();

                    } else if (numeroLinha == 5) {
                        posicaoFruta = new int[data.getnLaranja()];
                        posicaoArvore = data.getLaranjeira();

                    } else {
                        posicaoFruta = new int[0];
                    }
                    for (int i = 0; i < conteudoLinha.length; i++) {
                        int temp;
                        temp = Integer.parseInt(conteudoLinha[i]) + posicaoArvore;

                        if (temp > (int) Math.pow(10, -5) && temp < (int) Math.pow(10, 5)) {
                            posicaoFruta[i] = temp;
                        } else {
                            throw new Error("Posição da fruta invalida");
                        }
                    }
                    if (numeroLinha == 4) {
                        data.setPosicaoMaca(posicaoFruta);

                    }
                    if (numeroLinha == 5) {
                        data.setPosicaoLaranja(posicaoFruta);

                    }
                }

                numeroLinha++;

            }
            if (data.getMacieira() < data.getCasa()[0]
                    && data.getCasa()[0] < data.getCasa()[1]
                    && data.getCasa()[1] < data.getLaranjeira()) {
                throw new Error("Posições invalidas");
            }

            leitor.close();

            return data;

        } catch (FileNotFoundException e) {
            e.printStackTrace();

            return new dadosDeExecucao();
        }

    }

}
