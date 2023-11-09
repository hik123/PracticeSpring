package com.green.practicespring.board;


import com.green.practicespring.board.model.BoardDetailVo;
import com.green.practicespring.board.model.BoardInsDto;
import com.green.practicespring.board.model.BoardUpdDto;
import com.green.practicespring.board.model.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper  // Mapper 지정
public interface BoardMapper {
    List<BoardVo> selBoardList();

    BoardDetailVo selBoardById(int iboard); //  정수iboard 값 받아서 그 값의레코드만 출력

    int insBoard(BoardInsDto dto);

    int delBoard(int iboard);

    int updBoard(BoardUpdDto dto);



}
