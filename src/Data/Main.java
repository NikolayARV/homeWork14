package Data;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            Data.checkLogin("524iok_Llkjhbjkhkjhl");
        } catch (WrongLoginException e) {
            throw new RuntimeException(e);
        }
        Data.checkData("login", "pass_word9", "pass_word9");


        Random random = new Random();
        Set<Exercise> exercises = new HashSet<>();
        while (exercises.size() < 15) {
            Exercise exercise = new Exercise(random.nextInt(10), random.nextInt(10));
            exercises.add(exercise);
            System.out.println(exercise);
        }


        HashMap<String, String> phonebook = new HashMap<>();
        phonebook.put("ФИ1", "89000000001");
        phonebook.put("ФИ2", "89000000002");
        phonebook.put("ФИ3", "89000000003");
        phonebook.put("ФИ4", "89000000004");
        phonebook.put("ФИ5", "89000000005");
        phonebook.put("ФИ6", "89000000006");
        phonebook.put("ФИ7", "89000000007");
        phonebook.put("ФИ8", "89000000008");
        phonebook.put("ФИ9", "89000000009");
        phonebook.put("ФИ10", "89000000010");
        phonebook.put("ФИ11", "89000000011");
        phonebook.put("ФИ12", "89000000012");
        phonebook.put("ФИ13", "89000000013");
        phonebook.put("ФИ14", "89000000014");
        phonebook.put("ФИ15", "89000000015");
        phonebook.put("ФИ16", "89000000016");
        phonebook.put("ФИ17", "89000000017");
        phonebook.put("ФИ18", "89000000018");
        phonebook.put("ФИ19", "89000000019");
        phonebook.put("ФИ20", "89000000020");
        System.out.println(phonebook);


        Mapp mapp = new Mapp(new HashMap<>());
        Map<String, Integer> map1 = new HashMap<>();

        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("A", 1);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("C", 3);
        Mapp mapp1 = new Mapp(map1);
        mapp1.mapAd("A", 2);
        System.out.println(mapp1);

        Random random1 = new Random();
        List<Integer> numbs = new ArrayList<>(3);
        while (numbs.size() < 3) {
            Integer numb = random1.nextInt(1000);
            numbs.add(numb);
        }

        System.out.println(numbs);

        Map<String, List<Integer>> str1 = new HashMap<>();
        str1.put("S1", numbs);

        str1.put("S2", List.of(1,3,5));
        str1.put("S3", List.of(20,15,47));
        str1.put("S4", List.of(152,157,589));
        str1.put("S5", List.of(147,865,846));
        System.out.println(str1);


        Map<String, Integer> str2 = new HashMap<>();
for (Map.Entry<String, List<Integer>> num: str1.entrySet()) {
    //str2.keySet().add(num.getKey());
    int sum = 0;
    for (int i = 0; i < num.getValue().size(); i++) {

        sum = num.getValue().get(i) + sum;
    }
    str2.put(num.getKey(), sum);
    }



        System.out.println(str2);

        Map<Integer, String> str3 = new LinkedHashMap<>();
        str3.put(1, "A");
        str3.put(2, "B");
        str3.put(3, "C");
        str3.put(4, "D");
        str3.put(5, "F");
        str3.put(7, "G");
        str3.put(8, "H");
        str3.put(9, "L");
        str3.put(10, "M");
        str3.put(6, "N");
        System.out.println(str3);


    }


}



