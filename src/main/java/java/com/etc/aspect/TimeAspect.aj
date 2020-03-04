package java.com.etc.aspect;

import org.apache.log4j.Logger;

public class TimeAspect {
    static Logger logger = Logger.getLogger( TimeAspect.class );
    public void beforeMethod(){
        logger.debug( "开始时间："+System.currentTimeMillis() );

    }

    public void afterMethod(){
        logger.debug( "结束时间："+System.currentTimeMillis() );
    }
}
