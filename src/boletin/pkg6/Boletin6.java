/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg6;

import java.util.Scanner;

/**
 *
 * @author slagogonzalez
 */
public class Boletin6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
       System.out.print("Nome do propietario da conta1: ");
       String nome = sc.nextLine();
       System.out.print("Saldo inicial da conta1: ");
       double saldo = Double.parseDouble(sc.nextLine());
       System.out.print("Numero de conta1: ");
       String numConta = sc.nextLine();
       ContaBanco conta = new ContaBanco(nome,saldo,numConta);
       System.out.print("Saldo a retirar da conta1: ");
       saldo = Double.parseDouble(sc.nextLine());
       conta.retirar(saldo);
       System.out.print("Saldo a engadir na conta: ");
       saldo = Double.parseDouble(sc.nextLine());
       conta.ingresar(saldo);
       // datos da segunda conta
       System.out.print("Nome do propietario da conta2: ");
       String nome2 = sc.nextLine();
       System.out.print("Saldo inicial da conta2: ");
       double saldo2 = Double.parseDouble(sc.nextLine());
       System.out.print("Numero de conta:2 ");
       String numConta2 = sc.nextLine();
       ContaBanco conta2 = new ContaBanco(nome2,saldo2,numConta2);
       System.out.print("Saldo a retirar da conta2: ");
       saldo = Double.parseDouble(sc.nextLine());
       conta2.retirar(saldo);
       System.out.print("Saldo a engadir na conta2: ");
       saldo = Double.parseDouble(sc.nextLine());
       conta2.ingresar(saldo);
       // metodo transferencia
       System.out.print("Diñeiro a transferir a conta1: ");
       double trans = Double.parseDouble(sc.nextLine());
       conta2.transferencia(conta, trans);
       //Visualizamos las dos cuentas
       conta.visualizar();
       conta2.visualizar();
       }
    
}
    
    

