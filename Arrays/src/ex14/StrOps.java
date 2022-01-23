package ex14;

public class StrOps {
    public static void main(String[] args) {
        String str1 = "Java is the leader of Internet!";
        String str2 = str1;
        String str3 = "Strings Java effective.";
        int result, idx;
        char ch;
        System.out.println("The size of str1: " + str1.length());//методы всегда с круглыми скобками, здесь length - метод, а в Array - метод
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i));//Ja, i=1
        }
        System.out.println();
        if (str1.equals(str2)) {//по алфавиту, булеановское выражение
            System.out.println("str1 equals to str2");
        }
            else {
            System.out.println("str1 doesn't equal to str2");
        }
        if (str1.equals(str3)) {
            System.out.println("str1 equals to str3");
        }
        else {
            System.out.println("str1 doesn't equal to str3");
        }
        result = str1.compareTo(str3);//сравнение с возвращением целого числа
        if (result == 0) {//compareTo вызвращает int, поэтому делаем выражение
            System.out.println("str1 and str3 equal");
        }
            else if (result < 0) {
            System.out.println("str1 < str3");
        }
                    else {
            System.out.println("str1 > str3");
        }
                    str2 = " One Two Three One ";
        System.out.println(str2);
                    idx = str2.indexOf("One");
        System.out.println("The index of first enter One: " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("The index of last enter One: " + idx);
        System.out.println(str2.substring(1,6));
        System.out.println(str2.trim());
    }
}
