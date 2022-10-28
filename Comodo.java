package model;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Math;

protected class Comodo{ 
  private String nome;
  private int[][] portas;
  private int numPortas;
  
  public Comodo(String s, int[][] p, int np){
    nome = s;
    portas = (int[][]) p.clone();
    numPortas = np;
  }  
  
  public Comodo achaComodo(int l, int c){
    Comodo resposta;
    String s;
    int[][] portas = new int[][];
    int num;
    if(l<7){
      if(c<6){
        s = "Cozinha";
        portas[0] = new int[2]{6,4};
        num = 1;
      }
      else if(c<16){
        s = "Sala de música";
        portas[0] = new int[2]{4,7};
        portas[1] = new int[2]{7,9};
        portas[2] = new int[2]{7,14};
        portas[3] = new int[2]{4,16};
        num = 4;
      }
      else{
        s = "Jardim de Inverno";
        portas[0] = new int[2]{4,18};
        num = 1;
      }
    }
    else if (l<12){
       if(c<8){
        s = "Sala de jantar"; 
        portas[0] = new int[2]{11,8};
        portas[1] = new int[2]{15,6};
        num = 2;
       }
       else{
        s = "Salão de jogos"; 
        portas[0] = new int[2]{8,17};
        portas[1] = new int[2]{12,22}; 
        num = 2;
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
        num = 3;
      }
      else{
        s = "Biblioteca";
        portas[0] = new int[2]{12,20};
        portas[1] = new int[2]{15,16};
        num = 2;
      }  
    }
    else{
      if(c < 7){
        s = "Sala de estar";  
        portas[0] = new int[2]{17,6};
        num = 1;
      }
      else if ( c<15){
        s = "Entrada";
      }  
      else{
        s = "Escritório";
        portas[0] = new int[2]{19,16};
        num = 1;
      }
    }
    resposta = new Comodo(s,portas,num);
    return resposta;
  } 
  
  public int[2] getPortaProxima(Comodo destino, Celula inicio){
    int distancia;
    int menor = 0;
    int index;
    for(int i = 0; i < destino.numPortas;i++){
      distancia = abs(destino.portas[i][0] - inicio.getLinha);
      distancia += abs(destino.portas[i][1] - inicio.getColuna);
      if (distancia<menor){
        index = i;  
      }  
    }  
    return destino.portas[i];  
  } 
  
  public int getNumPortas(){
    return numPortas;  
  }  

}  
