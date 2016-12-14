/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg6;

/**
 *
 * @author slagogonzalez
 */
public class ContaBanco {
    private String nome,numConta;
    private double saldo;
    // constructores
    public ContaBanco(){
        
    }
    public ContaBanco(String nome,double saldo,String numConta){
        this.nome=nome;
        this.saldo=saldo;
        this.numConta=numConta;
    }
    //Metodos de acceso 
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setNumConta (String numConta){
        this.numConta=numConta;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
   
    //Metodos
    public void retirar(double cartos){
        if(cartos<0)
            System.out.println("Non pode retirar unha cantidade negativa de cartos");
        else if (saldo<cartos)
            System.out.println("non pode retirar mais cartos dos que dispon");
                
        else{
            saldo=saldo-cartos;
            System.out.println("Operacion realizada con exito.");
        }
    }
    public void ingresar (double cartos){
        if(cartos<0)
            System.out.println("Non pode ingresar unha cantidade negativa de cartos.");
        else{
            saldo=saldo+cartos;
            System.out.println("Operacion realizada con exito.");
        }
    }
    public void visualizar(){
        System.out.println("Conta bancaria numero: "+numConta);
        System.out.println("Propietario: "+nome);
        System.out.println("Saldo da conta: "+saldo);
        
    }
    //metodo de transferencia: Se le da como parametro un objeto de tipo ContaBanco
   public void transferencia(ContaBanco cuentaDestino,double importe){
       if(saldo<importe){
           System.out.println("La transferencia no se puede realizar");
       }else{
           cuentaDestino.ingresar(importe);
           this.saldo= this.saldo-importe;   
           System.out.println("Transferencia realizada con exito.");
       }
   }
    
    
} 

