package pertemuan9arraylist;

/**
 *
 * @author regina
 */

import java.util.ArrayList;

public class Pertemuan9ArrayList {

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("Emily");
        arr.add("Bob");
        arr.add("Cindy");
        arr.add(20);
        arr.add(null);
        arr.set(2,"Melisa");
//      arr.remove(0);
//      arr.remove(2);
//      arr.remove("Bob");
        Object removedValue = arr.remove("Emily");
        System.out.println("Value yang dihapus: " + removedValue);
        System.out.println(arr);
        
        ArrayList arr1 = new ArrayList();
        arr1.add("Emily");
        arr1.add("Bob");
        arr1.add("Cindy");
        System.out.println(arr1);
        
        System.out.println("Elemet yang terambil: " + arr1.getLast());
        for(int i = 0; i < arr1.size(); i++ ) {
            System.out.print(arr1.get(i) + " ");
        }
        
        arr.addAll(arr1);
//        System.out.println(arr);
   
        ArrayList<Integer> nilaiMahasiswa = new ArrayList();
        nilaiMahasiswa.add(92);
        nilaiMahasiswa.add(90);
        nilaiMahasiswa.add(88);
        nilaiMahasiswa.add(98);
        System.out.println(nilaiMahasiswa);
        nilaiMahasiswa.sort((o1, o2) -> 0);
        System.out.println(nilaiMahasiswa);
        
    }
    
}
