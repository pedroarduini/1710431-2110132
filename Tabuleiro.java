package model;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Tabuleiro {
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
  
}
