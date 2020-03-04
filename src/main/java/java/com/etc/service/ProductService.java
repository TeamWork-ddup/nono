package java.com.etc.service;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    static Logger logger = Logger.getLogger( UserService.class );
    public void add(){
        logger.debug( "---->商品添加业务" );
    }

}
