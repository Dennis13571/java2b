package myJava15;

// class CTest {
//     String id;

//     public CTest(String str) {
//         id = str;
//     }

//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 0; j < 5; j++) {
//                 System.out.println(id + " " + i);
//             }
//         }
//     }
// }

public class Class02 {
    public static void main(String args[]) {
        CTest hi = new CTest("Hello");
        CTest bye = new CTest("Good bye");
        hi.run();
        bye.run();
        // 先做完hi.run，在做完bye.run
    }
}
