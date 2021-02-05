/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafioceviu;

import java.util.Scanner;
import CeviuUtils.CeviuUtils;
import models.dadosDeExecucao;

/**
 *
 * @author jvcla
 */
public class DesafioCeviu {

    /*  
    s e t tamanho da casa
    a macieira
    b laranjeira
    d distancia que fruta cai da arvore
    m quantidade de maçã
    n quantidade de laranja 
     */
    public static final String BASEURL = "C:\\Users\\jvcla\\OneDrive\\Documentos\\NetBeansProjects\\DesafioCeviu";
    
    public static void main(String[] args) {
        CeviuUtils utils = new CeviuUtils();
        dadosDeExecucao entrada = utils.handleFile(BASEURL + "\\src\\desafioceviu\\entrada.txt");
      
        int contadorMaca=0, contadorLaranja=0;
         
        for (int i = 0; i < entrada.getPosicaoMaca().length; i++) {
            
            if ((entrada.getnMaca() + entrada.macieira) > entrada.getCasa()[0] && (entrada.getnMaca() + entrada.macieira) < entrada.getCasa()[1]) {
                System.out.println("entrou no if maca");
                contadorMaca++;
                
            }
           
        }
       

        for (int i = 0; i < entrada.getPosicaoLaranja().length; i++) {
            if (entrada.getPosicaoLaranja()[i] >= entrada.getCasa()[0] && entrada.getPosicaoLaranja()[i] <= entrada.getCasa()[1]) {
                contadorLaranja++;
            }
        }
        System.out.println(contadorMaca);
        System.out.println(contadorLaranja);
        
    }
    
}
