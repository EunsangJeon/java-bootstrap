class StrOps {
    public static void main(String args[]) {
        String str1 = "String literal to demonstrate";
        String str2 = new String(str1);
        String str3 = "Another String";
        System.out.println("str length: " + str1.length());
        for(int i = 0; i < str1.length(); i++){
            System.out.print(str1.charAt(i) + " ");
        }
        System.out.println();
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.compareTo(str3));
        str2 = "one two three one";
        System.out.println(str2.indexOf("one"));
        System.out.println(str2.lastIndexOf("one"));
    }
}