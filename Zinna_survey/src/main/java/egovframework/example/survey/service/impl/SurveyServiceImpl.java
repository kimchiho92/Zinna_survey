package egovframework.example.survey.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.impl.SampleDAO;
import egovframework.example.survey.service.SurveyDefaultVO;
import egovframework.example.survey.service.SurveyService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("surveyService")
public class SurveyServiceImpl extends EgovAbstractServiceImpl implements SurveyService {

	
	@Resource(name = "surveyListDAO")
	private SurveyListDAO surveyListDAO;
	
	@Override
	public List<?> selectSurveyList(SurveyDefaultVO searchVO) throws Exception {
		return surveyListDAO.selectSurveyList(searchVO);
	}

}
