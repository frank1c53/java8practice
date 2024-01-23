package HashPractice;

public class Triplets {
    public static void main(String[] args) {
         int array[] = {4,5,2,1,6,7};
         int target = 8;
         for(int i=0;i<array.length;i++){
             for(int j=0;j<array.length;j++){
                for(int k=0;k<array.length;k++){
                    if(i==j && i==k){

                    }else{
                        if(array[i]+array[j]+array[k]==target){
                            System.out.println("["+array[i]+","+array[j]+","+array[k]+"]");
                        }
                    }
                }
             }
         }


    }
}
