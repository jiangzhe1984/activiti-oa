package org.crazyit.activiti.oa.action;

import org.activiti.engine.repository.ProcessDefinition;
import org.crazyit.activiti.oa.service.ProcessDefinitionService;

import java.util.List;

public class ProcessDefinitionAction extends BaseAction {

	private ProcessDefinitionService processDefinitionService;
	
	private List<ProcessDefinition> defs;
	
	public List<ProcessDefinition> getDefs() {
		return this.defs;
	}

	public void setProcessDefinitionService(
			ProcessDefinitionService processDefinitionService) {
		this.processDefinitionService = processDefinitionService;
	}
	
	public String list() {
		this.defs = this.processDefinitionService.list();
		return SUCCESS;
	}
}
