package classes;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import Interfaces.InterfaceJogador;

public class Jogador extends UnicastRemoteObject implements InterfaceJogador{
    
    public String Nome;
    public String PosicaoJogo;
    public String Clube;
    public int Ncamisa;
    
    public Jogador() throws RemoteException {
        System.out.print("A classe Aluno está disponível remotamente.");
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getClube() {
        return Clube;
    }

    public void setClube(String Clubes) {
        this.Clube = Clubes;
    }

    public int getNcamisa() {
        return Ncamisa;
    }

    public void setNcamisa(int Ncamisa) {
        this.Ncamisa = Ncamisa;
    }

    public String getPosicaoJogo() {
        return PosicaoJogo;
    }

    public void setPosicaoJogo(String PosicaoJogo) {
        this.PosicaoJogo = PosicaoJogo;
    }

   
    
}
