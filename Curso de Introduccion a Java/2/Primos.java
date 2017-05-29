public class Primos{

  public static void main(String [] args){
    //int i= 2;
    //int j=0;
    
    for(int i=2; i<=1000; i++){
      int contador=0;
      for(int j=1;j<=i; j++){
	if(i%j == 0){
	  contador++;
	}
      }
      if(contador == 2){
	System.out.println("Es primo " + i);
      }
    }
    
    /*
    while(i<=1000){
      j=1;
      int contador=0;
      while(j<=i){
	if(i%j == 0){
	  contador++;
	}
	j++;
      }
      if(contador == 2){
	System.out.println("Es primo " + i);
      }
      i++;
    }**/
  }
  
}