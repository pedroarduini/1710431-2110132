package model;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

protected class Celula{
  char identificador;
  int linha;
  int coluna;
  boolean temJogador = false;
  
  public Celula(char i, int l, int c){
    this.identificador = i;
    this.linha = l;
    this.coluna = c;
  }  
  
  public getLinha(){
    return linha; 
  } 
  
  public getColuna(){
    return coluna;  
  }  
 
  public getId(){
    return identificador; 
  } 
} 
