package com.sample;

import org.activiti.engine.EngineServices;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;

public class AutoListener implements ExecutionListener {

	/**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 */
	private static final long serialVersionUID = 8855662713779080668L;

	@Override
	public void notify(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		EngineServices engineServices = execution.getEngineServices();
		RuntimeService runtimeService = engineServices.getRuntimeService();
		runtimeService.signal(execution.getId());
	}

}
