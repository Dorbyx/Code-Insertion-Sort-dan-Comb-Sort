public class Insertsort {

    public static void main(String[] args) {
        int i,j,data_sisip;
        int[] tabInt = {6,5,3,1,8,7,2,4};
		
    System.out.print("Sebelum dilakukan inserting sort \n");
	
        for(i=0; i<tabInt.length; i++){ 
            System.out.print(tabInt[i]+" ");
        }
		
        for(i=1; i<tabInt.length; i++){ 
            data_sisip = tabInt[i]; 
            j = i; 
            while((j>0) && (tabInt[j-1] > data_sisip)){            
                tabInt[j] = tabInt[j-1]; 
                j = j - 1; 
            }        
            tabInt[j] = data_sisip; 
        } 
		
        System.out.print("\nSetelah dilakukan inserting sort \n");
        for(i=0; i<tabInt.length; i++){ 
            System.out.print(tabInt[i]+" ");
        }
    }
}
   
    

