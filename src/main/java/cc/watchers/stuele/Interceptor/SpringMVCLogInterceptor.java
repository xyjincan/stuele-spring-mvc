package cc.watchers.stuele.Interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class SpringMVCLogInterceptor implements HandlerInterceptor {

    //error>warn>info>debug
    private static final Logger logger = LoggerFactory.getLogger(SpringMVCLogInterceptor.class);


    
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        if(request.getQueryString()==null){
            logger.info("preHandle request: " + request.getRequestURI());
        }else{
            logger.info("preHandle request: " + request.getRequestURI()+"?"+request.getQueryString());
        }
        return true;

        //http://localhost:8080/CarsiLogCenter_new/idpstat.jsp?nn=22
        //http://localhost:8080/CarsiLogCenter_new/idpstat?nn=22
/*        request.getRequestURI();  //CarsiLogCenter_new/idpstat.jsp
        request.getContextPath(); //CarsiLogCenter_new
        request.getServletPath(); //idpstat.jsp
        request.getQueryString(); //action=idp.sptopn

        System.err.println("1"+request.getContextPath());// ""
        System.err.println("2"+request.getRequestURI());//  "/CarsiLogCenter_new/idpstat"
        System.err.println("3"+request.getServletPath());// "/CarsiLogCenter_new/idpstat"*/
    }


    
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

    }


    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
            throws Exception {

    }

}