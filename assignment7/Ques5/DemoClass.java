package ankit.assignment7.Ques5;
/*
Create a class with an inner class that has a non-default constructor (one that takes arguments). 
Create a second class with an inner class that inherits from the first inner class.

*/
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
