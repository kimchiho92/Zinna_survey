package egovframework.example.survey.service;

public class SurveyListVO extends SurveyDefaultVO {
	private static final long serialVersionUID = 1L;
	
	private String surveyDescription;
	private String surveyId;
	private String surveyRegDt;
	private String surveyRegUser;
	private String surveyState;
	private String surveyTitle;	
	private String surveyUpdateDt;
	
	public String getSurveyDescription() {
		return surveyDescription;
	}
	public void setSurveyDescription(String surveyDescription) {
		this.surveyDescription = surveyDescription;
	}
	public String getSurveyId() {
		return surveyId;
	}
	public void setSurveyId(String surveyId) {
		this.surveyId = surveyId;
	}
	public String getSurveyRegDt() {
		return surveyRegDt;
	}
	public void setSurveyRegDt(String surveyRegDt) {
		this.surveyRegDt = surveyRegDt;
	}
	public String getSurveyRegUser() {
		return surveyRegUser;
	}
	public void setSurveyRegUser(String surveyRegUser) {
		this.surveyRegUser = surveyRegUser;
	}
	public String getSurveyState() {
		return surveyState;
	}
	public void setSurveyState(String surveyState) {
		this.surveyState = surveyState;
	}
	public String getSurveyTitle() {
		return surveyTitle;
	}
	public void setSurveyTitle(String surveyTitle) {
		this.surveyTitle = surveyTitle;
	}
	public String getSurveyUpdateDt() {
		return surveyUpdateDt;
	}
	public void setSurveyUpdateDt(String surveyUpdateDt) {
		this.surveyUpdateDt = surveyUpdateDt;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
