package pl.edu.pwsztar.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.edu.pwsztar.domain.CheasFasade;
import pl.edu.pwsztar.domain.dto.FigureMoveDto;
import pl.edu.pwsztar.planist.ChesMovieChecker;
@RestController
@RequestMapping(value="/api")

public class ChessApiController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ChessApiController.class);

    private CheasFasade cheasFasade;
    @Autowired
    ChessApiController(CheasFasade cheasFasade){
        this.cheasFasade=cheasFasade;
    }

    @CrossOrigin
    @PostMapping(value = "/chess/is-correct-move")
    public ResponseEntity<Boolean> isCorrectMove(@RequestBody FigureMoveDto figureMoveDto) {
      LOGGER.info("działam");

        return ResponseEntity.ok(cheasFasade.itsCorectMove(figureMoveDto));
    }
}
