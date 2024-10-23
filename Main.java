// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println();

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog - " + dog);
        System.out.println("cat - " + cat);
        System.out.println("paper - " + paper);

        System.out.println();

        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("dog - " + dog);
        System.out.println("cat - " + cat);
        System.out.println("paper - " + paper);

        System.out.println();

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog - " + dog);
        System.out.println("cat - " + cat);
        System.out.println("paper - " + paper);

        System.out.println();

        var friend = 19;
        System.out.println("friend - " + friend);
        friend *= 2;
        System.out.println("friend - " + friend);
        friend /= 7;
        System.out.println("friend - " + friend);

        System.out.println();

        var frog = 3.5;
        System.out.println("frog - " + frog);
        frog *= 10;
        System.out.println("frog - " + frog);
        frog /= 3.5;
        System.out.println("frog - " + frog);
        frog += 4;
        System.out.println("frog - " + frog);

        System.out.println();

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;

        System.out.println(firstBoxerWeight + secondBoxerWeight);

    }
}