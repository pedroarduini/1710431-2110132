package model;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

protected class Comodo{ 
  private String nome; 
  
  public Comodo(String s){
    nome = s;
  }  
  
  public Comodo achaComodo(int l, int c){
    Comodo resposta;
    String s;
    if(l<7){
      if(c<6){
        s = "Cozinha";
      }
      else if(c<16){
        s = "Sala de música";
      }
      else{
        s = "Jardim de Inverno";
      }
    }
    else if (l<12){
       if(c<8){
        s = "Sala de jantar"; 
       }
       else{
        s = "Salão de jogos"; 
       }  
    }
    else if (l < 18){
      if(c < 8){
        s = "Sala de jantar";
      }
      else if(c<15){
        s = "Entrada";  
      }
      else{
        s = "Biblioteca";
      }  
    }
    else{
      if(c < 7){
        s = "Sala de estar";  
      }
      else if ( c<15){
        s = "Entrada";
      }  
      else{
        s = "Escritório";
      }
    }
    resposta = new Comodo(s);
    return resposta;
  }  

}  
