package pl.edu.pwsztar.domain;
import static java.util.Objects.requireNonNull;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.Transactional;
import pl.edu.pwsztar.domain.dto.FigureMoveDto;
import pl.edu.pwsztar.planist.ChesMovieChecker;

@ComponentScan
@Transactional
public class CheasFasade {
    private final FigureMoveDto figureMoveDto;
    private final  ChesMovieChecker chesMovieChecker;

    public CheasFasade(FigureMoveDto figureMoveDto, ChesMovieChecker chesMovieChecker) {
        this.figureMoveDto = figureMoveDto;
        this.chesMovieChecker=chesMovieChecker;
    }
    public boolean itsCorectMove(FigureMoveDto figureMoveDto){
        return chesMovieChecker.itIsCorectMove(figureMoveDto);
    }

}
