import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        //HashMap =  store a series of object and key value pairs
        HashMap<String, String>  countries = new HashMap<String,String>();

        //Add a key and value
        countries.put("USA", "Washington DC");
        countries.put("India", "New Delhi");
        countries.put("Russia", "Moscow");
        countries.put("China", "Beijing");

       /* //remove a country
        //countries.remove("USA");

        //get the country's capital
        System.out.println(countries.get("Russia"));

        //clear all countries
        //countries.clear();

        //Size of country
        //System.out.println(countries.size());

        //replace countries
        countries.replace("USA", "Detroit");

        //Check if a certain key is in the HashMap
        System.out.println(countries.containsKey("England"));

        //Check if it contains a certain value
        System.out.println(countries.containsValue("Beijing"));

        System.out.println(countries);*/

        for (String i: countries.keySet()){
            System.out.print(i+"\t"+"= ");
            //get value
            System.out.println(countries.get(i));
        }
    }
}