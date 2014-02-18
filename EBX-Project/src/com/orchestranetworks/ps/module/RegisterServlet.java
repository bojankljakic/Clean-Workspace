/*
 * Copyright Orchestra Networks 2000-2008. All rights reserved.
 */
package com.orchestranetworks.ps.module;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 */
public class RegisterServlet extends HttpServlet
{
	public void init(ServletConfig config) throws ServletException
	{
		// Small change to test forks
		super.init(config);
		ModulesRegister.registerWebApp(this, config);
	}
	public void destroy()
	{
		ModulesRegister.unregisterWebApp(this, this.getServletConfig());
	}
}