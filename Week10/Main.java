package Week10;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;

//public class Main {

    public class Main{
        public static int binaySearch(int[] arr, int start, int end, int element) {
            while(start<=end) {
                int mid = (start+end)/2;
                if(arr[mid]>element){ end = mid-1;}
                else if(arr[mid]<element){ start = mid+1; }
                else if(arr[mid] == element){ return mid;}
            }
            return -1;
        }
        public static void main(String[] args){
            try {
                File f = new File("input.txt");
                Scanner scanner = new Scanner(f);

                int[] elementToSearch = new int[100];
                int i = 0;
                while(scanner.hasNextInt()){
                    elementToSearch[i++] = scanner.nextInt();
                    if(i==100) {break;}
                }
                i = 0;
                int[] arr = new int[100000];
                while(scanner.hasNextInt()){
                    arr[i++] =  scanner.nextInt();
                }
                for(int j = 0;j<100;j++){
                    int result = binaySearch(arr,0,100000-1,elementToSearch[j]);
                    if(result!=-1){
                        System.out.println("target: " + elementToSearch[j] + "\t" + "index: "+result);
                    }
                }
            }catch(FileNotFoundException e){
                System.out.println("An error occurred.");
            }
        }
    }
//}
