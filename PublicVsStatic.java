public class PublicVsStatic {
    static void canCallWithoutCreatingObjects() {
        System.out.println("I am independent, I don't need anyone... Ha Ha Ha");
    }

    public void cannotCallWithoutObjects() {
        System.out.println("I am extrovert.. i need objects to invoke me..");
    }
    public static void main(String[] args) {
        System.out.println("Public Vs Static");
        canCallWithoutCreatingObjects();

        PublicVsStatic publicVsStatic = new PublicVsStatic();
        publicVsStatic.cannotCallWithoutObjects();
    }
}
