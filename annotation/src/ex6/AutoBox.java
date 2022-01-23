package ex6;

class AutoBox {
    static int meth (Integer v) {
        return v;
    }

    public static void main(String[] args) {
        Integer iOb = meth(100);
        System.out.println(iOb);
    }
}
