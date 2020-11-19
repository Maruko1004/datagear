/*
 * Copyright (c) 2018 datagear.tech. All Rights Reserved.
 */

package org.datagear.analysis;

/**
 * 看板部件。
 * <p>
 * 它可在{@linkplain RenderContext}中渲染自己所描述的{@linkplain Dashboard}。
 * </p>
 * 
 * @author datagear@163.com
 *
 */
public interface DashboardWidget extends Identifiable
{
	/**
	 * 渲染{@linkplain Dashboard}。
	 * 
	 * @param renderContext
	 * @return
	 * @throws RenderException
	 */
	Dashboard render(RenderContext renderContext) throws RenderException;
}