package model;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

protected class Comodo{ 
  private String nome;
  private int[][] portas;
  
  
  public Comodo(String s, int[][] portas){
    nome = s;
  }  
  
  public Comodo achaComodo(int l, int c){
    Comodo resposta;
    String s;
    int[][] portas = new int[][];
    if(l<7){
      if(c<6){
        s = "Cozinha";
        portas[0] = new int[2]{6,4};
      }
      else if(c<16){
        s = "Sala de música";
        portas[0] = new int[2]{4,7};
        portas[1] = new int[2]{7,9};
        portas[2] = new int[2]{7,14};
        portas[3] = new int[2]{4,16};
      }
      else{
        s = "Jardim de Inverno";
        portas[0] = new int[2]{4,18};
      }
    }
    else if (l<12){
       if(c<8){
        s = "Sala de jantar"; 
        portas[0] = new int[2]{11,8};
        portas[1] = new int[2]{15,6};
       }
       else{
        s = "Salão de jogos"; 
        portas[0] = new int[2]{8,17};
        portas[1] = new int[2]{12,22}; 
       }  
    }
    else if (l < 18){
      if(c < 8){
        s = "Sala de jantar";
      }
      else if(c<15){
        s = "Entrada";  
        portas[0] = new int[2]{16,11};
        portas[1] = new int[2]{16,12};
        portas[2] = new int[2]{19,14};
      }
      else{
        s = "Biblioteca";
        portas[0] = new int[2]{12,20};
        portas[1] = new int[2]{15,16};
      }  
    }
    else{
      if(c < 7){
        s = "Sala de estar";  
        portas[0] = new int[2]{17,6};
      }
      else if ( c<15){
        s = "Entrada";
      }  
      else{
        s = "Escritório";
        portas[0] = new int[2]{19,16};
      }
    }
    resposta = new Comodo(s);
    return resposta;
  }  

}  
