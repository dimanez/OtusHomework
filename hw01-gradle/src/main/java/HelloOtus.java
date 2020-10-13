import com.google.common.html.HtmlEscapers;

public class HelloOtus {
    public static void main(String[] args) {
        System.out.println(HtmlEscapers.htmlEscaper().escape("<<<>>>"));
    }
}
