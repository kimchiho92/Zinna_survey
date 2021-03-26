package egovframework.example.survey.service;

import java.util.List;

public interface SurveyService {

	
	
	/**
	 * 글 목록을 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return 글 목록
	 * @exception Exception
	 */
	List<?> selectSurveyList(SurveyDefaultVO searchVO) throws Exception;

}
