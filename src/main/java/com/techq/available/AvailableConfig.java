package com.techq.available;

import java.util.concurrent.TimeUnit;

/**
 * 
 * @author CHQ
 * 2012-2-3
 */
public class AvailableConfig {
	public final static int syncTick = 2;
	public final static int tickTime = 1000;
	
	public final static int connectedTick = 5;
	
	
	
	/**
	 * for follower
	 */
	public final static int pollTimeout = 200;
	public final static TimeUnit pollTimeUnit = TimeUnit.MILLISECONDS;
	public final static int wakeUpTimeout = 200;
	public final static int followTimeOut = 1000;
	public final static int followFailedCntLimit = 1;
	
	
	
	
	
	/**
	 * ping port
	 */
	public final static int HEARTBEAT_PORT = 7919;
	
	
	/**
	 */
	
	
	
}
