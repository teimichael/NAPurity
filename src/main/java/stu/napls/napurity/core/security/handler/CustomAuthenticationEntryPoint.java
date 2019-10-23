package stu.napls.napurity.core.security.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Service;
import stu.napls.napurity.core.response.Response;
import stu.napls.napurity.core.exception.TokenException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service("customAuthenticationEntryPoint")
public class CustomAuthenticationEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException, TokenException {
        this.returnJson(response, exception);
    }

    private void returnJson(HttpServletResponse response, AuthenticationException exception) throws IOException {
        // Here it could be HttpServletResponse.SC_FORBIDDEN
        response.setStatus(HttpServletResponse.SC_OK);
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().println(mapper.writeValueAsString(Response.failure(HttpServletResponse.SC_FORBIDDEN, exception.getMessage())));
    }
}
