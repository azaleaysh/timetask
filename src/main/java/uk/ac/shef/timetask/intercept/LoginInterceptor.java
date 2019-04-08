package uk.ac.shef.timetask.intercept;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import uk.ac.shef.timetask.util.HttpUtil;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                if ("tokenId".equals(cookie.getName())) {
                    String param = "cookieName=tokenId&cookieValue=" + cookie.getValue();
                    String result = HttpUtil.sendPost("http://127.0.0.1:8080/login/authcookies", param);
                    boolean auth  = Boolean.valueOf(result);
                    if (auth) {
                        return true;
                    }
                    break;
                }
            }
        }
        response.sendRedirect("/login?url=" + request.getRequestURL());
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
