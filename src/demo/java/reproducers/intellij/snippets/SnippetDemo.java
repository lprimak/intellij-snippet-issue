package reproducers.intellij.snippets;

public class SnippetDemo {
    // @start region="greet"
    public String greet(String name) {
        return new Greeter().greet(name);
    }
    // @end
}
