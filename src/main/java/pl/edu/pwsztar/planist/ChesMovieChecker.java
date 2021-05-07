package pl.edu.pwsztar.planist;

import pl.edu.pwsztar.domain.dto.FigureMoveDto;
import pl.edu.pwsztar.domain.enums.FigureType;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ChesMovieChecker {
   private  Map<String, Integer> chessMoveMap = new HashMap<String, Integer>()
    {{
        put("a", 1);
        put("b", 2);
        put("c", 3);
        put("d", 4);
        put("e", 5);
        put("f", 6);
        put("g", 7);
        put("h", 8);
        put("1", 1);
        put("2", 2);
        put("3", 3);
        put("4", 4);
        put("5", 5);
        put("6", 6);
        put("7", 7);
        put("8", 8);

    }};
   private Point getPosition(String positionInString){
       return new Point( chessMoveMap.get(positionInString.substring(0,1)), chessMoveMap.get(positionInString.substring(2,3)));
   }

   //do lekiej refraltoryzacji obejmuje narazie ruch samego gonica newet nie zwraca uwagi na figure
   public boolean itIsCorectMove(FigureMoveDto figureMoveDto){
       Point sousePositio = getPosition(figureMoveDto.getSource());
       Point destiniPositio = getPosition(figureMoveDto.getSource());

       return sousePositio.x- sousePositio.y==destiniPositio.x-destiniPositio.y ||  sousePositio.x+ sousePositio.y==destiniPositio.x+destiniPositio.y;
   }
}
