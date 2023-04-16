/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste.looca.api;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscoGrupo;
import com.github.britooo.looca.api.group.sistema.Sistema;
import java.util.List;

/**
 *
 * @author kanaiama
 */
public class App {
    public static void main(String[] args) {
        Looca looca = new Looca();
        
        Sistema sistema = looca.getSistema();
        sistema.getArquitetura();
        System.out.println(sistema);
        
        System.out.println(looca.getProcessador());
        System.out.println(looca.getMemoria());
        //Criação do gerenciador
        DiscoGrupo grupoDeDiscos = looca.getGrupoDeDiscos();

        //Obtendo lista de discos a partir do getter
        List<Disco> discos = grupoDeDiscos.getDiscos();
        
        for (Disco disco : discos) {
            System.out.println(disco);
            
            
         // Informações sistema | rede | grupo de interface | parametros
         // CPU | PROCESSADOR | GRUPO DE DISCOS | PROCESSOS (nome e outras informações)
         // MEMÓRIA | TEMPERATURA 
         
         
        }
    }
}
