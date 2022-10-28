package model;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.lang.Math;

protected class Tabuleiro {
  ArrayList<ArrayList<Celula>> celulas;
  
  public Tabuleiro(){
    loadCelulas();
  }  
  
  private loadCelulas(){
    BufferedReader temp = new BufferedReader(new FileReader("celulastabuleiro.txt"));
    char value;
    for(int i = 0;i < 24; i++){
      for(int k = 0; k < 24; k++){
        value = temp.read();
        celulas.get(i).add(new Celula(value,i,k));
      }
    }  
  }  
  
  //define qual célula foi clicada
  public defineClique(int x, int y){
   
    return celula;
  }  
  
  //valida se é possível ir até a célula em questão com o número de movimentos
  //*falta incluir algoritmo pra verificar se não tem jogadores no caminho
  public int validaMovimento(int dado, Celula cel, Jogador j){
    char id = cel.getId();
    int passosX;
    int passosY;
    if(cel.gettemJogador == true || id = 'Z'){
      return -1;
    }
    
    if(id != 'R'){
      passosX = abs(j.getPosicao().getColuna()  - cel.getColuna);
      passosY = abs(j.getPosicao().getLinha()  - cel.getLinha);
      if(passosX + passos Y > dado){
        return -1;  
      }  
    }
    else{
      Comodo comodo = cel.getComodo();
      int[2] porta = getPortaProxima(comodo,cel);
      
      int desvioX = 0;
      int desvioY = 0;
      Celula celPorta = this.getCelula(int[0],int[1]);
      switch(celPorta.getId){
        case 'C':
          desvioY = -1;
          break;
        case 'D':
          desvioX = 1;
          break;
        case 'E':
          desvioX = -1;
          break;
        case 'B':
          desvioY = 1;
          break;
      }    
      
      passosX = abs(porta[0]+desvioX - cel.getLinha);
      passosY = abs(porta[1]+desvioY - cel.getColuna);
      
      if(passosX+passosY > dado || celPorta.gettemJogador = true){
        return -1;  
      }   
    }  
        
    
  }
  
  public Celula getCelula(int l, int c){
      return celulas.get(l).get(c);
  }  
  
  
}
