package com.git.original.server;

/**
 * 网络会话处理器接口
 * 
 * @author linaoxiang
 */
public interface ISessionHandler {
	/**
	 * 连接打开
	 * 
	 * @throws Exception
	 */
	void connectionOpened() throws Exception;

	/**
	 * 连接断开
	 * 
	 * @throws Exception
	 */
	void connectionClosed() throws Exception;

	/**
	 * 连接空闲超时
	 * <p>
	 * 只有在READ和WRITE都超时时才会被触发
	 * 
	 * @throws Exception
	 */
	void connectionIdle() throws Exception;

	/**
	 * 数据到达
	 * 
	 * @param message
	 *            数据
	 * @throws Exception
	 */
	void messageReceived(Object message) throws Exception;
}
