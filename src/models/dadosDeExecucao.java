/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author jvcla
 */
public class dadosDeExecucao {

    //dados da casa do João
    public int casa[];

    public int[] getCasa() {
        return casa;
    }

    public void setCasa(int[] casa) {
        this.casa = casa;
    }

    public int getMacieira() {
        return macieira;
    }

    public void setMacieira(int macieira) {
        this.macieira = macieira;
    }

    public int getLaranjeira() {
        return laranjeira;
    }

    public void setLaranjeira(int laranjeira) {
        this.laranjeira = laranjeira;
    }

    public int getnMaca() {
        return nMaca;
    }

    public void setnMaca(int nMaca) {
        this.nMaca = nMaca;
    }

    public int getnLaranja() {
        return nLaranja;
    }

    public void setnLaranja(int nLaranja) {
        this.nLaranja = nLaranja;
    }

    public int[] getPosicaoMaca() {
        return posicaoMaca;
    }

    public void setPosicaoMaca(int[] posicaoMaca) {
        this.posicaoMaca = posicaoMaca;
    }

    public int[] getPosicaoLaranja() {
        return posicaoLaranja;
    }

    public void setPosicaoLaranja(int[] posicaoLaranja) {
        this.posicaoLaranja = posicaoLaranja;
    }

    //Dados das arvores
    public int macieira, laranjeira;

    //Dados frutas
    public int nMaca, nLaranja;

    //Posição das frutas
    public int posicaoMaca[];
    public int posicaoLaranja[];

    public int nMacaCaiuCasa, nLaranjaCaiuCasa;

    public int getnMacaCaiuCasa() {
        return nMacaCaiuCasa;
    }

    public void setnMacaCaiuCasa(int nMacaCaiuCasa) {
        this.nMacaCaiuCasa = nMacaCaiuCasa;
    }

    public int getnLaranjaCaiuCasa() {
        return nLaranjaCaiuCasa;
    }

    public void setnLaranjaCaiuCasa(int nLaranjaCaiuCasa) {
        this.nLaranjaCaiuCasa = nLaranjaCaiuCasa;
    }
}
