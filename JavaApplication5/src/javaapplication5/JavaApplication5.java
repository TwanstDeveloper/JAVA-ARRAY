package javaapplication5;

public class JavaApplication5 {

  
    public static void main(String[] args) {
        int sum=0;
    int[] ay=new int[5];
    ay[0]=11;
    ay[1]=15;
    ay[2]=14;
    ay[3]=13;
    ay[4]=12;
    for(int i=0;i<ay.length;i++){
   if(ay[i]%2==0){
    sum=sum+ay[i];}
  } 
    System.out.println(sum);
    }
    
}
