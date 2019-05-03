public class TestFile {

    static int[] v = {0,1,0,0,1,1,1,0};

    public static void main(String[] args){
        int i,j;
        int transfer;
        boolean inversare = true;

        printArray(v);
        for(i=0;i<v.length-1;i++){

            if(v[i]== v[i+1]){
                for(j=i+1;j<v.length;j++){
                    if(v[j]!=v[i]){
                        transfer = v[j];
                        v[j] =v[j-1];
                        v[j-1]= transfer;
                        i=-1;
                        System.out.println();
                        printArray(v);
                        break;
                    }

                }
            }

        }


    }


    public static void printArray(int[] v){

        for(int i =0; i<v.length;i++){
            System.out.print(v[i]+" ");
        }
    }

}

