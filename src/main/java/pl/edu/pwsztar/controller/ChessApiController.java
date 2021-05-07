package pl.edu.pwsztar.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.edu.pwsztar.domain.CheasFasade;
import pl.edu.pwsztar.domain.dto.FigureMoveDto;
import pl.edu.pwsztar.planist.ChesMovieChecker;
@RequestMapping(value="/api")
public class ChessApiController {
    private CheasFasade cheasFasade;
    public ChessApiController(CheasFasade cheasFasade){
  this.cheasFasade=cheasFasade;
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(ChessApiController.class);

    @CrossOrigin
    @PostMapping(value = "/chess/is-correct-move")
    public ResponseEntity<Boolean> isCorrectMove(@RequestBody FigureMoveDto figureMoveDto) {
        LOGGER.info("*** move details : {}", figureMoveDto);
        return ResponseEntity.ok(cheasFasade.itsCorectMove(figureMoveDto));
    }
}
