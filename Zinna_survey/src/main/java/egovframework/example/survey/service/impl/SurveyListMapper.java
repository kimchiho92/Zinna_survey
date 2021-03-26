package egovframework.example.survey.service.impl;

import java.util.List;

import egovframework.example.sample.service.SampleDefaultVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("surveyListMapper")
public interface SurveyListMapper {

	
	
	/**
	 * 글 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return 글 목록
	 * @exception Exception
	 */
	List<?> selectSampleList(SampleDefaultVO searchVO) throws Exception;
}
