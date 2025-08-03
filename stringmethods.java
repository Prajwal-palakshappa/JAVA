public class stringmethods {
    public static void main(String[] args) {
        String name="Prajwal";
        int value=name.length();
        System.out.println(value);
        String lstring=name.toLowerCase();
        System.out.println(lstring);
        String ustring=name.toUpperCase();
        System.out.println(ustring);
        String nontrimmmedString="         prajwal ";
        System.out.println(nontrimmmedString);
        System.out.println(nontrimmmedString.trim());
        System.out.println(name.substring(1));
        System.out.println(name.substring(0));
        System.out.println(name.substring(1,5));
        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("w","don"));
        System.out.println(name.startsWith("raj"));
        System.out.println(name);
        System.out.println(name.startsWith("Pra"));
        System.out.println(name.endsWith("al"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("r"));
        System.out.println(name.indexOf("a",2));
        System.out.println(name.equals("Prajwal"));
        System.out.println(name.equalsIgnoreCase("prajwal"));

    }
      
}
  