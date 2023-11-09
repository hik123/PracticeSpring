package com.green.practicespring.board;

import com.green.practicespring.ResVo;
import com.green.practicespring.board.model.BoardDetailVo;
import com.green.practicespring.board.model.BoardInsDto;
import com.green.practicespring.board.model.BoardVo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class BoardController {

    @Autowired
    private final BoardService service;

    @GetMapping("/board")
    public List<BoardVo> getBoard() {
        return service.getBoard();
    }

    @GetMapping("/board/{iboard}")
    public BoardDetailVo selBoardById(@PathVariable int iboard) {
        return service.selBoardById(iboard);
    }

    @PostMapping("/board")
    public ResVo postBoard(@RequestBody BoardInsDto dto) {
        System.out.println(dto);
        int result = service.postBoard(dto);
        System.out.println(result);
        return new ResVo(result);
    }



    @DeleteMapping("/board/{iboard}")
    public ResVo delBoard(@PathVariable int iboard) {
        int result = service.delBoard(iboard);
        return new ResVo(result);
    }


}
