package egovframework.example.survey.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.example.survey.service.SurveyDefaultVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("surveyListDAO")
public class SurveyListDAO extends EgovAbstractDAO{

	public List<?> selectSurveyList(SurveyDefaultVO searchVO) {
		return list("surveyListDAO.selectSurveyList", searchVO);
	}

}
