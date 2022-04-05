public class Main {
    public static void main(String[] args) {
        //C5 = 4
        //C7 = 5
        //C11 = 6
        char [][] A = {
                {1,2,3,4},
                {4,5,6,5},
                {3,4,1,0}};
        char [][] B = {
                {3,4,5,4},
                {6,7,8,5},
                {2,3,5,5},
                {2,0,8,4}};
        char n = (char) A.length;
        char m = (char) A[0].length;
        char q = (char) B.length;
        char r = (char) B[0].length;


            if (m!=q)
                System.out.println("Кількість стовпців у першому множнику повинно дорівнювати кількості рядків у другому. ");
            else {
                char [][] C = new char [n][r];
                //Виконуємо множення матриць А і В
                for (int i=0; i<n; i++){
                    for (int j=0; j<r; j++){
                        for (int k=0; k<m; k++)
                            C[i][j]+= A[i][k]*B[k][j];
                    }}
                for (int i=0; i<C.length; i++){
                    for(int j=0; j<C[0].length; j++){
                        System.out.print(C[i][j]+" ");
                    }
                    System.out.println();
                }
// сума найбільших чисел з парних стовпців
                int s=0;
                for (int j=0; j<r;j++){
                    if (j%2==1) {
                        double max=C[0][j];
                        for (int i=0; i<n;i++)
                            if (C[i][j]>max) max=C[i][j];
                        s+=max;
                    }}
//cума найменьших чисел з непарних стовпців
                int g=0;
                for (int j=0; j<r;j++){
                    if (j%2==0) {
                        double min=C[0][j];
                        for (int i=0; i<n;i++)
                            if (C[i][j]<min) min=C[i][j];
                        g+=min;
                    }}
                System.out.println("Сума s = " + (s+g));
            }

    }



    }


