import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


//Map is a collection of peer where each peer contain a collection of peer and a unique value
//Types : HashMap, TreeMap, LinkedHashMap
//Difference between Set and Map is the key(the number. Eg "2") value (whatever we put at value. Eg "Nigeria")

//HashMap: Maping a Key to Value. It allows us to store key value peer(a Key correspont to a Value or viceversa)



public class SetHarshMap {
    public static void main(String[] args) {

        HashMap<String, Set<String>> nigeria = new HashMap<>();
      Set<String> oyoState = new HashSet<>();
      Set<String> ogunState = new HashSet<>();

        oyoState.add("Ibadan North");
        oyoState.add("Ibadan South");
        oyoState.add("Ibadan West");
        oyoState.add("Ibadan East");
        oyoState.add("Ibadan NorthEast");
        oyoState.add("Ibadan North Central");
        oyoState.add("Ibadan SouthEast");
        oyoState.add("Ibadan NorthWest");
        oyoState.add("Ibadan South Central");
        oyoState.add("Ido Local government");
        oyoState.add("Ibarapa East");
        oyoState.add("Ibarapa West");
        oyoState.add("Ibadan Central");
        oyoState.add("Ibadan SouthWest");
        ogunState.add("iperu");
        ogunState.add("ayepe");
        ogunState.add("ibara");
        ogunState.add("abekuta");
        nigeria.put("OG", ogunState);
        nigeria.put("OY", oyoState);
        displayLocalGovernmentsForState(nigeria, "OG");
        displayLocalGovernmentsForState(nigeria, "OY");



        //System.out.println(nigeria.containsKey("Ibadan North")); //We use this to check/see if a certain key exist in our map.
//        System.out.println(nigeria.keySet());
//        System.out.println(oyoState.containsValue(6)); //We use this to check/see if a certain value exist in our map
//
//        OyoState.put("Ibadan North", 15); //This is used: if we put the exact same key we put before with different value. it will override the previous input.
//        System.out.println(Nigeria);

//
//        Map<String, String> Names = new HashMap<>();
//        Names.put("John", "Male");
//        Names.put("Mary", "Female");
//        Names.put("Mike", "Boy");
//        Names.put("Ruth", "Girl");
//        Names.put("Ron", "Young");
//        Names.put("Luke", "Old");
//
//        for(String i : Names.keySet()) {
//            System.out.print(i + "\t" + "= "); //For neat arrangment.
//            System.out.println(Names.get(i));
//        }

        //Set (HashSet) :Is a way of grouping a whole bunch of like objects together and handel them as one unit. It has no order.
        //Types of set: Hashset(it can also arranges alphabetically), Tree Set (it best used to arrange output alphabetically), LinkedHashset (it comes just in the order we put it)
        // Set does not accept duplicate like ArrayList or LinkedList (It takes care of duplicate)


//        Set<String> Identity = new HashSet<>();
//        Identity.add("Black");
//        Identity.add("White");
//        Identity.add("ispanic");
//        Identity.add("Europian");
//        Identity.add("Brown");
//        Identity.remove("1"); //We can't remove an item using it index like we can do in ArrayList and LinkedLis.
//
//        System.out.println(Identity);
//
//        Iterator<String> IdentityIterator = Identity.iterator(); //To print in a vertical/nice form
//        while (IdentityIterator.hasNext()) {
//            System.out.println(IdentityIterator.next());
////        }

    }
    public static void displayLocalGovernmentsForState(Map<String, Set<String>> stateMap, String stateAbbreviation) {
        Set<String> localGovernments = stateMap.get(stateAbbreviation);
        if (localGovernments != null && !localGovernments.isEmpty()) {
            System.out.println("Local Governments in " + stateAbbreviation + " State:");
            for (String localGovt : localGovernments) {
                System.out.println(localGovt);
            }
        } else {

        }
}}












