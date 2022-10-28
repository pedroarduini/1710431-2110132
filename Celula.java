package model;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

protected class Celula{
  private char identificador;
  private int linha;
  private int coluna;
  private Comodo comodo;
  private boolean temJogador = false;
  
  public Celula(char i, int l, int c){
    this.identificador = i;
    this.linha = l;
    this.coluna = c;
    if (i == 'R'){
      comodo = achaComodo(l,c);  
    }  
  }
  
  public Celula(){
    this.identificador = 'S';  
  }   
  
  public int getLinha(){
    return linha; 
  } 
  
  public int getColuna(){
    return coluna;  
  }  
 
  public char getId(){
    return identificador; 
  } 
  
  public boolean gettemJogador(){
      return temJogador;
  }

  public void settemJogador(){
      temJogador = true;
  }
} 
