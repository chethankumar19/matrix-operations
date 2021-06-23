package matrix;
 
public class Muliplication{
  public static void main(String args[]){
    int a[][]={{1,3,4},{2,4,3},{3,4,5}};
    int b[][]={{1,3,4},{2,4,3},{1,2,4}};
    int c[][]=new int[3][3];
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
          c[i][j]=0;
      }
    }
    for(int k=o;k<3;k++){
        c[i][j]+=a[i][k]*b[k][j];
    }
    System.out.print(c[i][j]+"");
  }
 }
}
public static void main(Strings args[]){
  int d[][]={{1,3,4},{2,4,3},{3,4,5}};
  int e[][]={{1,3,4},{2,4,3},{1,2,4}};
  int f[][]=new int[3][3];
  for (int m=0;m<3;m++){
      for(int n=0;n<3;n++){
            f[m][n]=d[m][n]+e[m][n];
        System.out.print(f[m][n]+ "");
      }
    System.out.println();
  }
 }
}


