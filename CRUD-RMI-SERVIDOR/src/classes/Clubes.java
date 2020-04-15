package classes;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import Interfaces.InterfaceClubes;


public class Clubes extends UnicastRemoteObject implements InterfaceClubes{
    
    public String Nome;
    public String Presidente;
    public String DataFundacao;
    
    
   public Clubes() throws RemoteException {
        System.out.print("A classe Carro está disponível remotamente.");
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getPresidente() {
        return Presidente;
    }

    public void setPresidente(String Presidente) {
        this.Presidente = Presidente;
    }

    public void setDataFundacao(String DataFundacao) {
        this.DataFundacao = DataFundacao;
    }

    @Override
    public String getDataFundação() throws RemoteException {
        
        return DataFundacao;
    }


    
   
}