package ankit.assignment7.Ques5;

public class SecondClass {
    static class SecondInner extends DemoClass.InnerClass {


        public SecondInner(String text) {
            super(text);

        }

        @Override
        public void displayText() {
            System.out.println(super.text+" from SecondInner Class");
        }
    }

    public static void main(String[] args) {
        SecondClass.SecondInner obj= new SecondClass.SecondInner("Hello");
        obj.displayText();
    }
}
