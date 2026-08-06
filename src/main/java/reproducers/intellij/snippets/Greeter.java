package reproducers.intellij.snippets;

/// Here is an example how to use this class
/// {@snippet class="reproducers.intellij.snippets.SnippetDemo" region="greet"}
///
public class Greeter {
    public String greet(String name) {
        return "Hello, %s!".formatted(name);
    }
}
