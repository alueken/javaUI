@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello(@RequestParam String name) {
        return "Hello, " + name;
    }
}
