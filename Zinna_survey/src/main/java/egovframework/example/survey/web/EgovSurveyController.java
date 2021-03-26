package egovframework.example.survey.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springmodules.validation.commons.DefaultBeanValidator;

import egovframework.example.survey.service.SurveyDefaultVO;
import egovframework.example.survey.service.SurveyService;
import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

/**
 * @Class Name : EgovSampleController.java
 * @Description : EgovSample Controller Class
 * @Modification Information
 * @
 * @  수정일      수정자              수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2009.03.16           최초생성
 *
 * @author 개발프레임웍크 실행환경 개발팀
 * @since 2009. 03.16
 * @version 1.0
 * @see
 *
 *  Copyright (C) by MOPAS All right reserved.
 */
@Controller
public class EgovSurveyController {
	
	
	/** EgovSampleService */
	@Resource(name = "surveyService")
	private SurveyService surveyService;
	
	/** EgovPropertyService */
	@Resource(name = "propertiesService")
	protected EgovPropertyService propertiesService;

	/** Validator */
	@Resource(name = "beanValidator")
	protected DefaultBeanValidator beanValidator;
	
	
	/**
	 * 글 목록을 조회한다. (pageing)
	 * @param searchVO - 조회할 정보가 담긴 SurveyDefaultVO
	 * @param model
	 * @return "survey/list"
	 * @exception Exception
	 */
	
	@RequestMapping(value = "/surveyList.do")
	public String selectSurveyList(@ModelAttribute("searchVO") SurveyDefaultVO searchVO, ModelMap model) throws Exception {
		
		List<?> surveyList = surveyService.selectSurveyList(searchVO);
		model.addAttribute("resultList", surveyList);
		
		
		return "survey/list";
	}
}
