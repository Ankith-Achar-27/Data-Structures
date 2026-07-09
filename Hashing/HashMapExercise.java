import java.util.*;

public class HashMapExercise {
    public static void main(String[] args) {

        //country(key), population(value)
        HashMap<String,Integer> map = new HashMap<>();

//        Insertion
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);
//     Map is Unordered
        System.out.println(map); // {China=150, US=30, India=120}
//   If key is already exists value will be updated through put
        map.put("China",160);
        System.out.println(map); // {China=160, US=30, India=120}

        //Search
        if (map.containsKey("China")){
            System.out.println("Key is present in the map"); //Key is present in the map
        }else{
            System.out.println("Key is not present in the map");
        }

        // To get the value of particular key

        System.out.println(map.get("China")); // 160
        System.out.println(map.get("Africa")); // null

        // Iteration

        // int[] arr = {}
        // for(int n: arr)

        // entrySet is a set of Keys and Value pair

        for (Map.Entry<String,Integer> e : map.entrySet()){
            System.out.print(e.getKey() + " " + e.getValue());
          /*
          China 160
          US 30
          India 120
            */
            System.out.println();
        }


        // To print Keys -> we make a key set
        Set<String> Keys = map.keySet();
        for (String key : Keys){
            System.out.print("Keys: "+map.get(key)+"\t"); // Keys: 160	Keys: 30	Keys: 120
        }
        System.out.println();

        // Removing Key removes the pair itself
        System.out.println(map); // {China=160, US=30, India=120}
        map.remove("China");
        System.out.println(map); // {US=30, India=120}

        System.out.println(map.size()); // 2
    }
}
