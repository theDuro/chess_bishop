package pl.edu.pwsztar.domain;
import static java.util.Objects.requireNonNull;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.Transactional;
import pl.edu.pwsztar.domain.dto.FigureMoveDto;
@ComponentScan
@Transactional
public class CheasFasade {
    private final FigureMoveDto figureMoveDto;

    public CheasFasade(FigureMoveDto figureMoveDto) {
        this.figureMoveDto = figureMoveDto;
    }

}
