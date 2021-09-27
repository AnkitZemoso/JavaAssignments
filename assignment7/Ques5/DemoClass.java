package ankit.assignment7.Ques5;

public class DemoClass {
    static class InnerClass{
        protected String text;

        public InnerClass(String text) {
            this.text = text;
        }


        public void displayText() {
            System.out.println(text);
        }

    }
}
