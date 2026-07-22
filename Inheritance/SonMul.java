public class SonMul extends FatherMul {
    public void sonName() {
        System.out.println("Son: Daniel");
    }

    public static void main(String[] args) {
        SonMul son = new SonMul();
        son.grandFatherName();
        son.fatherName();
        son.sonName();
    }
}
