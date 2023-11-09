package com.green.practicespring.board;

import com.green.practicespring.ResVo;
import com.green.practicespring.board.model.BoardDetailVo;
import com.green.practicespring.board.model.BoardInsDto;
import com.green.practicespring.board.model.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper mapper;

    public List<BoardVo> getBoard() {
        return mapper.selBoardList();
    }

    public BoardDetailVo selBoardById(int iboard) {
        return mapper.selBoardById(iboard);
    }

    public int postBoard(BoardInsDto dto) {
        return mapper.insBoard(dto);
    }

    public int delBoard(int iboard) {
        return mapper.delBoard(iboard);
    }
}
