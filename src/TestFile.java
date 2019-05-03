public class TestFile {

    static int[] v = {0,1,0,0,1,1,1,0};
    static int transfer;
    static int i,j;
    public static void main(String[] args){


        boolean inversare = true;

        printArray(v);
        for(i=0;i<v.length-1;i++){

            if(v[i]== v[i+1]){
                for(j=i+1;j<v.length;j++){
                    if(v[j]!=v[i]){
                        v=swapPlaces(v,j);
                        i=-1;
                        printArray(v);
                        break;
                    }

                }
            }

        }


    }

    public  static int[] swapPlaces(int[] v, int pos){

        transfer = v[pos];
        v[pos] =v[pos-1];
        v[pos-1]= transfer;

        return v;
    }

    public static void printArray(int[] v){
        System.out.println();
        for(int i =0; i<v.length;i++){
            System.out.print(v[i]+" ");
        }
    }

}

