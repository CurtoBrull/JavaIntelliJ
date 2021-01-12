package Strings;

public class TestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++){
            //c = c.concat(a).concat(b).concat("\n"); // 500 = 3ms, 1000 = 7ms, 100.000 = 7362ms
            //c += a + b + "\n"; // 500 = 29ms, 1000 = 30ms, 100.000 = 2788ms
            sb.append(a).append(b).append("\n"); // 500 = 0ms, 1000 = 0ms, 100.000 = 22ms

        }

        long fin = System.currentTimeMillis();

        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        System.out.println(fin - inicio);

    }
}
