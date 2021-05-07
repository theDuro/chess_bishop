package pl.edu.pwsztar.planist;

import pl.edu.pwsztar.domain.dto.FigureMoveDto;
import pl.edu.pwsztar.domain.enums.FigureType;

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
   public boolean itIsCorectMove(FigureMoveDto figureMoveDto){
       int sousceX =  chessMoveMap.get(figureMoveDto.getSource().substring(0,1));
       int destinationX = chessMoveMap.get(figureMoveDto.getDestination().substring(0,1));
       int sousceY =  chessMoveMap.get(figureMoveDto.getSource().substring(2,3));
       int destinationY = chessMoveMap.get(figureMoveDto.getDestination().substring(2,3));
        System.out.println("dziłąm");
       return sousceX-sousceY==destinationX-destinationY || destinationX+destinationY==sousceY+sousceY;
   }
}
