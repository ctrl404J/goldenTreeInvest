package com.goldenTree.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.goldenTree.dto.JongtoBoardDto;

@Service
public interface InvestService {
	
	public List<JongtoBoardDto> getJongtoList(int pageSize, int pageNum);

	public void insertJongto(JongtoBoardDto jongtoBoardDto);

	public JongtoBoardDto detailJongto(Integer jongtoId, Integer jongtoViews);
	
	void updateJongtoViews(Integer jongtoId, Integer views);
	
	public int deleteJongto(String jongtoId, String jongtoPass);

	public int countJongtoBoard();
	
}
