package academy.devdojo.maratonajava.javacore.ZZJcrud.dominio;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Anime {
    Integer Id;
    String name;
    int episodes;
    Producer producer;
}
